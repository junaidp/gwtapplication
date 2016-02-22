package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.EditUserEvent;
import com.helloworld.client.event.ViewEditRegistrationEvent;
import com.helloworld.client.event.ViewPlanEvent;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.UserEntity;

public class MyAccountPresenter implements Presenter 

{
	
	private final Display display;
	private final HandlerManager eventBus;
	private UserEntity loggedInUser;
	private GlobalPreferencesEntity globalPreferencesEntity;

	public interface Display 
	{
		Widget asWidget();
		FocusPanel getPanelViewPlan();
		FocusPanel getPanelViewReg();
		FocusPanel getPanelEditReg();
	}  

	public MyAccountPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, UserEntity user, GlobalPreferencesEntity globalPreferencesEntity) 
	{
		this.display = view;
		this.eventBus = eventBus;
		this.loggedInUser = user;
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
			display.getPanelViewReg().setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isViewRegShowPanel());
			display.getPanelEditReg().setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isEditRegShowPanel());
			display.getPanelViewPlan().setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isViewPlanShowPanel());
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
		
		display.getPanelViewReg().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ViewEditRegistrationEvent(loggedInUser));
			}});
		
		display.getPanelEditReg().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new EditUserEvent(loggedInUser));
			}});
	}
	
}
