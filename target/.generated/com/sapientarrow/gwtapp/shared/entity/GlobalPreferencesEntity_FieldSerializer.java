package com.sapientarrow.gwtapp.shared.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GlobalPreferencesEntity_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getGlobalPrefrencesId(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::globalPrefrencesId;
  }-*/;
  
  private static native void setGlobalPrefrencesId(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::globalPrefrencesId = value;
  }-*/;
  
  private static native int getLogoHeight(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::logoHeight;
  }-*/;
  
  private static native void setLogoHeight(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::logoHeight = value;
  }-*/;
  
  private static native java.lang.String getLogoUrl(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::logoUrl;
  }-*/;
  
  private static native void setLogoUrl(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance, java.lang.String value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::logoUrl = value;
  }-*/;
  
  private static native int getLogoWidth(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::logoWidth;
  }-*/;
  
  private static native void setLogoWidth(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance, int value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::logoWidth = value;
  }-*/;
  
  private static native com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity getMyAccountPreferencesId(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::myAccountPreferencesId;
  }-*/;
  
  private static native void setMyAccountPreferencesId(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance, com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::myAccountPreferencesId = value;
  }-*/;
  
  private static native boolean getPanelTypeAccordion(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::panelTypeAccordion;
  }-*/;
  
  private static native void setPanelTypeAccordion(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::panelTypeAccordion = value;
  }-*/;
  
  private static native boolean getPanelTypeDashboard(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::panelTypeDashboard;
  }-*/;
  
  private static native void setPanelTypeDashboard(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::panelTypeDashboard = value;
  }-*/;
  
  private static native boolean getPanelTypePortlet(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance) /*-{
    return instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::panelTypePortlet;
  }-*/;
  
  private static native void setPanelTypePortlet(com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance, boolean value) 
  /*-{
    instance.@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::panelTypePortlet = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setGlobalPrefrencesId(instance, streamReader.readInt());
    setLogoHeight(instance, streamReader.readInt());
    setLogoUrl(instance, streamReader.readString());
    setLogoWidth(instance, streamReader.readInt());
    setMyAccountPreferencesId(instance, (com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity) streamReader.readObject());
    setPanelTypeAccordion(instance, streamReader.readBoolean());
    setPanelTypeDashboard(instance, streamReader.readBoolean());
    setPanelTypePortlet(instance, streamReader.readBoolean());
    
  }
  
  public static com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeInt(getGlobalPrefrencesId(instance));
    streamWriter.writeInt(getLogoHeight(instance));
    streamWriter.writeString(getLogoUrl(instance));
    streamWriter.writeInt(getLogoWidth(instance));
    streamWriter.writeObject(getMyAccountPreferencesId(instance));
    streamWriter.writeBoolean(getPanelTypeAccordion(instance));
    streamWriter.writeBoolean(getPanelTypeDashboard(instance));
    streamWriter.writeBoolean(getPanelTypePortlet(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity_FieldSerializer.deserialize(reader, (com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity_FieldSerializer.serialize(writer, (com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity)object);
  }
  
}
