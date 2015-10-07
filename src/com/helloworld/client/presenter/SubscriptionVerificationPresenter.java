package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.RegistrationEvent;
import com.helloworld.client.event.SubscriptionVerificationEvent;
import com.helloworld.client.view.ApplicationConstants;

public class SubscriptionVerificationPresenter implements Presenter 

{
	
	private final Display display;
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;

	public interface Display 
	{
		Widget asWidget();
		TextBox getEmail();
		Button getSubmit();
		Anchor getRegisterAccount();
	}  

	public SubscriptionVerificationPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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
	}

	private void bind() {
		setHandlers();
		RootPanel.get("loadingMessage").setVisible(false);

	}
	
	

	@Override
	public void setHandlers() {
		
		display.getRegisterAccount().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new RegistrationEvent());
				
			}});
		
		display.getSubmit().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				rpcService.verifySubscription(display.getEmail().getText(), new AsyncCallback<Boolean>() {
					
					@Override
					public void onSuccess(Boolean result) {
						if(result){
						History.newItem(ApplicationConstants.TOKEN_LOGIN);
						}else{
							Window.alert(ApplicationConstants.SUBSCRIPTION_NOT_VERIFIED);
						}
					}
					
					@Override
					public void onFailure(Throwable caught) {
						Window.alert("Fail verifySubscription: "+ caught.getLocalizedMessage());
					}
				});
			}});
		
	}
	
	
	
}
