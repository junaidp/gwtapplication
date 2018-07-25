package gwtupload.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class IFileInput_FileInputType_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, gwtupload.client.IFileInput.FileInputType instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static gwtupload.client.IFileInput.FileInputType instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    gwtupload.client.IFileInput.FileInputType[] values = gwtupload.client.IFileInput.FileInputType.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, gwtupload.client.IFileInput.FileInputType instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return gwtupload.client.IFileInput_FileInputType_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    gwtupload.client.IFileInput_FileInputType_FieldSerializer.deserialize(reader, (gwtupload.client.IFileInput.FileInputType)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    gwtupload.client.IFileInput_FileInputType_FieldSerializer.serialize(writer, (gwtupload.client.IFileInput.FileInputType)object);
  }
  
}
