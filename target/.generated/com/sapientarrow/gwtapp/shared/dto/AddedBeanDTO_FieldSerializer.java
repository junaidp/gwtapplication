package com.sapientarrow.gwtapp.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AddedBeanDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getBeanName(com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::beanName;
  }-*/;
  
  private static native void setBeanName(com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::beanName = value;
  }-*/;
  
  private static native java.util.ArrayList getListAnnotationsDTO(com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::listAnnotationsDTO;
  }-*/;
  
  private static native void setListAnnotationsDTO(com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance, java.util.ArrayList value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::listAnnotationsDTO = value;
  }-*/;
  
  private static native java.util.ArrayList getListImports(com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::listImports;
  }-*/;
  
  private static native void setListImports(com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance, java.util.ArrayList value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::listImports = value;
  }-*/;
  
  private static native java.util.ArrayList getListProperties(com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::listProperties;
  }-*/;
  
  private static native void setListProperties(com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance, java.util.ArrayList value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::listProperties = value;
  }-*/;
  
  private static native java.lang.String getPackageName(com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::packageName;
  }-*/;
  
  private static native void setPackageName(com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::packageName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance) throws SerializationException {
    setBeanName(instance, streamReader.readString());
    setListAnnotationsDTO(instance, (java.util.ArrayList) streamReader.readObject());
    setListImports(instance, (java.util.ArrayList) streamReader.readObject());
    setListProperties(instance, (java.util.ArrayList) streamReader.readObject());
    setPackageName(instance, streamReader.readString());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO instance) throws SerializationException {
    streamWriter.writeString(getBeanName(instance));
    streamWriter.writeObject(getListAnnotationsDTO(instance));
    streamWriter.writeObject(getListImports(instance));
    streamWriter.writeObject(getListProperties(instance));
    streamWriter.writeString(getPackageName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO)object);
  }
  
}
