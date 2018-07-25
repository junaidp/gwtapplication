package com.sapientarrow.gwtapp.shared.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Beans_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getBeanId(com.sapientarrow.gwtapp.shared.entity.Beans instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.Beans::beanId;
  }-*/;
  
  private static native void setBeanId(com.sapientarrow.gwtapp.shared.entity.Beans instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.Beans::beanId = value;
  }-*/;
  
  private static native java.lang.String getName(com.sapientarrow.gwtapp.shared.entity.Beans instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.Beans::name;
  }-*/;
  
  private static native void setName(com.sapientarrow.gwtapp.shared.entity.Beans instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.Beans::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.entity.Beans instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setBeanId(instance, streamReader.readInt());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.entity.Beans instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.entity.Beans();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.entity.Beans instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeInt(getBeanId(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.entity.Beans_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.Beans_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.entity.Beans)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.Beans_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.entity.Beans)object);
  }
  
}
