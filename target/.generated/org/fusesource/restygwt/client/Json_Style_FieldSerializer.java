package org.fusesource.restygwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Json_Style_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.fusesource.restygwt.client.Json.Style instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.fusesource.restygwt.client.Json.Style instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.fusesource.restygwt.client.Json.Style[] values = org.fusesource.restygwt.client.Json.Style.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.fusesource.restygwt.client.Json.Style instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.fusesource.restygwt.client.Json_Style_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.fusesource.restygwt.client.Json_Style_FieldSerializer.deserialize(reader, (org.fusesource.restygwt.client.Json.Style)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.fusesource.restygwt.client.Json_Style_FieldSerializer.serialize(writer, (org.fusesource.restygwt.client.Json.Style)object);
  }
  
}
