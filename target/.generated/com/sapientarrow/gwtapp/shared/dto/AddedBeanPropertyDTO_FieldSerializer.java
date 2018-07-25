package com.sapientarrow.gwtapp.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AddedBeanPropertyDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDataType(com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::dataType;
  }-*/;
  
  private static native void setDataType(com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::dataType = value;
  }-*/;
  
  private static native java.lang.String getGetterSetter(com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::getterSetter;
  }-*/;
  
  private static native void setGetterSetter(com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::getterSetter = value;
  }-*/;
  
  private static native java.util.ArrayList getListAnnotationsDTO(com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::listAnnotationsDTO;
  }-*/;
  
  private static native void setListAnnotationsDTO(com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance, java.util.ArrayList value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::listAnnotationsDTO = value;
  }-*/;
  
  private static native java.lang.String getModifier(com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::modifier;
  }-*/;
  
  private static native void setModifier(com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::modifier = value;
  }-*/;
  
  private static native java.lang.String getName(com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::name;
  }-*/;
  
  private static native void setName(com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance) throws SerializationException {
    setDataType(instance, streamReader.readString());
    setGetterSetter(instance, streamReader.readString());
    setListAnnotationsDTO(instance, (java.util.ArrayList) streamReader.readObject());
    setModifier(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO instance) throws SerializationException {
    streamWriter.writeString(getDataType(instance));
    streamWriter.writeString(getGetterSetter(instance));
    streamWriter.writeObject(getListAnnotationsDTO(instance));
    streamWriter.writeString(getModifier(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO)object);
  }
  
}
