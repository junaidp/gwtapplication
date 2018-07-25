package org.moxieapps.gwt.highcharts.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Axis_TickPosition_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.moxieapps.gwt.highcharts.client.Axis.TickPosition instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.moxieapps.gwt.highcharts.client.Axis.TickPosition instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.moxieapps.gwt.highcharts.client.Axis.TickPosition[] values = org.moxieapps.gwt.highcharts.client.Axis.TickPosition.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.moxieapps.gwt.highcharts.client.Axis.TickPosition instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.moxieapps.gwt.highcharts.client.Axis_TickPosition_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.Axis_TickPosition_FieldSerializer.deserialize(reader, (org.moxieapps.gwt.highcharts.client.Axis.TickPosition)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.Axis_TickPosition_FieldSerializer.serialize(writer, (org.moxieapps.gwt.highcharts.client.Axis.TickPosition)object);
  }
  
}