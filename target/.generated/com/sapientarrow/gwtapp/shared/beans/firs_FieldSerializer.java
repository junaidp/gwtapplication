package com.sapientarrow.gwtapp.shared.beans;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class firs_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getId(com.sapientarrow.gwtapp.shared.beans.firs instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.beans.firs::id;
  }-*/;
  
  private static native void setId(com.sapientarrow.gwtapp.shared.beans.firs instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.beans.firs::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.sapientarrow.gwtapp.shared.beans.firs instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.beans.firs::name;
  }-*/;
  
  private static native void setName(com.sapientarrow.gwtapp.shared.beans.firs instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.beans.firs::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.beans.firs instance) throws SerializationException {
    setId(instance, streamReader.readInt());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.beans.firs instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.beans.firs();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.beans.firs instance) throws SerializationException {
    streamWriter.writeInt(getId(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.beans.firs_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.beans.firs_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.beans.firs)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.beans.firs_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.beans.firs)object);
  }
  
}
