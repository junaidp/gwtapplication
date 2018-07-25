package com.sapientarrow.gwtapp.client.rest;

public class SignInClient_Generated_RestServiceProxy_ implements com.sapientarrow.gwtapp.client.rest.SignInClient, org.fusesource.restygwt.client.RestServiceProxy {
  private org.fusesource.restygwt.client.Resource resource = null;
  
  public void setResource(org.fusesource.restygwt.client.Resource resource) {
    this.resource = resource;
  }
  public org.fusesource.restygwt.client.Resource getResource() {
    if (this.resource == null) {
      String serviceRoot = org.fusesource.restygwt.client.Defaults.getServiceRoot();
      this.resource = new org.fusesource.restygwt.client.Resource(serviceRoot).resolve("/api/signin");
    }
    return this.resource;
  }
  private org.fusesource.restygwt.client.Dispatcher dispatcher = null;
  
  public void setDispatcher(org.fusesource.restygwt.client.Dispatcher dispatcher) {
    this.dispatcher = dispatcher;
  }
  
  public org.fusesource.restygwt.client.Dispatcher getDispatcher() {
    return this.dispatcher;
  }
  public void signIn(java.lang.String userName, java.lang.String password, org.fusesource.restygwt.client.MethodCallback<com.sapientarrow.gwtapp.shared.entity.UserEntity> callback) {
    final java.lang.String final_userName = userName;
    final java.lang.String final_password = password;
    final org.fusesource.restygwt.client.Method __method =
    getResource()
    .resolve("/"+(userName== null? null : com.google.gwt.http.client.URL.encodePathSegment(userName))+"")
    .get();
    __method.setDispatcher(this.dispatcher);
    __method.header(org.fusesource.restygwt.client.Resource.HEADER_ACCEPT, org.fusesource.restygwt.client.Resource.CONTENT_TYPE_JSON);
    try {
      __method.send(new org.fusesource.restygwt.client.AbstractRequestCallback<com.sapientarrow.gwtapp.shared.entity.UserEntity>(__method, callback) {
        protected com.sapientarrow.gwtapp.shared.entity.UserEntity parseResult() throws Exception {
          try {
            return com.sapientarrow.gwtapp.shared.entity.UserEntity_Generated_JsonEncoderDecoder_.INSTANCE.decode(com.google.gwt.json.client.JSONParser.parse(__method.getResponse().getText()));
          } catch (Throwable __e) {
            throw new org.fusesource.restygwt.client.ResponseFormatException("Response was NOT a valid JSON document", __e);
          }
        }
      });
    } catch (com.google.gwt.http.client.RequestException __e) {
      callback.onFailure(__method,__e);
    }
  }
}
