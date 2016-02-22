package com.mamallan.gwtapp.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;

public class DashboardPortalPresenter implements Presenter 

{

	private final Display display;

	public interface Display 
	{
		Widget asWidget();
	}  

	public DashboardPortalPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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

	}

}
