package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.MyAccountEvent;
import com.helloworld.client.view.MyDashboard.MyAccountPanel;

public class DashboardPresenter implements Presenter 

{
	
	private final Display display;
	private final HandlerManager eventBus;

	public interface Display 
	{
		Widget asWidget();
		MyAccountPanel getMyAccount();
	}  

	public DashboardPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.display = view;
		this.eventBus = eventBus;
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
		
		display.getMyAccount().getPanel().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new MyAccountEvent());
			}});
	}
	
}
