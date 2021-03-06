package com.ambiata.ivory.storage.metadata

import com.ambiata.mundane.control.{RIO, ResultT}
import com.ambiata.notion.core.Location

import scalaz.effect.IO
import scalaz.{Value => _, _}, Scalaz._
import com.ambiata.mundane.parse._
import com.ambiata.ivory.core._

object DictionaryTextStorage extends TextStorage[(FeatureId, ConcreteDefinition), Dictionary] {

  val DELIM = "|"

  def fromList(entries: List[(FeatureId, ConcreteDefinition)]): ValidationNel[String, Dictionary] =
    Validation.success(Dictionary(entries.map(f => Concrete(f._1, f._2))))

  def toList(d: Dictionary): List[(FeatureId, ConcreteDefinition)] =
    d.definitions.flatMap {
      case Concrete(fid, m) =>
        Some(fid -> m)
      // V1 never handled virtual features, and never will
      case Virtual(_, _) =>
        None
    }

  def dictionaryFromIvoryLocation(location: IvoryLocation): RIO[Dictionary] =
    fromIvoryLocation(location).map(Dictionary.reduce)

  def parseLine(i: Int, e: String): ValidationNel[String, (FeatureId, ConcreteDefinition)] =
    parseDictionaryEntry(e).toValidationNel

  def toLine(f: (FeatureId, ConcreteDefinition)): String =
    delimitedLineWithDelim(f, DELIM)

  def delimitedLineWithDelim(f: (FeatureId, ConcreteDefinition), delim: String): String =
    f._1.toString(DELIM) + DELIM + metaToString(f._2, DELIM)

  private def metaToString(meta: ConcreteDefinition, delim: String): String = {
    import meta._
    s"${Encoding.render(encoding)}${delim}${ty.map(Type.render).getOrElse("")}${delim}${desc}${delim}${tombstoneValue.mkString(",")}"
  }

  def parseDictionaryEntry(entry: String): Validation[String, (FeatureId, ConcreteDefinition)] = {
    import ListParser._
    val parser: ListParser[(FeatureId, ConcreteDefinition)] = for {
      namespace <- Namespace.listParser
      name      <- string
      encoding  <- for {
        s <- string
        r <- value(parseEncoding(s))
      } yield r
      ty        <- for {
        s <- string
        r <- value(parseType(s))
      } yield r
      desc      <- string
      tombstone <- string
    } yield (FeatureId(namespace, name), ConcreteDefinition(encoding.toEncoding, Mode.State, Some(ty), desc, Delimited.parseCsv(tombstone)))
    parser.run(Delimited.parsePsv(entry))
  }

  def parseEncoding(s: String): Validation[String, PrimitiveEncoding] =
    s match {
      case "boolean"    => BooleanEncoding.success
      case "int"        => IntEncoding.success
      case "long"       => LongEncoding.success
      case "double"     => DoubleEncoding.success
      case "string"     => StringEncoding.success
      case "date"       => DateEncoding.success
      case otherwise    => s"""not a valid encoding: '$s'""".failure
    }

  def parseType(s: String): Validation[String, Type] =
    s match {
      case "numerical"    => NumericalType.success
      case "continuous"   => ContinuousType.success
      case "categorical"  => CategoricalType.success
      case "binary"       => BinaryType.success
      case otherwise      => s"not a valid feature type: '$s'".failure
    }

}
