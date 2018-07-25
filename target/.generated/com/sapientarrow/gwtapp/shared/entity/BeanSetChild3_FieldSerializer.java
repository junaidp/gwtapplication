package com.sapientarrow.gwtapp.shared.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BeanSetChild3_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getAdmin(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::admin;
  }-*/;
  
  private static native void setAdmin(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::admin = value;
  }-*/;
  
  private static native java.lang.String getEmail(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::email;
  }-*/;
  
  private static native void setEmail(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::email = value;
  }-*/;
  
  private static native com.sapientarrow.gwtapp.shared.entity.MyAccountEntity getMyAccountId(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::myAccountId;
  }-*/;
  
  private static native void setMyAccountId(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, com.sapientarrow.gwtapp.shared.entity.MyAccountEntity value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::myAccountId = value;
  }-*/;
  
  private static native java.lang.String getName(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::name;
  }-*/;
  
  private static native void setName(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::name = value;
  }-*/;
  
  private static native java.lang.String getPassword(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::password;
  }-*/;
  
  private static native void setPassword(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::password = value;
  }-*/;
  
  private static native int getStatus(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::status;
  }-*/;
  
  private static native void setStatus(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::status = value;
  }-*/;
  
  private static native java.lang.String getToken(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::token;
  }-*/;
  
  private static native void setToken(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::token = value;
  }-*/;
  
  private static native java.util.Date getTokenGeneratedDate(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::tokenGeneratedDate;
  }-*/;
  
  private static native void setTokenGeneratedDate(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, java.util.Date value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::tokenGeneratedDate = value;
  }-*/;
  
  private static native java.lang.String getUserFetchStatus(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::userFetchStatus;
  }-*/;
  
  private static native void setUserFetchStatus(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::userFetchStatus = value;
  }-*/;
  
  private static native int getUserId(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::userId;
  }-*/;
  
  private static native void setUserId(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::userId = value;
  }-*/;
  
  private static native java.lang.String getUserName(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::userName;
  }-*/;
  
  private static native void setUserName(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::userName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) throws SerializationException {
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
  
  public static com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.entity.BeanSetChild3();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.entity.BeanSetChild3 instance) throws SerializationException {
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
    return com.sapientarrow.gwtapp.shared.entity.BeanSetChild3_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.BeanSetChild3_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.entity.BeanSetChild3)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.BeanSetChild3_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.entity.BeanSetChild3)object);
  }
  
}
