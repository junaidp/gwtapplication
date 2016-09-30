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
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.halcyonpro.gwtapp.client.HelloServiceAsync;
import com.halcyonpro.gwtapp.client.view.widgets.DisplayAlert;
import com.halcyonpro.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.halcyonpro.gwtapp.shared.entity.MyAccountEntity;
import com.halcyonpro.gwtapp.shared.entity.MyAccountPreferencesEntity;
import com.halcyonpro.gwtapp.shared.entity.UserEntity;

// This class manages the Functionality for viewPlan where user can view's their plans and can modify them 
public class ViewPlanPresenter implements Presenter 

{

	private final Display display;
	private GlobalPreferencesEntity globalPreferencesEntity;
	private UserEntity loggedInUser;
	private HelloServiceAsync rpcService;
	
	public interface Display 
	{
		Widget asWidget();
		void displaySelectedPanels(MyAccountPreferencesEntity myAccountPreferencesEntity);
		Button getBtnUpdate();
		void updateFields(MyAccountEntity myAccountEntity);
		void updateMyAccount(MyAccountEntity myAccountEntity);
	}  

	public ViewPlanPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, GlobalPreferencesEntity globalPreferencesEntity, UserEntity loggedInUser) 
	{
		this.display = view;
		this.globalPreferencesEntity = globalPreferencesEntity;
		this.loggedInUser = loggedInUser;
		this.rpcService = rpcService;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
		display.updateFields(loggedInUser.getMyAccountId());
	}

	private void bind() {
		if(globalPreferencesEntity!=null){
			display.displaySelectedPanels(globalPreferencesEntity.getMyAccountPreferencesId());
		}

	}

	@Override
	public void setHandlers() {
		
		display.getBtnUpdate().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				 display.updateMyAccount(loggedInUser.getMyAccountId());
				 updateMyAccountInDb();
			}

			});
		
	
	}
	
	private void updateMyAccountInDb() {
		display.getBtnUpdate().addStyleName("loading-pulse");
			rpcService.updateMyAccount(loggedInUser.getMyAccountId(), new AsyncCallback<String>() {
				
				@Override
				public void onSuccess(String result) {
					new DisplayAlert(result);
					display.getBtnUpdate().removeStyleName("loading-pulse");
				}
				
				@Override
				public void onFailure(Throwable caught) {
					display.getBtnUpdate().removeStyleName("loading-pulse");
					Window.alert("Fail int"+ caught.getLocalizedMessage());
				}
			});
	}

}
