package com.sapientarrow.gwtapp.shared.entity;

public class MyAccountEntity_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.sapientarrow.gwtapp.shared.entity.MyAccountEntity> {
  
  public static final MyAccountEntity_Generated_JsonEncoderDecoder_ INSTANCE = new MyAccountEntity_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.sapientarrow.gwtapp.shared.entity.MyAccountEntity parseValue = (com.sapientarrow.gwtapp.shared.entity.MyAccountEntity)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.encode(parseValue.getMyAccountId()), rc, "myAccountId");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.encode(parseValue.isMonthlyPaymentPlan()), rc, "monthlyPaymentPlan");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.encode(parseValue.isQuarterlyPaymentPlan()), rc, "quarterlyPaymentPlan");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.encode(parseValue.isYearlyPaymentPlan()), rc, "yearlyPaymentPlan");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getRegisteredTo()), rc, "registeredTo");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.DATE.encode(parseValue.getLastEdited()), rc, "lastEdited");
    return rc;
  }
  
  public com.sapientarrow.gwtapp.shared.entity.MyAccountEntity decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.sapientarrow.gwtapp.shared.entity.MyAccountEntity rc = new com.sapientarrow.gwtapp.shared.entity.MyAccountEntity();
    rc.setMyAccountId(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.decode(object.get("myAccountId")), 0));
    rc.setMonthlyPaymentPlan(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.decode(object.get("monthlyPaymentPlan")), false));
    rc.setQuarterlyPaymentPlan(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.decode(object.get("quarterlyPaymentPlan")), false));
    rc.setYearlyPaymentPlan(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.decode(object.get("yearlyPaymentPlan")), false));
    rc.setRegisteredTo(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("registeredTo")), null));
    rc.setLastEdited(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.DATE.decode(object.get("lastEdited")), null));
    return rc;
  }
  
}
