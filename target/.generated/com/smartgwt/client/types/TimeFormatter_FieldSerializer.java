package com.smartgwt.client.types;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TimeFormatter_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getValue(com.smartgwt.client.types.TimeFormatter instance) /*-{
    return instance.@com.smartgwt.client.types.TimeFormatter::value;
  }-*/;
  
  private static native void setValue(com.smartgwt.client.types.TimeFormatter instance, java.lang.String value) 
  /*-{
    instance.@com.smartgwt.client.types.TimeFormatter::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.smartgwt.client.types.TimeFormatter instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.smartgwt.client.types.TimeFormatter instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.smartgwt.client.types.TimeFormatter[] values = com.smartgwt.client.types.TimeFormatter.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.smartgwt.client.types.TimeFormatter instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.smartgwt.client.types.TimeFormatter_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.smartgwt.client.types.TimeFormatter_FieldSerializer.deserialize(reader, (com.smartgwt.client.types.TimeFormatter)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.smartgwt.client.types.TimeFormatter_FieldSerializer.serialize(writer, (com.smartgwt.client.types.TimeFormatter)object);
  }
  
}
