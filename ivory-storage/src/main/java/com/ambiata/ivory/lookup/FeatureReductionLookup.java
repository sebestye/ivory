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

public class FeatureReductionLookup implements org.apache.thrift.TBase<FeatureReductionLookup, FeatureReductionLookup._Fields>, java.io.Serializable, Cloneable, Comparable<FeatureReductionLookup> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FeatureReductionLookup");

  private static final org.apache.thrift.protocol.TField REDUCTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("reductions", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FeatureReductionLookupStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FeatureReductionLookupTupleSchemeFactory());
  }

  public Map<Integer,List<FeatureReduction>> reductions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REDUCTIONS((short)1, "reductions");

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
        case 1: // REDUCTIONS
          return REDUCTIONS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REDUCTIONS, new org.apache.thrift.meta_data.FieldMetaData("reductions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FeatureReduction.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FeatureReductionLookup.class, metaDataMap);
  }

  public FeatureReductionLookup() {
  }

  public FeatureReductionLookup(
    Map<Integer,List<FeatureReduction>> reductions)
  {
    this();
    this.reductions = reductions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FeatureReductionLookup(FeatureReductionLookup other) {
    if (other.isSetReductions()) {
      Map<Integer,List<FeatureReduction>> __this__reductions = new HashMap<Integer,List<FeatureReduction>>(other.reductions.size());
      for (Map.Entry<Integer, List<FeatureReduction>> other_element : other.reductions.entrySet()) {

        Integer other_element_key = other_element.getKey();
        List<FeatureReduction> other_element_value = other_element.getValue();

        Integer __this__reductions_copy_key = other_element_key;

        List<FeatureReduction> __this__reductions_copy_value = new ArrayList<FeatureReduction>(other_element_value.size());
        for (FeatureReduction other_element_value_element : other_element_value) {
          __this__reductions_copy_value.add(new FeatureReduction(other_element_value_element));
        }

        __this__reductions.put(__this__reductions_copy_key, __this__reductions_copy_value);
      }
      this.reductions = __this__reductions;
    }
  }

  public FeatureReductionLookup deepCopy() {
    return new FeatureReductionLookup(this);
  }

  @Override
  public void clear() {
    this.reductions = null;
  }

  public int getReductionsSize() {
    return (this.reductions == null) ? 0 : this.reductions.size();
  }

  public void putToReductions(int key, List<FeatureReduction> val) {
    if (this.reductions == null) {
      this.reductions = new HashMap<Integer,List<FeatureReduction>>();
    }
    this.reductions.put(key, val);
  }

  public Map<Integer,List<FeatureReduction>> getReductions() {
    return this.reductions;
  }

  public FeatureReductionLookup setReductions(Map<Integer,List<FeatureReduction>> reductions) {
    this.reductions = reductions;
    return this;
  }

  public void unsetReductions() {
    this.reductions = null;
  }

  /** Returns true if field reductions is set (has been assigned a value) and false otherwise */
  public boolean isSetReductions() {
    return this.reductions != null;
  }

  public void setReductionsIsSet(boolean value) {
    if (!value) {
      this.reductions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REDUCTIONS:
      if (value == null) {
        unsetReductions();
      } else {
        setReductions((Map<Integer,List<FeatureReduction>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REDUCTIONS:
      return getReductions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REDUCTIONS:
      return isSetReductions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FeatureReductionLookup)
      return this.equals((FeatureReductionLookup)that);
    return false;
  }

  public boolean equals(FeatureReductionLookup that) {
    if (that == null)
      return false;

    boolean this_present_reductions = true && this.isSetReductions();
    boolean that_present_reductions = true && that.isSetReductions();
    if (this_present_reductions || that_present_reductions) {
      if (!(this_present_reductions && that_present_reductions))
        return false;
      if (!this.reductions.equals(that.reductions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(FeatureReductionLookup other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReductions()).compareTo(other.isSetReductions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReductions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reductions, other.reductions);
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
    StringBuilder sb = new StringBuilder("FeatureReductionLookup(");
    boolean first = true;

    sb.append("reductions:");
    if (this.reductions == null) {
      sb.append("null");
    } else {
      sb.append(this.reductions);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FeatureReductionLookupStandardSchemeFactory implements SchemeFactory {
    public FeatureReductionLookupStandardScheme getScheme() {
      return new FeatureReductionLookupStandardScheme();
    }
  }

  private static class FeatureReductionLookupStandardScheme extends StandardScheme<FeatureReductionLookup> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FeatureReductionLookup struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REDUCTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map80 = iprot.readMapBegin();
                struct.reductions = new HashMap<Integer,List<FeatureReduction>>(2*_map80.size);
                for (int _i81 = 0; _i81 < _map80.size; ++_i81)
                {
                  int _key82;
                  List<FeatureReduction> _val83;
                  _key82 = iprot.readI32();
                  {
                    org.apache.thrift.protocol.TList _list84 = iprot.readListBegin();
                    _val83 = new ArrayList<FeatureReduction>(_list84.size);
                    for (int _i85 = 0; _i85 < _list84.size; ++_i85)
                    {
                      FeatureReduction _elem86;
                      _elem86 = new FeatureReduction();
                      _elem86.read(iprot);
                      _val83.add(_elem86);
                    }
                    iprot.readListEnd();
                  }
                  struct.reductions.put(_key82, _val83);
                }
                iprot.readMapEnd();
              }
              struct.setReductionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FeatureReductionLookup struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.reductions != null) {
        oprot.writeFieldBegin(REDUCTIONS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.LIST, struct.reductions.size()));
          for (Map.Entry<Integer, List<FeatureReduction>> _iter87 : struct.reductions.entrySet())
          {
            oprot.writeI32(_iter87.getKey());
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter87.getValue().size()));
              for (FeatureReduction _iter88 : _iter87.getValue())
              {
                _iter88.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FeatureReductionLookupTupleSchemeFactory implements SchemeFactory {
    public FeatureReductionLookupTupleScheme getScheme() {
      return new FeatureReductionLookupTupleScheme();
    }
  }

  private static class FeatureReductionLookupTupleScheme extends TupleScheme<FeatureReductionLookup> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FeatureReductionLookup struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReductions()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetReductions()) {
        {
          oprot.writeI32(struct.reductions.size());
          for (Map.Entry<Integer, List<FeatureReduction>> _iter89 : struct.reductions.entrySet())
          {
            oprot.writeI32(_iter89.getKey());
            {
              oprot.writeI32(_iter89.getValue().size());
              for (FeatureReduction _iter90 : _iter89.getValue())
              {
                _iter90.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FeatureReductionLookup struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map91 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.reductions = new HashMap<Integer,List<FeatureReduction>>(2*_map91.size);
          for (int _i92 = 0; _i92 < _map91.size; ++_i92)
          {
            int _key93;
            List<FeatureReduction> _val94;
            _key93 = iprot.readI32();
            {
              org.apache.thrift.protocol.TList _list95 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val94 = new ArrayList<FeatureReduction>(_list95.size);
              for (int _i96 = 0; _i96 < _list95.size; ++_i96)
              {
                FeatureReduction _elem97;
                _elem97 = new FeatureReduction();
                _elem97.read(iprot);
                _val94.add(_elem97);
              }
            }
            struct.reductions.put(_key93, _val94);
          }
        }
        struct.setReductionsIsSet(true);
      }
    }
  }

}

