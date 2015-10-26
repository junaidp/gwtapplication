package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.widgets.DisplayAlert;
import com.helloworld.shared.entity.UserEntity;


public class CreatePasswordPresenter implements Presenter 

{
	
	private final Display display;
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private UserEntity user;

	public interface Display 
	{
		Widget asWidget();
		PasswordTextBox getTxtNewPassword();
		PasswordTextBox getTxtConfirmPassword();
		Button getBtnSubmit();
		String getCreatePasswordToken();
		
	}  

	public CreatePasswordPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.display = view;
		this.eventBus = eventBus;
		this.rpcService = rpcService;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
		fetchUser();
	}
	
	public void fetchUser(){
		
		rpcService.fetchNewUser(display.getCreatePasswordToken(), new AsyncCallback<UserEntity>(){

			@Override
			public void onFailure(Throwable caught) {
			
			}

			@Override
			public void onSuccess(UserEntity user1) {
				user = user1;
				isLoggedInWithIn20Mins();
			}

			});
	}
	
	private void isLoggedInWithIn20Mins() {
		rpcService.isLoggedInWithin20Mins(user, new AsyncCallback<Boolean>(){

			@Override
			public void onFailure(Throwable caught) {
				
			}

			@Override
			public void onSuccess(Boolean result) {
				if(! result){
					Window.alert("Your activation link expired ,Please request a new link from your Administrator");
					History.newItem(ApplicationConstants.TOKEN_LOGIN);
				}
			}});
	}
	

	private void bind() {


	}

	@Override
	public void setHandlers() {
		
		display.getBtnSubmit().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				user.setPassword(display.getTxtNewPassword().getText());
				updatePassword();
			}});
		
	}
	
	public void updatePassword(){
		rpcService.updatePassword(user, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Update password failed:"+ caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(String result) {
				new DisplayAlert(result);
				History.newItem(ApplicationConstants.TOKEN_LOGIN);
			}
		});
	
	}
	
}
