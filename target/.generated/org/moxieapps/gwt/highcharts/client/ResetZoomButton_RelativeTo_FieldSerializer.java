package org.moxieapps.gwt.highcharts.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ResetZoomButton_RelativeTo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.moxieapps.gwt.highcharts.client.ResetZoomButton.RelativeTo instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.moxieapps.gwt.highcharts.client.ResetZoomButton.RelativeTo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.moxieapps.gwt.highcharts.client.ResetZoomButton.RelativeTo[] values = org.moxieapps.gwt.highcharts.client.ResetZoomButton.RelativeTo.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.moxieapps.gwt.highcharts.client.ResetZoomButton.RelativeTo instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.moxieapps.gwt.highcharts.client.ResetZoomButton_RelativeTo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.ResetZoomButton_RelativeTo_FieldSerializer.deserialize(reader, (org.moxieapps.gwt.highcharts.client.ResetZoomButton.RelativeTo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.ResetZoomButton_RelativeTo_FieldSerializer.serialize(writer, (org.moxieapps.gwt.highcharts.client.ResetZoomButton.RelativeTo)object);
  }
  
}
