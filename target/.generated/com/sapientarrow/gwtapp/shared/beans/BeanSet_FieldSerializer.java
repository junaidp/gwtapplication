package com.sapientarrow.gwtapp.shared.beans;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BeanSet_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAddress(com.sapientarrow.gwtapp.shared.beans.BeanSet instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.beans.BeanSet::address;
  }-*/;
  
  private static native void setAddress(com.sapientarrow.gwtapp.shared.beans.BeanSet instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.beans.BeanSet::address = value;
  }-*/;
  
  private static native int getId(com.sapientarrow.gwtapp.shared.beans.BeanSet instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.beans.BeanSet::id;
  }-*/;
  
  private static native void setId(com.sapientarrow.gwtapp.shared.beans.BeanSet instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.beans.BeanSet::id = value;
  }-*/;
  
  private static native com.sapientarrow.gwtapp.shared.entity.MyAccountEntity getMyAccount(com.sapientarrow.gwtapp.shared.beans.BeanSet instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.beans.BeanSet::myAccount;
  }-*/;
  
  private static native void setMyAccount(com.sapientarrow.gwtapp.shared.beans.BeanSet instance, com.sapientarrow.gwtapp.shared.entity.MyAccountEntity value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.beans.BeanSet::myAccount = value;
  }-*/;
  
  private static native java.lang.String getName(com.sapientarrow.gwtapp.shared.beans.BeanSet instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.beans.BeanSet::name;
  }-*/;
  
  private static native void setName(com.sapientarrow.gwtapp.shared.beans.BeanSet instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.beans.BeanSet::name = value;
  }-*/;
  
  private static native com.sapientarrow.gwtapp.shared.entity.UserEntity getUser(com.sapientarrow.gwtapp.shared.beans.BeanSet instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.beans.BeanSet::user;
  }-*/;
  
  private static native void setUser(com.sapientarrow.gwtapp.shared.beans.BeanSet instance, com.sapientarrow.gwtapp.shared.entity.UserEntity value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.beans.BeanSet::user = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.beans.BeanSet instance) throws SerializationException {
    setAddress(instance, streamReader.readString());
    setId(instance, streamReader.readInt());
    setMyAccount(instance, (com.sapientarrow.gwtapp.shared.entity.MyAccountEntity) streamReader.readObject());
    setName(instance, streamReader.readString());
    setUser(instance, (com.sapientarrow.gwtapp.shared.entity.UserEntity) streamReader.readObject());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.beans.BeanSet instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.beans.BeanSet();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.beans.BeanSet instance) throws SerializationException {
    streamWriter.writeString(getAddress(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeObject(getMyAccount(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getUser(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.beans.BeanSet_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.beans.BeanSet_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.beans.BeanSet)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.beans.BeanSet_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.beans.BeanSet)object);
  }
  
}
