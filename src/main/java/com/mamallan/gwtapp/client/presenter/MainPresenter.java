package com.mamallan.gwtapp.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.event.DashboardAccordionEvent;
import com.mamallan.gwtapp.client.event.DashboardEvent;
import com.mamallan.gwtapp.client.event.GlobalPreferencesEvent;
import com.mamallan.gwtapp.client.event.IntelligencePackEvent;
import com.mamallan.gwtapp.client.event.JavaBeanEditorEvent;
import com.mamallan.gwtapp.client.event.SearchDataEvent;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.client.view.ControlPanels.ControlPanelsContainer;
import com.mamallan.gwtapp.shared.entity.UserEntity;

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
		Anchor getAncDownloadJson();

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
				History.newItem(ApplicationConstants.TOKEN_DASHBOARD_PORTAL);
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
		
		
		
	}


}


