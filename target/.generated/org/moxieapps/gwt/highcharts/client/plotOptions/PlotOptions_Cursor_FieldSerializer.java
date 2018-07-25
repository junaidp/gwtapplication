package org.moxieapps.gwt.highcharts.client.plotOptions;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PlotOptions_Cursor_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions.Cursor instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions.Cursor instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions.Cursor[] values = org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions.Cursor.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions.Cursor instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_Cursor_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_Cursor_FieldSerializer.deserialize(reader, (org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions.Cursor)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_Cursor_FieldSerializer.serialize(writer, (org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions.Cursor)object);
  }
  
}
