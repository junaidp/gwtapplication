package com.sapientarrow.gwtapp.shared.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UserEntity_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getAdmin(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::admin;
  }-*/;
  
  private static native void setAdmin(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::admin = value;
  }-*/;
  
  private static native java.lang.String getEmail(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::email;
  }-*/;
  
  private static native void setEmail(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::email = value;
  }-*/;
  
  private static native com.sapientarrow.gwtapp.shared.entity.MyAccountEntity getMyAccountId(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::myAccountId;
  }-*/;
  
  private static native void setMyAccountId(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, com.sapientarrow.gwtapp.shared.entity.MyAccountEntity value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::myAccountId = value;
  }-*/;
  
  private static native java.lang.String getName(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::name;
  }-*/;
  
  private static native void setName(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::name = value;
  }-*/;
  
  private static native java.lang.String getPassword(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::password;
  }-*/;
  
  private static native void setPassword(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::password = value;
  }-*/;
  
  private static native int getStatus(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::status;
  }-*/;
  
  private static native void setStatus(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::status = value;
  }-*/;
  
  private static native java.lang.String getToken(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::token;
  }-*/;
  
  private static native void setToken(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::token = value;
  }-*/;
  
  private static native java.util.Date getTokenGeneratedDate(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::tokenGeneratedDate;
  }-*/;
  
  private static native void setTokenGeneratedDate(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, java.util.Date value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::tokenGeneratedDate = value;
  }-*/;
  
  private static native java.lang.String getUserFetchStatus(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::userFetchStatus;
  }-*/;
  
  private static native void setUserFetchStatus(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::userFetchStatus = value;
  }-*/;
  
  private static native int getUserId(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::userId;
  }-*/;
  
  private static native void setUserId(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::userId = value;
  }-*/;
  
  private static native java.lang.String getUserName(com.sapientarrow.gwtapp.shared.entity.UserEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::userName;
  }-*/;
  
  private static native void setUserName(com.sapientarrow.gwtapp.shared.entity.UserEntity instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.UserEntity::userName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.entity.UserEntity instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setAdmin(instance, streamReader.readBoolean());
    setEmail(instance, streamReader.readString());
    setMyAccountId(instance, (com.sapientarrow.gwtapp.shared.entity.MyAccountEntity) streamReader.readObject());
    setName(instance, streamReader.readString());
    setPassword(instance, streamReader.readString());
    setStatus(instance, streamReader.readInt());
    setToken(instance, streamReader.readString());
    setTokenGeneratedDate(instance, (java.util.Date) streamReader.readObject());
    setUserFetchStatus(instance, streamReader.readString());
    setUserId(instance, streamReader.readInt());
    setUserName(instance, streamReader.readString());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.entity.UserEntity instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.entity.UserEntity();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.entity.UserEntity instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeBoolean(getAdmin(instance));
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeObject(getMyAccountId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeInt(getStatus(instance));
    streamWriter.writeString(getToken(instance));
    streamWriter.writeObject(getTokenGeneratedDate(instance));
    streamWriter.writeString(getUserFetchStatus(instance));
    streamWriter.writeInt(getUserId(instance));
    streamWriter.writeString(getUserName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.entity.UserEntity_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.UserEntity_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.entity.UserEntity)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.UserEntity_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.entity.UserEntity)object);
  }
  
}
