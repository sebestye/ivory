/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ambiata.ivory.lookup;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThriftCategoricalStats implements org.apache.thrift.TBase<ThriftCategoricalStats, ThriftCategoricalStats._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftCategoricalStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftCategoricalStats");

  private static final org.apache.thrift.protocol.TField CATEGORIES_FIELD_DESC = new org.apache.thrift.protocol.TField("categories", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField HISTOGRAM_FIELD_DESC = new org.apache.thrift.protocol.TField("histogram", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftCategoricalStatsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftCategoricalStatsTupleSchemeFactory());
  }

  public short categories; // required
  public List<ThriftHistogramEntry> histogram; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CATEGORIES((short)1, "categories"),
    HISTOGRAM((short)2, "histogram");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CATEGORIES
          return CATEGORIES;
        case 2: // HISTOGRAM
          return HISTOGRAM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CATEGORIES_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CATEGORIES, new org.apache.thrift.meta_data.FieldMetaData("categories", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.HISTOGRAM, new org.apache.thrift.meta_data.FieldMetaData("histogram", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftHistogramEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftCategoricalStats.class, metaDataMap);
  }

  public ThriftCategoricalStats() {
  }

  public ThriftCategoricalStats(
    short categories,
    List<ThriftHistogramEntry> histogram)
  {
    this();
    this.categories = categories;
    setCategoriesIsSet(true);
    this.histogram = histogram;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftCategoricalStats(ThriftCategoricalStats other) {
    __isset_bitfield = other.__isset_bitfield;
    this.categories = other.categories;
    if (other.isSetHistogram()) {
      List<ThriftHistogramEntry> __this__histogram = new ArrayList<ThriftHistogramEntry>(other.histogram.size());
      for (ThriftHistogramEntry other_element : other.histogram) {
        __this__histogram.add(new ThriftHistogramEntry(other_element));
      }
      this.histogram = __this__histogram;
    }
  }

  public ThriftCategoricalStats deepCopy() {
    return new ThriftCategoricalStats(this);
  }

  @Override
  public void clear() {
    setCategoriesIsSet(false);
    this.categories = 0;
    this.histogram = null;
  }

  public short getCategories() {
    return this.categories;
  }

  public ThriftCategoricalStats setCategories(short categories) {
    this.categories = categories;
    setCategoriesIsSet(true);
    return this;
  }

  public void unsetCategories() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CATEGORIES_ISSET_ID);
  }

  /** Returns true if field categories is set (has been assigned a value) and false otherwise */
  public boolean isSetCategories() {
    return EncodingUtils.testBit(__isset_bitfield, __CATEGORIES_ISSET_ID);
  }

  public void setCategoriesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CATEGORIES_ISSET_ID, value);
  }

  public int getHistogramSize() {
    return (this.histogram == null) ? 0 : this.histogram.size();
  }

  public java.util.Iterator<ThriftHistogramEntry> getHistogramIterator() {
    return (this.histogram == null) ? null : this.histogram.iterator();
  }

  public void addToHistogram(ThriftHistogramEntry elem) {
    if (this.histogram == null) {
      this.histogram = new ArrayList<ThriftHistogramEntry>();
    }
    this.histogram.add(elem);
  }

  public List<ThriftHistogramEntry> getHistogram() {
    return this.histogram;
  }

  public ThriftCategoricalStats setHistogram(List<ThriftHistogramEntry> histogram) {
    this.histogram = histogram;
    return this;
  }

  public void unsetHistogram() {
    this.histogram = null;
  }

  /** Returns true if field histogram is set (has been assigned a value) and false otherwise */
  public boolean isSetHistogram() {
    return this.histogram != null;
  }

  public void setHistogramIsSet(boolean value) {
    if (!value) {
      this.histogram = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CATEGORIES:
      if (value == null) {
        unsetCategories();
      } else {
        setCategories((Short)value);
      }
      break;

    case HISTOGRAM:
      if (value == null) {
        unsetHistogram();
      } else {
        setHistogram((List<ThriftHistogramEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CATEGORIES:
      return Short.valueOf(getCategories());

    case HISTOGRAM:
      return getHistogram();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CATEGORIES:
      return isSetCategories();
    case HISTOGRAM:
      return isSetHistogram();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftCategoricalStats)
      return this.equals((ThriftCategoricalStats)that);
    return false;
  }

  public boolean equals(ThriftCategoricalStats that) {
    if (that == null)
      return false;

    boolean this_present_categories = true;
    boolean that_present_categories = true;
    if (this_present_categories || that_present_categories) {
      if (!(this_present_categories && that_present_categories))
        return false;
      if (this.categories != that.categories)
        return false;
    }

    boolean this_present_histogram = true && this.isSetHistogram();
    boolean that_present_histogram = true && that.isSetHistogram();
    if (this_present_histogram || that_present_histogram) {
      if (!(this_present_histogram && that_present_histogram))
        return false;
      if (!this.histogram.equals(that.histogram))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ThriftCategoricalStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCategories()).compareTo(other.isSetCategories());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategories()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.categories, other.categories);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHistogram()).compareTo(other.isSetHistogram());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHistogram()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.histogram, other.histogram);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftCategoricalStats(");
    boolean first = true;

    sb.append("categories:");
    sb.append(this.categories);
    first = false;
    if (!first) sb.append(", ");
    sb.append("histogram:");
    if (this.histogram == null) {
      sb.append("null");
    } else {
      sb.append(this.histogram);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftCategoricalStatsStandardSchemeFactory implements SchemeFactory {
    public ThriftCategoricalStatsStandardScheme getScheme() {
      return new ThriftCategoricalStatsStandardScheme();
    }
  }

  private static class ThriftCategoricalStatsStandardScheme extends StandardScheme<ThriftCategoricalStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftCategoricalStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CATEGORIES
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.categories = iprot.readI16();
              struct.setCategoriesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HISTOGRAM
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list122 = iprot.readListBegin();
                struct.histogram = new ArrayList<ThriftHistogramEntry>(_list122.size);
                for (int _i123 = 0; _i123 < _list122.size; ++_i123)
                {
                  ThriftHistogramEntry _elem124;
                  _elem124 = new ThriftHistogramEntry();
                  _elem124.read(iprot);
                  struct.histogram.add(_elem124);
                }
                iprot.readListEnd();
              }
              struct.setHistogramIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftCategoricalStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CATEGORIES_FIELD_DESC);
      oprot.writeI16(struct.categories);
      oprot.writeFieldEnd();
      if (struct.histogram != null) {
        oprot.writeFieldBegin(HISTOGRAM_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.histogram.size()));
          for (ThriftHistogramEntry _iter125 : struct.histogram)
          {
            _iter125.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftCategoricalStatsTupleSchemeFactory implements SchemeFactory {
    public ThriftCategoricalStatsTupleScheme getScheme() {
      return new ThriftCategoricalStatsTupleScheme();
    }
  }

  private static class ThriftCategoricalStatsTupleScheme extends TupleScheme<ThriftCategoricalStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftCategoricalStats struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCategories()) {
        optionals.set(0);
      }
      if (struct.isSetHistogram()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCategories()) {
        oprot.writeI16(struct.categories);
      }
      if (struct.isSetHistogram()) {
        {
          oprot.writeI32(struct.histogram.size());
          for (ThriftHistogramEntry _iter126 : struct.histogram)
          {
            _iter126.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftCategoricalStats struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.categories = iprot.readI16();
        struct.setCategoriesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list127 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.histogram = new ArrayList<ThriftHistogramEntry>(_list127.size);
          for (int _i128 = 0; _i128 < _list127.size; ++_i128)
          {
            ThriftHistogramEntry _elem129;
            _elem129 = new ThriftHistogramEntry();
            _elem129.read(iprot);
            struct.histogram.add(_elem129);
          }
        }
        struct.setHistogramIsSet(true);
      }
    }
  }

}

