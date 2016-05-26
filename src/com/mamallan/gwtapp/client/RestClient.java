package com.mamallan.gwtapp.client;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import com.mamallan.gwtapp.shared.RestEntity;

@Path("/api/hellos")
public interface RestClient extends RestService {
  
  @GET
  public void getHellos( MethodCallback<List<RestEntity>> callback);
  
  @GET
  @Path("/{verify}")
  public void verifySubscription(@PathParam("verify") String email, MethodCallback<Boolean> callback);
  
//  @GET
//  @Path("/{id}")
//  public void getHellos(@PathParam("id") String id, MethodCallback<List<Hello>> callback);
}
