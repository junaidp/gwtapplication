package com.mamallan.gwtapp.client.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

@Path("/api/hellos")
public interface RestClient extends RestService {
  
  @GET
  @Path("/{verify}")
  public void verifySubscription(@PathParam("verify") String email, MethodCallback<Boolean> callback);
  
  
}
