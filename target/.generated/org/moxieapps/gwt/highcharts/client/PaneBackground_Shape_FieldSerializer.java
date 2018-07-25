package org.moxieapps.gwt.highcharts.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PaneBackground_Shape_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getOptionValue(org.moxieapps.gwt.highcharts.client.PaneBackground.Shape instance) /*-{
    return instance.@org.moxieapps.gwt.highcharts.client.PaneBackground$Shape::optionValue;
  }-*/;
  
  private static native void setOptionValue(org.moxieapps.gwt.highcharts.client.PaneBackground.Shape instance, java.lang.String value) 
  /*-{
    instance.@org.moxieapps.gwt.highcharts.client.PaneBackground$Shape::optionValue = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.moxieapps.gwt.highcharts.client.PaneBackground.Shape instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.moxieapps.gwt.highcharts.client.PaneBackground.Shape instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.moxieapps.gwt.highcharts.client.PaneBackground.Shape[] values = org.moxieapps.gwt.highcharts.client.PaneBackground.Shape.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.moxieapps.gwt.highcharts.client.PaneBackground.Shape instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.moxieapps.gwt.highcharts.client.PaneBackground_Shape_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.PaneBackground_Shape_FieldSerializer.deserialize(reader, (org.moxieapps.gwt.highcharts.client.PaneBackground.Shape)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.PaneBackground_Shape_FieldSerializer.serialize(writer, (org.moxieapps.gwt.highcharts.client.PaneBackground.Shape)object);
  }
  
}
