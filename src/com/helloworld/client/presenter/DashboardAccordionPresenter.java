package com.helloworld.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;

public class DashboardAccordionPresenter implements Presenter 

{
	
	private final Display display;

	public interface Display 
	{
		Widget asWidget();
	}  

	public DashboardAccordionPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.display = view;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
	}

	private void bind() {


	}

	@Override
	public void setHandlers() {
		// TODO Auto-generated method stub
		
	}
	
}
