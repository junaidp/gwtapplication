package org.gwtbootstrap3.client.ui.constants;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ButtonGroupSize_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.gwtbootstrap3.client.ui.constants.ButtonGroupSize instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.gwtbootstrap3.client.ui.constants.ButtonGroupSize instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.gwtbootstrap3.client.ui.constants.ButtonGroupSize[] values = org.gwtbootstrap3.client.ui.constants.ButtonGroupSize.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.gwtbootstrap3.client.ui.constants.ButtonGroupSize instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.gwtbootstrap3.client.ui.constants.ButtonGroupSize_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.gwtbootstrap3.client.ui.constants.ButtonGroupSize_FieldSerializer.deserialize(reader, (org.gwtbootstrap3.client.ui.constants.ButtonGroupSize)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.gwtbootstrap3.client.ui.constants.ButtonGroupSize_FieldSerializer.serialize(writer, (org.gwtbootstrap3.client.ui.constants.ButtonGroupSize)object);
  }
  
}
