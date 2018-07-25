package org.moxieapps.gwt.highcharts.client.plotOptions;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TreemapPlotOptions_LayoutStartingDirection_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getOptionValue(org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutStartingDirection instance) /*-{
    return instance.@org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions$LayoutStartingDirection::optionValue;
  }-*/;
  
  private static native void setOptionValue(org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutStartingDirection instance, java.lang.String value) 
  /*-{
    instance.@org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions$LayoutStartingDirection::optionValue = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutStartingDirection instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutStartingDirection instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutStartingDirection[] values = org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutStartingDirection.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutStartingDirection instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutStartingDirection_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutStartingDirection_FieldSerializer.deserialize(reader, (org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutStartingDirection)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutStartingDirection_FieldSerializer.serialize(writer, (org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutStartingDirection)object);
  }
  
}
