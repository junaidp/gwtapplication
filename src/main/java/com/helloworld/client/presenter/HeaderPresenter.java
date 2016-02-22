package com.helloworld.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloService;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.MainEvent;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.UserEntity;

public class HeaderPresenter implements Presenter 

{
	
	private final Display display;
	private UserEntity loggedInUser ;
	private final HandlerManager eventBus;
	private GlobalPreferencesEntity globalPreferencesEntity ;

	public interface Display 
	{
		Widget asWidget();
		Image getImgLogo();
		FocusPanel getMenuHome();
		
	}  

	public HeaderPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, UserEntity user, GlobalPreferencesEntity globalPreferences) 
	{
		this.display = view;
		this.eventBus = eventBus;
		this.loggedInUser = user;
		this.globalPreferencesEntity = globalPreferences;
		
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
	}

	public void bind() {
		
//		fetchUsersLogo();

	}

	private void fetchUsersLogo() {
		HelloServiceAsync rpcService = GWT.create(HelloService.class);
		rpcService.fetchLogo(new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String logoUrl) {
				display.getImgLogo().setUrl(logoUrl);
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Fail fetchUsersLogo"+ caught.getLocalizedMessage());
			}
		});
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setHandlers() {
		
		display.getMenuHome().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				if(loggedInUser == null){
					History.newItem(ApplicationConstants.TOKEN_LOGIN);
				}else{
					eventBus.fireEvent(new MainEvent(loggedInUser, globalPreferencesEntity));
					}
			}});
		
		
	}

	
	
}
