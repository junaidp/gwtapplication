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
package com.halcyonpro.gwtapp.client.header;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.halcyonpro.gwtapp.client.HelloServiceAsync;
import com.halcyonpro.gwtapp.client.event.DashboardAccordionEvent;
import com.halcyonpro.gwtapp.client.event.DashboardEvent;
import com.halcyonpro.gwtapp.client.event.DynamicBeanEditorEvent;
import com.halcyonpro.gwtapp.client.event.GlobalPreferencesEvent;
import com.halcyonpro.gwtapp.client.event.IntelligencePackEvent;
import com.halcyonpro.gwtapp.client.event.JavaBeanEditorEvent;
import com.halcyonpro.gwtapp.client.event.MainEvent;
import com.halcyonpro.gwtapp.client.event.SearchDataEvent;
import com.halcyonpro.gwtapp.client.presenter.Presenter;
import com.halcyonpro.gwtapp.client.view.ApplicationConstants;
import com.halcyonpro.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.halcyonpro.gwtapp.shared.entity.UserEntity;

// This class manages the functionality/logic of Application's header.Currently just HOME option for header been implemented.
public class HeaderPresenter implements Presenter 

{
	
	private final Display display;
	private UserEntity loggedInUser ;
	private final HandlerManager eventBus;
	private GlobalPreferencesEntity globalPreferencesEntity ;

	public interface Display 
	{
		Widget asWidget();
		Image getImgLogo();
		Anchor getMenuHome();
		Anchor getFileUpload();
		Anchor getAncJavaBeanEditor();
		Anchor getAncGlobalPreferences();
		Anchor getAncDownloadJson();
		Anchor getAncBeanData();
		Anchor getAncDynamicBeanEditor();
		Anchor getAncDynamicBeanData();
		Anchor getAncBindings();
		Anchor getMenuUser();
		
	}  

	public HeaderPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, UserEntity user, GlobalPreferencesEntity globalPreferences) 
	{
		this.display = view;
		this.eventBus = eventBus;
		this.loggedInUser = user;
		this.globalPreferencesEntity = globalPreferences;
		display.getMenuUser().setText(user.getName());
		
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
	}

	public void bind() {
		
		updateLogoPreferences();
	}

	private void updateLogoPreferences() {
		display.getImgLogo().setUrl(globalPreferencesEntity.getLogoUrl());
		display.getImgLogo().setWidth(globalPreferencesEntity.getLogoWidth()+"px");
		display.getImgLogo().setHeight(globalPreferencesEntity.getLogoHeight()+"px");
	}

	@Override
	public void setHandlers() {
		
		display.getMenuHome().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				if(loggedInUser == null){
					History.newItem(ApplicationConstants.TOKEN_LOGIN);
				}else{
					eventBus.fireEvent(new MainEvent(loggedInUser, globalPreferencesEntity));
					}
			}});
	
		
		display.getFileUpload().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				History.newItem(ApplicationConstants.TOKEN_FILE_UPLOAD);
			}});
		
	
		display.getAncJavaBeanEditor().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new JavaBeanEditorEvent());
			}
		});
		
		display.getAncGlobalPreferences().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new GlobalPreferencesEvent());
			}
		});	
		
		display.getAncDownloadJson().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				History.newItem(ApplicationConstants.TOKEN_DOWNLOAD_JSON);
			}
		});	
		
		
		display.getAncBeanData().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				History.newItem(ApplicationConstants.TOKEN_UPLOAD_COMPONENTS);
			}
		});
		
		display.getAncDynamicBeanData().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				History.newItem(ApplicationConstants.TOKEN_UPLOAD_COMPONENTS_DYNAMICBEAN);
			}
		});
		
		display.getAncDynamicBeanEditor().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new DynamicBeanEditorEvent());
			}
		});
		
		display.getAncBindings().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				History.newItem(ApplicationConstants.TOKEN_BINDINGS);
			}
		});
		
		
	}

	
	
}
