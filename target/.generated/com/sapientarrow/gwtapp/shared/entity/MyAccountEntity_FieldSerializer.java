package com.sapientarrow.gwtapp.shared.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MyAccountEntity_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getLastEdited(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::lastEdited;
  }-*/;
  
  private static native void setLastEdited(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance, java.util.Date value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::lastEdited = value;
  }-*/;
  
  private static native boolean getMonthlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::monthlyPaymentPlan;
  }-*/;
  
  private static native void setMonthlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::monthlyPaymentPlan = value;
  }-*/;
  
  private static native int getMyAccountId(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::myAccountId;
  }-*/;
  
  private static native void setMyAccountId(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::myAccountId = value;
  }-*/;
  
  private static native boolean getQuarterlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::quarterlyPaymentPlan;
  }-*/;
  
  private static native void setQuarterlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::quarterlyPaymentPlan = value;
  }-*/;
  
  private static native java.lang.String getRegisteredTo(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::registeredTo;
  }-*/;
  
  private static native void setRegisteredTo(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::registeredTo = value;
  }-*/;
  
  private static native boolean getYearlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::yearlyPaymentPlan;
  }-*/;
  
  private static native void setYearlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::yearlyPaymentPlan = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setLastEdited(instance, (java.util.Date) streamReader.readObject());
    setMonthlyPaymentPlan(instance, streamReader.readBoolean());
    setMyAccountId(instance, streamReader.readInt());
    setQuarterlyPaymentPlan(instance, streamReader.readBoolean());
    setRegisteredTo(instance, streamReader.readString());
    setYearlyPaymentPlan(instance, streamReader.readBoolean());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.entity.MyAccountEntity();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.entity.MyAccountEntity instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeObject(getLastEdited(instance));
    streamWriter.writeBoolean(getMonthlyPaymentPlan(instance));
    streamWriter.writeInt(getMyAccountId(instance));
    streamWriter.writeBoolean(getQuarterlyPaymentPlan(instance));
    streamWriter.writeString(getRegisteredTo(instance));
    streamWriter.writeBoolean(getYearlyPaymentPlan(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.entity.MyAccountEntity_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.MyAccountEntity_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.entity.MyAccountEntity)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.MyAccountEntity_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.entity.MyAccountEntity)object);
  }
  
}
