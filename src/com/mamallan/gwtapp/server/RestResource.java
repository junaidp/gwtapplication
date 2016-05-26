package com.mamallan.gwtapp.server;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mamallan.gwtapp.database.MyRdbHelper;
import com.mamallan.gwtapp.shared.RestEntity;




@Path("hellos")
public class RestResource {
  
  Map<String, RestEntity> database;

	
  public RestResource() {
    database = new HashMap<String, RestEntity>();
    RestEntity hello1 = new RestEntity("1", "ronan");
    RestEntity hello2 = new RestEntity("2", "john");
    
    database.put(hello1.getId(), hello1);
    database.put(hello2.getId(), hello2);
  }
  
  @GET
  @Produces("application/json")
  public Collection<RestEntity> get() {
    return database.values();
  }
  
  @GET
  @Path("/{verify}")
  @Produces("application/json")
  public boolean verifySubscription(@PathParam("verify") String email) throws Exception {
	  ApplicationContext ctx = new ClassPathXmlApplicationContext(
		"applicationContext.xml");
	  MyRdbHelper rdbHelper = (MyRdbHelper) ctx.getBean("ManagerApp");
    return rdbHelper.verifySubscription(email);
	
  }
  
  
//  @GET
//  @Path("/{id}")
//  @Produces("application/json")
//  public RestEntity getHello(@PathParam("id") String id) {
//    return database.get(id);
//  }
}
