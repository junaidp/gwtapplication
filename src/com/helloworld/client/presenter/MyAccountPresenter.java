package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.ViewPlanEvent;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.UserEntity;

public class MyAccountPresenter implements Presenter 

{
	
	private final Display display;
	private final HandlerManager eventBus;
	private final HelloServiceAsync rpcService;
	private UserEntity loggedInUser;

	public interface Display 
	{
		Widget asWidget();
		Label getBtnBack();
		FocusPanel getPanelViewPlan();
	}  

	public MyAccountPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, UserEntity user) 
	{
		this.display = view;
		this.eventBus = eventBus;
		this.loggedInUser = user;
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
		
	

	}

	@Override
	public void setHandlers() {
		display.getBtnBack().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				History.back();
			}
		});
		
		display.getPanelViewPlan().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ViewPlanEvent(loggedInUser));
			}
		});
	}
	
}
