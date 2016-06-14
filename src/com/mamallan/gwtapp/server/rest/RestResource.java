package com.mamallan.gwtapp.server.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mamallan.gwtapp.database.MyRdbHelper;




@Path("hellos")
public class RestResource {
 
  
  @GET
  @Path("/{verify}")
  @Produces({"application/xml", "application/json"})
  @Consumes({"application/xml", "application/json"})
  
  public boolean verifySubscription(@PathParam("verify") String email) throws Exception {
	  ApplicationContext ctx = new ClassPathXmlApplicationContext(
		"applicationContext.xml");
	  MyRdbHelper rdbHelper = (MyRdbHelper) ctx.getBean("ManagerApp");
    return rdbHelper.verifySubscription(email);
	
  }
  
 
  
}
