package com.sapientarrow.gwtapp.shared.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MyAccountPreferencesEntity_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getEditRegCloseAccount(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegCloseAccount;
  }-*/;
  
  private static native void setEditRegCloseAccount(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegCloseAccount = value;
  }-*/;
  
  private static native boolean getEditRegEmail(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegEmail;
  }-*/;
  
  private static native void setEditRegEmail(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegEmail = value;
  }-*/;
  
  private static native boolean getEditRegName(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegName;
  }-*/;
  
  private static native void setEditRegName(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegName = value;
  }-*/;
  
  private static native boolean getEditRegPassword(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegPassword;
  }-*/;
  
  private static native void setEditRegPassword(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegPassword = value;
  }-*/;
  
  private static native boolean getEditRegRegisteredTo(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegRegisteredTo;
  }-*/;
  
  private static native void setEditRegRegisteredTo(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegRegisteredTo = value;
  }-*/;
  
  private static native boolean getEditRegShowPanel(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegShowPanel;
  }-*/;
  
  private static native void setEditRegShowPanel(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegShowPanel = value;
  }-*/;
  
  private static native boolean getEditRegUserName(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegUserName;
  }-*/;
  
  private static native void setEditRegUserName(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::editRegUserName = value;
  }-*/;
  
  private static native int getMyAccountPreferencesId(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::myAccountPreferencesId;
  }-*/;
  
  private static native void setMyAccountPreferencesId(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::myAccountPreferencesId = value;
  }-*/;
  
  private static native boolean getShowPaymentDetails(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::showPaymentDetails;
  }-*/;
  
  private static native void setShowPaymentDetails(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::showPaymentDetails = value;
  }-*/;
  
  private static native boolean getShowPlanType(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::showPlanType;
  }-*/;
  
  private static native void setShowPlanType(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::showPlanType = value;
  }-*/;
  
  private static native boolean getViewPaymentTerms(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewPaymentTerms;
  }-*/;
  
  private static native void setViewPaymentTerms(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewPaymentTerms = value;
  }-*/;
  
  private static native boolean getViewPlanMonthlyPayments(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewPlanMonthlyPayments;
  }-*/;
  
  private static native void setViewPlanMonthlyPayments(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewPlanMonthlyPayments = value;
  }-*/;
  
  private static native boolean getViewPlanQuarterlyPayments(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewPlanQuarterlyPayments;
  }-*/;
  
  private static native void setViewPlanQuarterlyPayments(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewPlanQuarterlyPayments = value;
  }-*/;
  
  private static native boolean getViewPlanShowPanel(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewPlanShowPanel;
  }-*/;
  
  private static native void setViewPlanShowPanel(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewPlanShowPanel = value;
  }-*/;
  
  private static native boolean getViewPlanYearlyPayments(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewPlanYearlyPayments;
  }-*/;
  
  private static native void setViewPlanYearlyPayments(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewPlanYearlyPayments = value;
  }-*/;
  
  private static native boolean getViewRegEmail(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegEmail;
  }-*/;
  
  private static native void setViewRegEmail(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegEmail = value;
  }-*/;
  
  private static native boolean getViewRegLastEdited(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegLastEdited;
  }-*/;
  
  private static native void setViewRegLastEdited(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegLastEdited = value;
  }-*/;
  
  private static native boolean getViewRegName(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegName;
  }-*/;
  
  private static native void setViewRegName(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegName = value;
  }-*/;
  
  private static native boolean getViewRegRegisteredTo(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegRegisteredTo;
  }-*/;
  
  private static native void setViewRegRegisteredTo(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegRegisteredTo = value;
  }-*/;
  
  private static native boolean getViewRegShowPanel(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegShowPanel;
  }-*/;
  
  private static native void setViewRegShowPanel(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegShowPanel = value;
  }-*/;
  
  private static native boolean getViewRegUserName(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegUserName;
  }-*/;
  
  private static native void setViewRegUserName(com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::viewRegUserName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setEditRegCloseAccount(instance, streamReader.readBoolean());
    setEditRegEmail(instance, streamReader.readBoolean());
    setEditRegName(instance, streamReader.readBoolean());
    setEditRegPassword(instance, streamReader.readBoolean());
    setEditRegRegisteredTo(instance, streamReader.readBoolean());
    setEditRegShowPanel(instance, streamReader.readBoolean());
    setEditRegUserName(instance, streamReader.readBoolean());
    setMyAccountPreferencesId(instance, streamReader.readInt());
    setShowPaymentDetails(instance, streamReader.readBoolean());
    setShowPlanType(instance, streamReader.readBoolean());
    setViewPaymentTerms(instance, streamReader.readBoolean());
    setViewPlanMonthlyPayments(instance, streamReader.readBoolean());
    setViewPlanQuarterlyPayments(instance, streamReader.readBoolean());
    setViewPlanShowPanel(instance, streamReader.readBoolean());
    setViewPlanYearlyPayments(instance, streamReader.readBoolean());
    setViewRegEmail(instance, streamReader.readBoolean());
    setViewRegLastEdited(instance, streamReader.readBoolean());
    setViewRegName(instance, streamReader.readBoolean());
    setViewRegRegisteredTo(instance, streamReader.readBoolean());
    setViewRegShowPanel(instance, streamReader.readBoolean());
    setViewRegUserName(instance, streamReader.readBoolean());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeBoolean(getEditRegCloseAccount(instance));
    streamWriter.writeBoolean(getEditRegEmail(instance));
    streamWriter.writeBoolean(getEditRegName(instance));
    streamWriter.writeBoolean(getEditRegPassword(instance));
    streamWriter.writeBoolean(getEditRegRegisteredTo(instance));
    streamWriter.writeBoolean(getEditRegShowPanel(instance));
    streamWriter.writeBoolean(getEditRegUserName(instance));
    streamWriter.writeInt(getMyAccountPreferencesId(instance));
    streamWriter.writeBoolean(getShowPaymentDetails(instance));
    streamWriter.writeBoolean(getShowPlanType(instance));
    streamWriter.writeBoolean(getViewPaymentTerms(instance));
    streamWriter.writeBoolean(getViewPlanMonthlyPayments(instance));
    streamWriter.writeBoolean(getViewPlanQuarterlyPayments(instance));
    streamWriter.writeBoolean(getViewPlanShowPanel(instance));
    streamWriter.writeBoolean(getViewPlanYearlyPayments(instance));
    streamWriter.writeBoolean(getViewRegEmail(instance));
    streamWriter.writeBoolean(getViewRegLastEdited(instance));
    streamWriter.writeBoolean(getViewRegName(instance));
    streamWriter.writeBoolean(getViewRegRegisteredTo(instance));
    streamWriter.writeBoolean(getViewRegShowPanel(instance));
    streamWriter.writeBoolean(getViewRegUserName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity)object);
  }
  
}
