package com.helloworld.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloService;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.shared.entity.UserEntity;

public class HeaderPresenter implements Presenter 

{
	
	private final Display display;

	public interface Display 
	{
		Widget asWidget();
		Image getImgLogo();
		MenuBar getMainMenu();
		
	}  

	public HeaderPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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

	public void bind() {
		
		fetchUsersLogo();

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

	@Override
	public void setHandlers() {
		
	}

	public void setUser(UserEntity loggedInUser) {
//		display.getMainMenu().addItem(new MenuItem(loggedInUser.getName(), true));
		
	}
	
}
