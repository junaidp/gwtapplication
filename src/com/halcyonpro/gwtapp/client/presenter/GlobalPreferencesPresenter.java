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
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.Widget;
import com.halcyonpro.gwtapp.client.HelloServiceAsync;
import com.halcyonpro.gwtapp.client.view.ApplicationConstants;
import com.halcyonpro.gwtapp.client.view.GlobalPreferencesPanels.MyAccountPreferences.EditRegistrationDetails;
import com.halcyonpro.gwtapp.client.view.GlobalPreferencesPanels.MyAccountPreferences.ViewPlan;
import com.halcyonpro.gwtapp.client.view.GlobalPreferencesPanels.MyAccountPreferences.ViewRegistrationDetails;
import com.halcyonpro.gwtapp.client.view.widgets.DisplayAlert;
import com.halcyonpro.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.halcyonpro.gwtapp.shared.entity.MyAccountPreferencesEntity;

//This class manages the Functionality/logic for global preferences , where user can set up their preferences for the whole
//application, e.g change view/edit plan , view /edit Registration etc , which will then reflect through out the application.
@SuppressWarnings("deprecation")
public class GlobalPreferencesPresenter implements Presenter 

{

	private final Display display;
	private ViewPlan viewPlan;
	private ViewRegistrationDetails viewRegistration;
	private EditRegistrationDetails editRegistration;
	private final HelloServiceAsync rpcService;
	private GlobalPreferencesEntity alreadySavedGlobalPreferencesEntity;

	public interface Display 
	{
		Widget asWidget();
		Tree getTreePreferences();
		HorizontalSplitPanel getSplitPanel();
		HasClickHandlers getBtnCancel();
		Button getBtnSave();
	}  

	public GlobalPreferencesPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.display = view;
		this.rpcService = rpcService;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
	}

	private void bind() {

		fetchExistingGlobalPreferences();
	}



	@Override
	public void setHandlers() {

		display.getBtnCancel().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				History.back();
			}
		});

		display.getBtnSave().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				savePreferences();

			}

		});

		display.getTreePreferences().addSelectionHandler(new SelectionHandler<TreeItem>() {

			@Override
			public void onSelection(SelectionEvent<TreeItem> event) {
				TreeItem item = event.getSelectedItem();

				switch (item.getHTML()) {
				case ApplicationConstants.VIEW_PLAN:  
					if(viewPlan ==null){
						viewPlan = new ViewPlan();
						viewPlan.updateFieldsWithAlreadySavedPreferences(alreadySavedGlobalPreferencesEntity);
					}

					display.getSplitPanel().setRightWidget(viewPlan);
					break;
				case ApplicationConstants.VIEW_REGISTRATION:  
					if(viewRegistration == null){
					viewRegistration = new ViewRegistrationDetails();
					viewRegistration.updateFieldsWithAlreadySavedPreferences(alreadySavedGlobalPreferencesEntity);
					
					}
					display.getSplitPanel().setRightWidget(viewRegistration);
					break;
					
				case ApplicationConstants.EDIT_REGISTRATION:  
					if(editRegistration == null){
						editRegistration = new EditRegistrationDetails();
						editRegistration.updateFieldsWithAlreadySavedPreferences(alreadySavedGlobalPreferencesEntity);
					
					}
					display.getSplitPanel().setRightWidget(editRegistration);
					break;
				}	
			}
		});
	}

	private void savePreferences() {
		GlobalPreferencesEntity globalPreferencesEntity;
		if(alreadySavedGlobalPreferencesEntity== null){
			globalPreferencesEntity = new  GlobalPreferencesEntity();
			MyAccountPreferencesEntity myAccountPreferencesEntity = new MyAccountPreferencesEntity();
			globalPreferencesEntity.setMyAccountPreferencesId(myAccountPreferencesEntity);

		}else{
			globalPreferencesEntity = alreadySavedGlobalPreferencesEntity;
		}
		saveGlobalPreferences(globalPreferencesEntity);


	}

	private void saveGlobalPreferences(GlobalPreferencesEntity globalPreferencesEntity) {
		if(viewPlan!=null){
			globalPreferencesEntity.getMyAccountPreferencesId().setShowPaymentDetails(viewPlan.getPaymentDetails().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewPaymentTerms(viewPlan.getCheckBoxPaymentPlan().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewPlanMonthlyPayments(viewPlan.getCheckBoxMonthly().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewPlanQuarterlyPayments(viewPlan.getCheckBoxQuaterly().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewPlanYearlyPayments(viewPlan.getCheckBoxYearly().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewPlanShowPanel(viewPlan.getCheckShowThisPanel().isChecked());
			
		}
		if(viewRegistration!=null){
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegName(viewRegistration.getCheckName().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegLastEdited(viewRegistration.getCheckLastTimeEdited().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegUserName(viewRegistration.getCheckUserName().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegEmail(viewRegistration.getCheckEmail().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegRegisteredTo(viewRegistration.getCheckRegisteredTo().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegShowPanel(viewRegistration.getCheckShowThisPanel().isChecked());
			
		}if(editRegistration!=null){
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegName(editRegistration.getCheckName().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegUserName(editRegistration.getCheckUserName().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegEmail(editRegistration.getCheckEmail().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegRegisteredTo(editRegistration.getCheckRegisteredTo().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegShowPanel(editRegistration.getCheckShowThisPanel().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegPassword(editRegistration.getCheckPassword().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegCloseAccount(editRegistration.getCheckCloseAccount().isChecked());
			
		}
		
		display.getBtnSave().addStyleName("loading-pulse");
		rpcService.updateGlobalPreferences(globalPreferencesEntity, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getLocalizedMessage());
				display.getBtnSave().removeStyleName("loading-pulse");
			}

			@Override
			public void onSuccess(String result) {
				new DisplayAlert(result);
				History.back();
				display.getBtnSave().removeStyleName("loading-pulse");
			}
		});

	}

	private void fetchExistingGlobalPreferences() {

		rpcService.fetchGlobalPreferences(new AsyncCallback<GlobalPreferencesEntity>() {

			@Override
			public void onSuccess(GlobalPreferencesEntity result) {
				alreadySavedGlobalPreferencesEntity = result;

			}

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}
		});
	}

}
