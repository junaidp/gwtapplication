/*******************************************************************************
 * Copyright (c) 2015 Halcyon Technologies.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Affero GNU Public License
 *   which accompanies this distribution, and is available at
 *   https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   Copyright:
 *       Halcyon Technologies llc
 *   
 *   This file is part of the Business Suite software of Halcyonpro.net.
 *   Copyright (C) 2012-2020 Halcyonpro.net
 *  
 *   The primary contact email is support@halcyonpro.net
 *  
 *   Version: AGPL
 *  
 *   Halcyon Technologies, Halcyon Information Systems, Halcyonpro along with their domain names,  
 *   etc and the names Acuity, Ingenuity, Derivo, Colander etc are copyright of
 *   Halcyon llc and usage of these without prior permission of the owner is strictly prohibited
 *    
 *  The contents of this file may be used under the terms of
 *   the Affero GNU General Public License Version (the "AGPL"),
 *   A copy of the AGPL v2.1 can be obtained from https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   AGPL, in essence, means that this software requires a commercial license for use in or as a commercial application
 *******************************************************************************/
package com.halcyonpro.gwtapp.server.rest;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.halcyonpro.gwtapp.database.MyRdbHelper;
import com.halcyonpro.gwtapp.shared.entity.UserEntity;

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
