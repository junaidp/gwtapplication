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
package com.halcyonpro.gwtapp.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.halcyonpro.gwtapp.client.HelloServiceAsync;
import com.halcyonpro.gwtapp.client.event.EditUserEvent;
import com.halcyonpro.gwtapp.client.event.ViewEditRegistrationEvent;
import com.halcyonpro.gwtapp.client.event.ViewPlanEvent;
import com.halcyonpro.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.halcyonpro.gwtapp.shared.entity.UserEntity;

public class MyAccountPresenter implements Presenter 

{
	
	private final Display display;
	private final HandlerManager eventBus;
	private UserEntity loggedInUser;
	private GlobalPreferencesEntity globalPreferencesEntity;

	public interface Display 
	{
		Widget asWidget();
		FocusPanel getPanelViewPlan();
		FocusPanel getPanelViewReg();
		FocusPanel getPanelEditReg();
	}  

	public MyAccountPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, UserEntity user, GlobalPreferencesEntity globalPreferencesEntity) 
	{
		this.display = view;
		this.eventBus = eventBus;
		this.loggedInUser = user;
		this.globalPreferencesEntity = globalPreferencesEntity;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
	}

	private void bind() {
		try{
		if(globalPreferencesEntity.getMyAccountPreferencesId()!=null){
			display.getPanelViewReg().setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isViewRegShowPanel());
			display.getPanelEditReg().setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isEditRegShowPanel());
			display.getPanelViewPlan().setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isViewPlanShowPanel());
		}
		}catch(Exception ex){
			//Global preferences entity not available yet
		}
	}

	@Override
	public void setHandlers() {
		
		
		display.getPanelViewPlan().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ViewPlanEvent(loggedInUser));
			}
		});
		
		display.getPanelViewReg().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ViewEditRegistrationEvent(loggedInUser));
			}});
		
		display.getPanelEditReg().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new EditUserEvent(loggedInUser));
			}});
	}
	
}
