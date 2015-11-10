package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.AdminEvent;
import com.helloworld.client.event.DashboardAccordionEvent;
import com.helloworld.client.event.DashboardEvent;
import com.helloworld.client.event.EditUserEvent;
import com.helloworld.client.event.GlobalPreferencesEvent;
import com.helloworld.client.event.IntelligencePackEvent;
import com.helloworld.client.event.JavaBeanEditorEvent;
import com.helloworld.client.event.RegistrationEvent;
import com.helloworld.client.event.SearchDataEvent;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.ControlPanels.ControlPanelsContainer;
import com.helloworld.client.view.ControlPanels.DashboardAccordionPanelView;
import com.helloworld.client.view.widgets.Attachment;
import com.helloworld.client.view.widgets.DisplayAlert;
import com.helloworld.client.view.widgets.PopupsView;
import com.helloworld.shared.entity.UserEntity;

public class MainPresenter implements Presenter 

{
	
	private final Display display;
	private HandlerManager eventBus;

	public interface Display 
	{
		Widget asWidget();
		ControlPanelsContainer getControlPanelContainer();
		VerticalPanel getCenter();
		UserEntity getLoggedInUser();
		Anchor getFileUpload();
		Anchor getAncJavaBeanEditor();
		Anchor getAncGlobalPreferences();

	}  

	public MainPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.display = view;
		this.eventBus= eventBus;
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
		
		display.getControlPanelContainer().getDashboardPanel().getFocusPanel().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new DashboardEvent());
			}});
		
		display.getControlPanelContainer().getIntelligencePanel().getFocusPanel().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new IntelligencePackEvent(display.getCenter()));
			}});
		
		display.getControlPanelContainer().getSearchPanel().getFocusPanel().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new SearchDataEvent(display.getCenter()));
			}});
		
		display.getFileUpload().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				History.newItem(ApplicationConstants.TOKEN_FILE_UPLOAD);
			}});
		
		display.getControlPanelContainer().getDashboardAccordionPanel().getFocusPanel().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new DashboardAccordionEvent(display.getCenter()));
			}});
		
		display.getControlPanelContainer().getDashboardPortalPanel().getFocusPanel().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				new DisplayAlert("Removed for testing purpose");
//				History.newItem(ApplicationConstants.TOKEN_DASHBOARD_PORTAL);
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
		
		
		
	}


}


