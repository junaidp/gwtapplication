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
import com.helloworld.shared.utility.CreatePasswordFieldVerifier;


public class CreatePasswordPresenter implements Presenter 

{

	private final Display display;
	private final HelloServiceAsync rpcService;
	private UserEntity user;

	public interface Display 
	{
		Widget asWidget();
		PasswordTextBox getTxtNewPassword();
		PasswordTextBox getTxtConfirmPassword();
		Button getBtnSubmit();
		String getCreatePasswordToken();
		Label getLblError();
		Label getConfirmPasswordError();
		Label getNewPasswordError();

	}  

	public CreatePasswordPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.display = view;
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

				CreatePasswordFieldVerifier fieldVerifier = new CreatePasswordFieldVerifier();
				if(fieldVerifier.registratonFieldsVerifid(display)){
					user.setPassword(display.getTxtNewPassword().getText());
					updatePassword();
				}

			}});

	}

	public void updatePassword(){
		display.getBtnSubmit().addStyleName("loading-pulse");
		rpcService.updatePassword(user, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				display.getBtnSubmit().removeStyleName("loading-pulse");
				Window.alert("Update password failed:"+ caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(String result) {
				new DisplayAlert(result);
				display.getBtnSubmit().removeStyleName("loading-pulse");
				History.newItem(ApplicationConstants.TOKEN_LOGIN);
			}
		});

	}

}
