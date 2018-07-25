package org.moxieapps.gwt.highcharts.client.labels;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PlotLineLabel_VerticalAlign_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel.VerticalAlign instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel.VerticalAlign instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel.VerticalAlign[] values = org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel.VerticalAlign.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel.VerticalAlign instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_VerticalAlign_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_VerticalAlign_FieldSerializer.deserialize(reader, (org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel.VerticalAlign)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_VerticalAlign_FieldSerializer.serialize(writer, (org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel.VerticalAlign)object);
  }
  
}
