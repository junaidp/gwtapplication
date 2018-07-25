package com.google.gwt.user.client.rpc.core.java.util;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UUID_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getUuidValue(java.util.UUID instance) /*-{
    return instance.@java.util.UUID::uuidValue;
  }-*/;
  
  private static native void setUuidValue(java.util.UUID instance, java.lang.String value) 
  /*-{
    instance.@java.util.UUID::uuidValue = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, java.util.UUID instance) throws SerializationException {
    setUuidValue(instance, streamReader.readString());
    
  }
  
  public static native java.util.UUID instantiate(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.UUID::new()();
  }-*/;
  
  public static void serialize(SerializationStreamWriter streamWriter, java.util.UUID instance) throws SerializationException {
    streamWriter.writeString(getUuidValue(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.user.client.rpc.core.java.util.UUID_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.util.UUID_FieldSerializer.deserialize(reader, (java.util.UUID)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.util.UUID_FieldSerializer.serialize(writer, (java.util.UUID)object);
  }
  
}
