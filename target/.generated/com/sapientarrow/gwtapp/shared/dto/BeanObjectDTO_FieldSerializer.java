package com.sapientarrow.gwtapp.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BeanObjectDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getBeanId(com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO::beanId;
  }-*/;
  
  private static native void setBeanId(com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO::beanId = value;
  }-*/;
  
  private static native java.lang.String getBeanJson(com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO::beanJson;
  }-*/;
  
  private static native void setBeanJson(com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO::beanJson = value;
  }-*/;
  
  private static native java.lang.String getBeanName(com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO::beanName;
  }-*/;
  
  private static native void setBeanName(com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO::beanName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO instance) throws SerializationException {
    setBeanId(instance, streamReader.readInt());
    setBeanJson(instance, streamReader.readString());
    setBeanName(instance, streamReader.readString());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO instance) throws SerializationException {
    streamWriter.writeInt(getBeanId(instance));
    streamWriter.writeString(getBeanJson(instance));
    streamWriter.writeString(getBeanName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO)object);
  }
  
}
