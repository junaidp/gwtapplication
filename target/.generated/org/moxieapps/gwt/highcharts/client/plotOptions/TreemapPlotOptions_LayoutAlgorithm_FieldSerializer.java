package org.moxieapps.gwt.highcharts.client.plotOptions;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TreemapPlotOptions_LayoutAlgorithm_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getOptionValue(org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutAlgorithm instance) /*-{
    return instance.@org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions$LayoutAlgorithm::optionValue;
  }-*/;
  
  private static native void setOptionValue(org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutAlgorithm instance, java.lang.String value) 
  /*-{
    instance.@org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions$LayoutAlgorithm::optionValue = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutAlgorithm instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutAlgorithm instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutAlgorithm[] values = org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutAlgorithm.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutAlgorithm instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutAlgorithm_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutAlgorithm_FieldSerializer.deserialize(reader, (org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutAlgorithm)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutAlgorithm_FieldSerializer.serialize(writer, (org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutAlgorithm)object);
  }
  
}
