package com.sapientarrow.gwtapp.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BindingsDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getBeanId(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::beanId;
  }-*/;
  
  private static native void setBeanId(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::beanId = value;
  }-*/;
  
  private static native java.util.TreeMap getBeanPropertiesMap(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::beanPropertiesMap;
  }-*/;
  
  private static native void setBeanPropertiesMap(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance, java.util.TreeMap value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::beanPropertiesMap = value;
  }-*/;
  
  private static native int getBindingId(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::bindingId;
  }-*/;
  
  private static native void setBindingId(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::bindingId = value;
  }-*/;
  
  private static native java.lang.String getBindingName(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::bindingName;
  }-*/;
  
  private static native void setBindingName(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::bindingName = value;
  }-*/;
  
  private static native java.lang.String getBindingType(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::bindingType;
  }-*/;
  
  private static native void setBindingType(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::bindingType = value;
  }-*/;
  
  private static native java.lang.String getBindingValue(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::bindingValue;
  }-*/;
  
  private static native void setBindingValue(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::bindingValue = value;
  }-*/;
  
  private static native java.lang.String getBindingValue_ext(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::bindingValue_ext;
  }-*/;
  
  private static native void setBindingValue_ext(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::bindingValue_ext = value;
  }-*/;
  
  private static native com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity getNameSpaceId(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::nameSpaceId;
  }-*/;
  
  private static native void setNameSpaceId(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance, com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::nameSpaceId = value;
  }-*/;
  
  private static native char getType(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::type;
  }-*/;
  
  private static native void setType(com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance, char value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::type = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) throws SerializationException {
    setBeanId(instance, streamReader.readInt());
    setBeanPropertiesMap(instance, (java.util.TreeMap) streamReader.readObject());
    setBindingId(instance, streamReader.readInt());
    setBindingName(instance, streamReader.readString());
    setBindingType(instance, streamReader.readString());
    setBindingValue(instance, streamReader.readString());
    setBindingValue_ext(instance, streamReader.readString());
    setNameSpaceId(instance, (com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity) streamReader.readObject());
    setType(instance, streamReader.readChar());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.dto.BindingsDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.dto.BindingsDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.dto.BindingsDTO instance) throws SerializationException {
    streamWriter.writeInt(getBeanId(instance));
    streamWriter.writeObject(getBeanPropertiesMap(instance));
    streamWriter.writeInt(getBindingId(instance));
    streamWriter.writeString(getBindingName(instance));
    streamWriter.writeString(getBindingType(instance));
    streamWriter.writeString(getBindingValue(instance));
    streamWriter.writeString(getBindingValue_ext(instance));
    streamWriter.writeObject(getNameSpaceId(instance));
    streamWriter.writeChar(getType(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.dto.BindingsDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.BindingsDTO_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.dto.BindingsDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.BindingsDTO_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.dto.BindingsDTO)object);
  }
  
}
