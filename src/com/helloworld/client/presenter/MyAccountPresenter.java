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
import com.helloworld.client.event.ViewEditRegistrationEvent;
import com.helloworld.client.event.ViewPlanEvent;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.UserEntity;

public class MyAccountPresenter implements Presenter 

{
	
	private final Display display;
	private final HandlerManager eventBus;
	private final HelloServiceAsync rpcService;
	private UserEntity loggedInUser;
	private GlobalPreferencesEntity globalPreferencesEntity;

	public interface Display 
	{
		Widget asWidget();
		FocusPanel getPanelViewPlan();
		FocusPanel getPanelViewEditReg();
	}  

	public MyAccountPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, UserEntity user, GlobalPreferencesEntity globalPreferencesEntity) 
	{
		this.display = view;
		this.eventBus = eventBus;
		this.loggedInUser = user;
		this.rpcService = rpcService;
		this.globalPreferencesEntity = globalPreferencesEntity;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
	}

	private void bind() {
		try{
		if(globalPreferencesEntity.getMyAccountPreferencesId()!=null){
			if(! globalPreferencesEntity.getMyAccountPreferencesId().isViewRegShowPanel()){
				display.getPanelViewEditReg().setVisible(false);
			}
		}
		}catch(Exception ex){
			//Global preferences entity not available yet
		}
	}

	@Override
	public void setHandlers() {
		
		
		display.getPanelViewPlan().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ViewPlanEvent(loggedInUser));
			}
		});
		
		display.getPanelViewEditReg().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ViewEditRegistrationEvent(loggedInUser));
			}});
	}
	
}
