package com.google.gwt.user.client.rpc.core.java.lang.reflect;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class InvocationTargetException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, java.lang.reflect.InvocationTargetException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static java.lang.reflect.InvocationTargetException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new java.lang.reflect.InvocationTargetException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, java.lang.reflect.InvocationTargetException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.user.client.rpc.core.java.lang.reflect.InvocationTargetException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.reflect.InvocationTargetException_FieldSerializer.deserialize(reader, (java.lang.reflect.InvocationTargetException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.reflect.InvocationTargetException_FieldSerializer.serialize(writer, (java.lang.reflect.InvocationTargetException)object);
  }
  
}
