package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.shared.entity.GlobalPreferencesEntity;

public class FooterPresenter implements Presenter 

{
	
	private final Display display;
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;

	public interface Display 
	{
		Widget asWidget();
		Label getLogOut();
		
	}  

	public FooterPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, GlobalPreferencesEntity globalPreferencesEntity) 
	{
		this.display = view;
		this.rpcService = rpcService;
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
		display.getLogOut().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				rpcService.logOut(new AsyncCallback<String>() {
					
					@Override
					public void onSuccess(String result) {
						History.newItem(ApplicationConstants.TOKEN_LOGIN);
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
					}
				});
			}
		});
	}
	
}
