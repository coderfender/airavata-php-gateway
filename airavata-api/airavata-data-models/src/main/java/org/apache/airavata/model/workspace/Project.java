/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.workspace;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-02-24")
public class Project implements org.apache.thrift.TBase<Project, Project._Fields>, java.io.Serializable, Cloneable, Comparable<Project> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Project");

  private static final org.apache.thrift.protocol.TField PROJECT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("projectID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OWNER_FIELD_DESC = new org.apache.thrift.protocol.TField("owner", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CREATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("creationTime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField SHARED_USERS_FIELD_DESC = new org.apache.thrift.protocol.TField("sharedUsers", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField SHARED_GROUPS_FIELD_DESC = new org.apache.thrift.protocol.TField("sharedGroups", org.apache.thrift.protocol.TType.LIST, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProjectStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProjectTupleSchemeFactory());
  }

  private String projectID; // required
  private String owner; // required
  private String name; // required
  private String description; // optional
  private long creationTime; // optional
  private List<String> sharedUsers; // optional
  private List<String> sharedGroups; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROJECT_ID((short)1, "projectID"),
    OWNER((short)2, "owner"),
    NAME((short)3, "name"),
    DESCRIPTION((short)4, "description"),
    CREATION_TIME((short)5, "creationTime"),
    SHARED_USERS((short)6, "sharedUsers"),
    SHARED_GROUPS((short)7, "sharedGroups");

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
        case 1: // PROJECT_ID
          return PROJECT_ID;
        case 2: // OWNER
          return OWNER;
        case 3: // NAME
          return NAME;
        case 4: // DESCRIPTION
          return DESCRIPTION;
        case 5: // CREATION_TIME
          return CREATION_TIME;
        case 6: // SHARED_USERS
          return SHARED_USERS;
        case 7: // SHARED_GROUPS
          return SHARED_GROUPS;
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
  private static final int __CREATIONTIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DESCRIPTION,_Fields.CREATION_TIME,_Fields.SHARED_USERS,_Fields.SHARED_GROUPS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROJECT_ID, new org.apache.thrift.meta_data.FieldMetaData("projectID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OWNER, new org.apache.thrift.meta_data.FieldMetaData("owner", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("creationTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SHARED_USERS, new org.apache.thrift.meta_data.FieldMetaData("sharedUsers", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SHARED_GROUPS, new org.apache.thrift.meta_data.FieldMetaData("sharedGroups", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Project.class, metaDataMap);
  }

  public Project() {
    this.projectID = "DO_NOT_SET_AT_CLIENTS";

  }

  public Project(
    String projectID,
    String owner,
    String name)
  {
    this();
    this.projectID = projectID;
    this.owner = owner;
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Project(Project other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProjectID()) {
      this.projectID = other.projectID;
    }
    if (other.isSetOwner()) {
      this.owner = other.owner;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    this.creationTime = other.creationTime;
    if (other.isSetSharedUsers()) {
      List<String> __this__sharedUsers = new ArrayList<String>(other.sharedUsers);
      this.sharedUsers = __this__sharedUsers;
    }
    if (other.isSetSharedGroups()) {
      List<String> __this__sharedGroups = new ArrayList<String>(other.sharedGroups);
      this.sharedGroups = __this__sharedGroups;
    }
  }

  public Project deepCopy() {
    return new Project(this);
  }

  @Override
  public void clear() {
    this.projectID = "DO_NOT_SET_AT_CLIENTS";

    this.owner = null;
    this.name = null;
    this.description = null;
    setCreationTimeIsSet(false);
    this.creationTime = 0;
    this.sharedUsers = null;
    this.sharedGroups = null;
  }

  public String getProjectID() {
    return this.projectID;
  }

  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }

  public void unsetProjectID() {
    this.projectID = null;
  }

  /** Returns true if field projectID is set (has been assigned a value) and false otherwise */
  public boolean isSetProjectID() {
    return this.projectID != null;
  }

  public void setProjectIDIsSet(boolean value) {
    if (!value) {
      this.projectID = null;
    }
  }

  public String getOwner() {
    return this.owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void unsetOwner() {
    this.owner = null;
  }

  /** Returns true if field owner is set (has been assigned a value) and false otherwise */
  public boolean isSetOwner() {
    return this.owner != null;
  }

  public void setOwnerIsSet(boolean value) {
    if (!value) {
      this.owner = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public long getCreationTime() {
    return this.creationTime;
  }

  public void setCreationTime(long creationTime) {
    this.creationTime = creationTime;
    setCreationTimeIsSet(true);
  }

  public void unsetCreationTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  /** Returns true if field creationTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreationTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  public void setCreationTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATIONTIME_ISSET_ID, value);
  }

  public int getSharedUsersSize() {
    return (this.sharedUsers == null) ? 0 : this.sharedUsers.size();
  }

  public java.util.Iterator<String> getSharedUsersIterator() {
    return (this.sharedUsers == null) ? null : this.sharedUsers.iterator();
  }

  public void addToSharedUsers(String elem) {
    if (this.sharedUsers == null) {
      this.sharedUsers = new ArrayList<String>();
    }
    this.sharedUsers.add(elem);
  }

  public List<String> getSharedUsers() {
    return this.sharedUsers;
  }

  public void setSharedUsers(List<String> sharedUsers) {
    this.sharedUsers = sharedUsers;
  }

  public void unsetSharedUsers() {
    this.sharedUsers = null;
  }

  /** Returns true if field sharedUsers is set (has been assigned a value) and false otherwise */
  public boolean isSetSharedUsers() {
    return this.sharedUsers != null;
  }

  public void setSharedUsersIsSet(boolean value) {
    if (!value) {
      this.sharedUsers = null;
    }
  }

  public int getSharedGroupsSize() {
    return (this.sharedGroups == null) ? 0 : this.sharedGroups.size();
  }

  public java.util.Iterator<String> getSharedGroupsIterator() {
    return (this.sharedGroups == null) ? null : this.sharedGroups.iterator();
  }

  public void addToSharedGroups(String elem) {
    if (this.sharedGroups == null) {
      this.sharedGroups = new ArrayList<String>();
    }
    this.sharedGroups.add(elem);
  }

  public List<String> getSharedGroups() {
    return this.sharedGroups;
  }

  public void setSharedGroups(List<String> sharedGroups) {
    this.sharedGroups = sharedGroups;
  }

  public void unsetSharedGroups() {
    this.sharedGroups = null;
  }

  /** Returns true if field sharedGroups is set (has been assigned a value) and false otherwise */
  public boolean isSetSharedGroups() {
    return this.sharedGroups != null;
  }

  public void setSharedGroupsIsSet(boolean value) {
    if (!value) {
      this.sharedGroups = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROJECT_ID:
      if (value == null) {
        unsetProjectID();
      } else {
        setProjectID((String)value);
      }
      break;

    case OWNER:
      if (value == null) {
        unsetOwner();
      } else {
        setOwner((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    case CREATION_TIME:
      if (value == null) {
        unsetCreationTime();
      } else {
        setCreationTime((Long)value);
      }
      break;

    case SHARED_USERS:
      if (value == null) {
        unsetSharedUsers();
      } else {
        setSharedUsers((List<String>)value);
      }
      break;

    case SHARED_GROUPS:
      if (value == null) {
        unsetSharedGroups();
      } else {
        setSharedGroups((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROJECT_ID:
      return getProjectID();

    case OWNER:
      return getOwner();

    case NAME:
      return getName();

    case DESCRIPTION:
      return getDescription();

    case CREATION_TIME:
      return getCreationTime();

    case SHARED_USERS:
      return getSharedUsers();

    case SHARED_GROUPS:
      return getSharedGroups();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROJECT_ID:
      return isSetProjectID();
    case OWNER:
      return isSetOwner();
    case NAME:
      return isSetName();
    case DESCRIPTION:
      return isSetDescription();
    case CREATION_TIME:
      return isSetCreationTime();
    case SHARED_USERS:
      return isSetSharedUsers();
    case SHARED_GROUPS:
      return isSetSharedGroups();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Project)
      return this.equals((Project)that);
    return false;
  }

  public boolean equals(Project that) {
    if (that == null)
      return false;

    boolean this_present_projectID = true && this.isSetProjectID();
    boolean that_present_projectID = true && that.isSetProjectID();
    if (this_present_projectID || that_present_projectID) {
      if (!(this_present_projectID && that_present_projectID))
        return false;
      if (!this.projectID.equals(that.projectID))
        return false;
    }

    boolean this_present_owner = true && this.isSetOwner();
    boolean that_present_owner = true && that.isSetOwner();
    if (this_present_owner || that_present_owner) {
      if (!(this_present_owner && that_present_owner))
        return false;
      if (!this.owner.equals(that.owner))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_creationTime = true && this.isSetCreationTime();
    boolean that_present_creationTime = true && that.isSetCreationTime();
    if (this_present_creationTime || that_present_creationTime) {
      if (!(this_present_creationTime && that_present_creationTime))
        return false;
      if (this.creationTime != that.creationTime)
        return false;
    }

    boolean this_present_sharedUsers = true && this.isSetSharedUsers();
    boolean that_present_sharedUsers = true && that.isSetSharedUsers();
    if (this_present_sharedUsers || that_present_sharedUsers) {
      if (!(this_present_sharedUsers && that_present_sharedUsers))
        return false;
      if (!this.sharedUsers.equals(that.sharedUsers))
        return false;
    }

    boolean this_present_sharedGroups = true && this.isSetSharedGroups();
    boolean that_present_sharedGroups = true && that.isSetSharedGroups();
    if (this_present_sharedGroups || that_present_sharedGroups) {
      if (!(this_present_sharedGroups && that_present_sharedGroups))
        return false;
      if (!this.sharedGroups.equals(that.sharedGroups))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_projectID = true && (isSetProjectID());
    list.add(present_projectID);
    if (present_projectID)
      list.add(projectID);

    boolean present_owner = true && (isSetOwner());
    list.add(present_owner);
    if (present_owner)
      list.add(owner);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_description = true && (isSetDescription());
    list.add(present_description);
    if (present_description)
      list.add(description);

    boolean present_creationTime = true && (isSetCreationTime());
    list.add(present_creationTime);
    if (present_creationTime)
      list.add(creationTime);

    boolean present_sharedUsers = true && (isSetSharedUsers());
    list.add(present_sharedUsers);
    if (present_sharedUsers)
      list.add(sharedUsers);

    boolean present_sharedGroups = true && (isSetSharedGroups());
    list.add(present_sharedGroups);
    if (present_sharedGroups)
      list.add(sharedGroups);

    return list.hashCode();
  }

  @Override
  public int compareTo(Project other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProjectID()).compareTo(other.isSetProjectID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProjectID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.projectID, other.projectID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOwner()).compareTo(other.isSetOwner());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwner()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.owner, other.owner);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreationTime()).compareTo(other.isSetCreationTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreationTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creationTime, other.creationTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSharedUsers()).compareTo(other.isSetSharedUsers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSharedUsers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sharedUsers, other.sharedUsers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSharedGroups()).compareTo(other.isSetSharedGroups());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSharedGroups()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sharedGroups, other.sharedGroups);
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
    StringBuilder sb = new StringBuilder("Project(");
    boolean first = true;

    sb.append("projectID:");
    if (this.projectID == null) {
      sb.append("null");
    } else {
      sb.append(this.projectID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("owner:");
    if (this.owner == null) {
      sb.append("null");
    } else {
      sb.append(this.owner);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (isSetDescription()) {
      if (!first) sb.append(", ");
      sb.append("description:");
      if (this.description == null) {
        sb.append("null");
      } else {
        sb.append(this.description);
      }
      first = false;
    }
    if (isSetCreationTime()) {
      if (!first) sb.append(", ");
      sb.append("creationTime:");
      sb.append(this.creationTime);
      first = false;
    }
    if (isSetSharedUsers()) {
      if (!first) sb.append(", ");
      sb.append("sharedUsers:");
      if (this.sharedUsers == null) {
        sb.append("null");
      } else {
        sb.append(this.sharedUsers);
      }
      first = false;
    }
    if (isSetSharedGroups()) {
      if (!first) sb.append(", ");
      sb.append("sharedGroups:");
      if (this.sharedGroups == null) {
        sb.append("null");
      } else {
        sb.append(this.sharedGroups);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetProjectID()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'projectID' is unset! Struct:" + toString());
    }

    if (!isSetOwner()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'owner' is unset! Struct:" + toString());
    }

    if (!isSetName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

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

  private static class ProjectStandardSchemeFactory implements SchemeFactory {
    public ProjectStandardScheme getScheme() {
      return new ProjectStandardScheme();
    }
  }

  private static class ProjectStandardScheme extends StandardScheme<Project> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Project struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROJECT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.projectID = iprot.readString();
              struct.setProjectIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OWNER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.owner = iprot.readString();
              struct.setOwnerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CREATION_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.creationTime = iprot.readI64();
              struct.setCreationTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SHARED_USERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.sharedUsers = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.sharedUsers.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setSharedUsersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SHARED_GROUPS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.sharedGroups = new ArrayList<String>(_list3.size);
                String _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readString();
                  struct.sharedGroups.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setSharedGroupsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Project struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.projectID != null) {
        oprot.writeFieldBegin(PROJECT_ID_FIELD_DESC);
        oprot.writeString(struct.projectID);
        oprot.writeFieldEnd();
      }
      if (struct.owner != null) {
        oprot.writeFieldBegin(OWNER_FIELD_DESC);
        oprot.writeString(struct.owner);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.description != null) {
        if (struct.isSetDescription()) {
          oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.description);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCreationTime()) {
        oprot.writeFieldBegin(CREATION_TIME_FIELD_DESC);
        oprot.writeI64(struct.creationTime);
        oprot.writeFieldEnd();
      }
      if (struct.sharedUsers != null) {
        if (struct.isSetSharedUsers()) {
          oprot.writeFieldBegin(SHARED_USERS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.sharedUsers.size()));
            for (String _iter6 : struct.sharedUsers)
            {
              oprot.writeString(_iter6);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.sharedGroups != null) {
        if (struct.isSetSharedGroups()) {
          oprot.writeFieldBegin(SHARED_GROUPS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.sharedGroups.size()));
            for (String _iter7 : struct.sharedGroups)
            {
              oprot.writeString(_iter7);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProjectTupleSchemeFactory implements SchemeFactory {
    public ProjectTupleScheme getScheme() {
      return new ProjectTupleScheme();
    }
  }

  private static class ProjectTupleScheme extends TupleScheme<Project> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Project struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.projectID);
      oprot.writeString(struct.owner);
      oprot.writeString(struct.name);
      BitSet optionals = new BitSet();
      if (struct.isSetDescription()) {
        optionals.set(0);
      }
      if (struct.isSetCreationTime()) {
        optionals.set(1);
      }
      if (struct.isSetSharedUsers()) {
        optionals.set(2);
      }
      if (struct.isSetSharedGroups()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetCreationTime()) {
        oprot.writeI64(struct.creationTime);
      }
      if (struct.isSetSharedUsers()) {
        {
          oprot.writeI32(struct.sharedUsers.size());
          for (String _iter8 : struct.sharedUsers)
          {
            oprot.writeString(_iter8);
          }
        }
      }
      if (struct.isSetSharedGroups()) {
        {
          oprot.writeI32(struct.sharedGroups.size());
          for (String _iter9 : struct.sharedGroups)
          {
            oprot.writeString(_iter9);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Project struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.projectID = iprot.readString();
      struct.setProjectIDIsSet(true);
      struct.owner = iprot.readString();
      struct.setOwnerIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.creationTime = iprot.readI64();
        struct.setCreationTimeIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.sharedUsers = new ArrayList<String>(_list10.size);
          String _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = iprot.readString();
            struct.sharedUsers.add(_elem11);
          }
        }
        struct.setSharedUsersIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.sharedGroups = new ArrayList<String>(_list13.size);
          String _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readString();
            struct.sharedGroups.add(_elem14);
          }
        }
        struct.setSharedGroupsIsSet(true);
      }
    }
  }

}

