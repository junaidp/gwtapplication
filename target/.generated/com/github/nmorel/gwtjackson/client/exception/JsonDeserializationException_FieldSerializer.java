package com.github.nmorel.gwtjackson.client.exception;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class JsonDeserializationException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException instance) throws SerializationException {
    
    com.github.nmorel.gwtjackson.client.exception.JsonMappingException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException instance) throws SerializationException {
    
    com.github.nmorel.gwtjackson.client.exception.JsonMappingException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException_FieldSerializer.deserialize(reader, (com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException_FieldSerializer.serialize(writer, (com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException)object);
  }
  
}
