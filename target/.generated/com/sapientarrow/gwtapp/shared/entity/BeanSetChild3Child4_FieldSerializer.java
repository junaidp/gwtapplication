package com.sapientarrow.gwtapp.shared.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BeanSetChild3Child4_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getLastEdited(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::lastEdited;
  }-*/;
  
  private static native void setLastEdited(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance, java.util.Date value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::lastEdited = value;
  }-*/;
  
  private static native boolean getMonthlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::monthlyPaymentPlan;
  }-*/;
  
  private static native void setMonthlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::monthlyPaymentPlan = value;
  }-*/;
  
  private static native int getMyAccountId(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::myAccountId;
  }-*/;
  
  private static native void setMyAccountId(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::myAccountId = value;
  }-*/;
  
  private static native boolean getQuarterlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::quarterlyPaymentPlan;
  }-*/;
  
  private static native void setQuarterlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::quarterlyPaymentPlan = value;
  }-*/;
  
  private static native java.lang.String getRegisteredTo(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::registeredTo;
  }-*/;
  
  private static native void setRegisteredTo(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::registeredTo = value;
  }-*/;
  
  private static native boolean getYearlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::yearlyPaymentPlan;
  }-*/;
  
  private static native void setYearlyPaymentPlan(com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::yearlyPaymentPlan = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance) throws SerializationException {
    setLastEdited(instance, (java.util.Date) streamReader.readObject());
    setMonthlyPaymentPlan(instance, streamReader.readBoolean());
    setMyAccountId(instance, streamReader.readInt());
    setQuarterlyPaymentPlan(instance, streamReader.readBoolean());
    setRegisteredTo(instance, streamReader.readString());
    setYearlyPaymentPlan(instance, streamReader.readBoolean());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4 instance) throws SerializationException {
    streamWriter.writeObject(getLastEdited(instance));
    streamWriter.writeBoolean(getMonthlyPaymentPlan(instance));
    streamWriter.writeInt(getMyAccountId(instance));
    streamWriter.writeBoolean(getQuarterlyPaymentPlan(instance));
    streamWriter.writeString(getRegisteredTo(instance));
    streamWriter.writeBoolean(getYearlyPaymentPlan(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4)object);
  }
  
}
