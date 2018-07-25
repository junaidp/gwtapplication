package com.github.nmorel.gwtjackson.client.stream;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class JsonToken_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.github.nmorel.gwtjackson.client.stream.JsonToken instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.github.nmorel.gwtjackson.client.stream.JsonToken instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.github.nmorel.gwtjackson.client.stream.JsonToken[] values = com.github.nmorel.gwtjackson.client.stream.JsonToken.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.github.nmorel.gwtjackson.client.stream.JsonToken instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.github.nmorel.gwtjackson.client.stream.JsonToken_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.github.nmorel.gwtjackson.client.stream.JsonToken_FieldSerializer.deserialize(reader, (com.github.nmorel.gwtjackson.client.stream.JsonToken)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.github.nmorel.gwtjackson.client.stream.JsonToken_FieldSerializer.serialize(writer, (com.github.nmorel.gwtjackson.client.stream.JsonToken)object);
  }
  
}
