package com.mamallan.gwtapp.client.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import com.mamallan.gwtapp.shared.entity.UserEntity;

@Path("/api/signin")
public interface SignInClient extends RestService {
  
  @GET
  @Path("/{singinId}")
  public void signIn(@PathParam("singinId") String userName, @PathParam("singinId") String password, MethodCallback<UserEntity> callback);
 
}
