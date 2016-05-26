package com.mamallan.gwtapp.client.presenter;


import java.util.List;

import org.fusesource.restygwt.client.Defaults;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.RestClient;
import com.mamallan.gwtapp.client.event.RegistrationEvent;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.shared.RestEntity;

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
//				final LoadingPopup loadingPopup = new LoadingPopup();
//				loadingPopup.display();
				
				Defaults.setServiceRoot(GWT.getHostPageBaseURL());
				RestClient client = GWT.create(RestClient.class);
				
				client.verifySubscription(display.getEmail().getText(), new MethodCallback<Boolean>() {
					
					@Override
					public void onSuccess(Method method, Boolean result) {
						display.getSubmit().removeStyleName("loading-pulse");
						if(result){
						History.newItem(ApplicationConstants.TOKEN_LOGIN);
						}else{
							Window.alert(ApplicationConstants.SUBSCRIPTION_NOT_VERIFIED);
						}
					}
					
					@Override
					public void onFailure(Method method, Throwable exception) {
						display.getSubmit().removeStyleName("loading-pulse");
						Window.alert("Fail verifySubscription: "+ exception.getLocalizedMessage());
					}
				});
				
//				display.getSubmit().addStyleName("loading-pulse");
//				rpcService.verifySubscription(display.getEmail().getText(), new AsyncCallback<Boolean>() {
//					
//					@Override
//					public void onSuccess(Boolean result) {
//						display.getSubmit().removeStyleName("loading-pulse");
//						if(result){
//						History.newItem(ApplicationConstants.TOKEN_LOGIN);
//						}else{
//							Window.alert(ApplicationConstants.SUBSCRIPTION_NOT_VERIFIED);
//						}
//					}
//					
//					@Override
//					public void onFailure(Throwable caught) {
//						display.getSubmit().removeStyleName("loading-pulse");
//						Window.alert("Fail verifySubscription: "+ caught.getLocalizedMessage());
//					}
//				});
			}
			});
		
	}
	
	
	
	
	
	
}
