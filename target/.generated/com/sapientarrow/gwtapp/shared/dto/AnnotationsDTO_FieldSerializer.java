package com.sapientarrow.gwtapp.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AnnotationsDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAnnotationText(com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO::annotationText;
  }-*/;
  
  private static native void setAnnotationText(com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO::annotationText = value;
  }-*/;
  
  private static native java.lang.String getImportClass(com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO::importClass;
  }-*/;
  
  private static native void setImportClass(com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO::importClass = value;
  }-*/;
  
  private static native java.lang.String getName(com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO::name;
  }-*/;
  
  private static native void setName(com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO instance) throws SerializationException {
    setAnnotationText(instance, streamReader.readString());
    setImportClass(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO instance) throws SerializationException {
    streamWriter.writeString(getAnnotationText(instance));
    streamWriter.writeString(getImportClass(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO)object);
  }
  
}
