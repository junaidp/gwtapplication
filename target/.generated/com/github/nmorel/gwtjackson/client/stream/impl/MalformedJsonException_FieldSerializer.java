package com.github.nmorel.gwtjackson.client.stream.impl;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MalformedJsonException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException instance) throws SerializationException {
    
    com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException instantiate(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException::new()();
  }-*/;
  
  public static void serialize(SerializationStreamWriter streamWriter, com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException instance) throws SerializationException {
    
    com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException_FieldSerializer.deserialize(reader, (com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException_FieldSerializer.serialize(writer, (com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException)object);
  }
  
}
