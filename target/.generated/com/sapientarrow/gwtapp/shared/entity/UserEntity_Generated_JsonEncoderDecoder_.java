package com.sapientarrow.gwtapp.shared.entity;

public class UserEntity_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.sapientarrow.gwtapp.shared.entity.UserEntity> {
  
  public static final UserEntity_Generated_JsonEncoderDecoder_ INSTANCE = new UserEntity_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.sapientarrow.gwtapp.shared.entity.UserEntity value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.sapientarrow.gwtapp.shared.entity.UserEntity parseValue = (com.sapientarrow.gwtapp.shared.entity.UserEntity)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.encode(parseValue.getUserId()), rc, "userId");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getUserName()), rc, "userName");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getPassword()), rc, "password");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getName()), rc, "name");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getEmail()), rc, "email");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.encode(parseValue.getStatus()), rc, "status");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.DATE.encode(parseValue.getTokenGeneratedDate()), rc, "tokenGeneratedDate");
    isNotNullValuePut(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity_Generated_JsonEncoderDecoder_.INSTANCE.encode(parseValue.getMyAccountId()), rc, "myAccountId");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.encode(parseValue.isAdmin()), rc, "admin");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getToken()), rc, "token");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getUserFetchStatus()), rc, "userFetchStatus");
    return rc;
  }
  
  public com.sapientarrow.gwtapp.shared.entity.UserEntity decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.sapientarrow.gwtapp.shared.entity.UserEntity rc = new com.sapientarrow.gwtapp.shared.entity.UserEntity();
    rc.setUserId(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.decode(object.get("userId")), 0));
    rc.setUserName(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("userName")), null));
    rc.setPassword(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("password")), null));
    rc.setName(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("name")), null));
    rc.setEmail(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("email")), null));
    rc.setStatus(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.decode(object.get("status")), 0));
    rc.setTokenGeneratedDate(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.DATE.decode(object.get("tokenGeneratedDate")), null));
    rc.setMyAccountId(getValueToSet(com.sapientarrow.gwtapp.shared.entity.MyAccountEntity_Generated_JsonEncoderDecoder_.INSTANCE.decode(object.get("myAccountId")), null));
    rc.setAdmin(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.decode(object.get("admin")), false));
    rc.setToken(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("token")), null));
    rc.setUserFetchStatus(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("userFetchStatus")), null));
    return rc;
  }
  
}
