package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences.EditRegistrationDetails;
import com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences.ViewPlan;
import com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences.ViewRegistrationDetails;
import com.helloworld.shared.entity.MyAccountPreferencesEntity;

public class GlobalPreferencesPresenter implements Presenter 

{
	
	private final Display display;
	private ViewPlan viewPlan;
	private ViewRegistrationDetails viewRegistration;
	private EditRegistrationDetails editRegistration;
	
	public interface Display 
	{
		Widget asWidget();
		Tree getTreePreferences();
		HorizontalSplitPanel getSplitPanel();
		HasClickHandlers getBtnCancel();
		HasClickHandlers getBtnSave();
	}  

	public GlobalPreferencesPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.display = view;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
	}

	private void bind() {


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
				History.back();
			}
		
		});
		
		display.getTreePreferences().addSelectionHandler(new SelectionHandler<TreeItem>() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void onSelection(SelectionEvent<TreeItem> event) {
				TreeItem item = event.getSelectedItem();
							
				 switch (item.getHTML()) {
		            case ApplicationConstants.VIEW_PLAN:  
		            	viewPlan = new ViewPlan();
		            	display.getSplitPanel().setRightWidget(viewPlan);
		                     break;
		            case ApplicationConstants.VIEW_REGISTRATION:  
		            	viewRegistration = new ViewRegistrationDetails();
		            	display.getSplitPanel().setRightWidget(viewRegistration);
		                     break;
		            case ApplicationConstants.EDIT_REGISTRATION:
		            	editRegistration = new EditRegistrationDetails();
		            	display.getSplitPanel().setRightWidget(editRegistration);
		                     break;
				 }		
			}
		});
	}
	
	private void savePreferences() {
		MyAccountPreferencesEntity myAccountPreferences = new MyAccountPreferencesEntity();
		myAccountPreferences.setShowPaymentDetails(viewPlan.getPaymentDetails().isChecked());
		myAccountPreferences.setShowPlanType(viewPlan.getPlanType().isChecked());
	}
	
}
