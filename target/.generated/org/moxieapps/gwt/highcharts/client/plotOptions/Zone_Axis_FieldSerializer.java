package org.moxieapps.gwt.highcharts.client.plotOptions;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Zone_Axis_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getOptionValue(org.moxieapps.gwt.highcharts.client.plotOptions.Zone.Axis instance) /*-{
    return instance.@org.moxieapps.gwt.highcharts.client.plotOptions.Zone$Axis::optionValue;
  }-*/;
  
  private static native void setOptionValue(org.moxieapps.gwt.highcharts.client.plotOptions.Zone.Axis instance, java.lang.String value) 
  /*-{
    instance.@org.moxieapps.gwt.highcharts.client.plotOptions.Zone$Axis::optionValue = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.moxieapps.gwt.highcharts.client.plotOptions.Zone.Axis instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.moxieapps.gwt.highcharts.client.plotOptions.Zone.Axis instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.moxieapps.gwt.highcharts.client.plotOptions.Zone.Axis[] values = org.moxieapps.gwt.highcharts.client.plotOptions.Zone.Axis.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.moxieapps.gwt.highcharts.client.plotOptions.Zone.Axis instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.moxieapps.gwt.highcharts.client.plotOptions.Zone_Axis_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.plotOptions.Zone_Axis_FieldSerializer.deserialize(reader, (org.moxieapps.gwt.highcharts.client.plotOptions.Zone.Axis)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.plotOptions.Zone_Axis_FieldSerializer.serialize(writer, (org.moxieapps.gwt.highcharts.client.plotOptions.Zone.Axis)object);
  }
  
}
