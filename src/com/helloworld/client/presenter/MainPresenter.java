package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.DashboardEvent;
import com.helloworld.client.event.IntelligencePackEvent;
import com.helloworld.client.event.SearchDataEvent;
import com.helloworld.client.view.ControlPanels.ControlPanelsContainer;

public class MainPresenter implements Presenter 

{
	
	private final Display display;
	private HandlerManager eventBus;

	public interface Display 
	{
		Widget asWidget();
		ControlPanelsContainer getControlPanelContainer();
		VerticalPanel getCenter();

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
		eventBus.fireEvent(new DashboardEvent(display.getCenter()));

		display.getControlPanelContainer().getDashboardPanel().getHeading().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new DashboardEvent(display.getCenter()));
			}});
		
		display.getControlPanelContainer().getIntelligencePanel().getHeading().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new IntelligencePackEvent(display.getCenter()));
			}});
		
		display.getControlPanelContainer().getSearchPanel().getHeading().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new SearchDataEvent(display.getCenter()));
			}});
	}


}


