package com.sapientarrow.gwtapp.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BeanExceptionDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getBean(com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO::bean;
  }-*/;
  
  private static native void setBean(com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO::bean = value;
  }-*/;
  
  private static native java.lang.String getExpecting(com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO::expecting;
  }-*/;
  
  private static native void setExpecting(com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO::expecting = value;
  }-*/;
  
  private static native java.lang.String getField(com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO::field;
  }-*/;
  
  private static native void setField(com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO::field = value;
  }-*/;
  
  private static native java.lang.String getReceiving(com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO::receiving;
  }-*/;
  
  private static native void setReceiving(com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO::receiving = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instance) throws SerializationException {
    setBean(instance, streamReader.readString());
    setExpecting(instance, streamReader.readString());
    setField(instance, streamReader.readString());
    setReceiving(instance, streamReader.readString());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO instance) throws SerializationException {
    streamWriter.writeString(getBean(instance));
    streamWriter.writeString(getExpecting(instance));
    streamWriter.writeString(getField(instance));
    streamWriter.writeString(getReceiving(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO)object);
  }
  
}
