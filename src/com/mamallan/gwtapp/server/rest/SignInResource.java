package com.mamallan.gwtapp.server.rest;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mamallan.gwtapp.database.MyRdbHelper;
import com.mamallan.gwtapp.shared.entity.UserEntity;

@Path("signin")
public class SignInResource {


	@GET
	@Path("/{singinId}")
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	public UserEntity signIn(@PathParam("singinId") String userName, @PathParam("singinId") String password) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MyRdbHelper rdbHelper = (MyRdbHelper) ctx.getBean("ManagerApp");
		UserEntity user = rdbHelper.signIn(userName, password);
		user.setTokenGeneratedDate(new Date(user.getTokenGeneratedDate().getDate()));
		user.getMyAccountId().setLastEdited(new Date(user.getMyAccountId().getLastEdited().getDate()));
		return user;
	}

}
