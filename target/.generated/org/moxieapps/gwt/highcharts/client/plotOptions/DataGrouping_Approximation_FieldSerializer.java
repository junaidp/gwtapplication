package org.moxieapps.gwt.highcharts.client.plotOptions;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DataGrouping_Approximation_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping.Approximation instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping.Approximation instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping.Approximation[] values = org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping.Approximation.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping.Approximation instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping_Approximation_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping_Approximation_FieldSerializer.deserialize(reader, (org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping.Approximation)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping_Approximation_FieldSerializer.serialize(writer, (org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping.Approximation)object);
  }
  
}
