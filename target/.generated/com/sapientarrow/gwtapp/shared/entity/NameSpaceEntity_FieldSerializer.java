package com.sapientarrow.gwtapp.shared.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class NameSpaceEntity_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getNameSpaceId(com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity::nameSpaceId;
  }-*/;
  
  private static native void setNameSpaceId(com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity::nameSpaceId = value;
  }-*/;
  
  private static native java.lang.String getNameSpaceName(com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity::nameSpaceName;
  }-*/;
  
  private static native void setNameSpaceName(com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity::nameSpaceName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setNameSpaceId(instance, streamReader.readInt());
    setNameSpaceName(instance, streamReader.readString());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeInt(getNameSpaceId(instance));
    streamWriter.writeString(getNameSpaceName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity)object);
  }
  
}
