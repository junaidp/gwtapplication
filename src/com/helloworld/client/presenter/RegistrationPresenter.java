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
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.shared.entity.User;
import com.helloworld.shared.utility.RegistratonFieldVerifier;

public class RegistrationPresenter implements Presenter 

{

	private final Display display;
	private final HelloServiceAsync rpcService;

	public interface Display 
	{
		Widget asWidget();
		Button getBtnCancel();
		Button getBtnSubmit();
		TextBox getName();
		TextBox getUserName();
		TextBox getPassword();
		TextBox getConfirmPassword();
		TextBox getEmail();
		Label getNameError();
		Label getUserNameError();
		Label getEmailError();
		Label getPasswordError();
		Label getConfirmPasswordError();
		void clearFields();
	
	}  

	public RegistrationPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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
	}

	private void bind() {

		showCaptcha("6LcEKg4TAAAAAFADmX5mrhcKkaeNMcxh7k5CiQ2K");
	}

	@Override
	public void setHandlers() {
		display.getBtnCancel().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				History.newItem(ApplicationConstants.TOKEN_LOGIN);
			}});

		display.getBtnSubmit().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

//				Window.alert(display.getCaptchaImage().getChallenge());
//				Window.alert(display.getCaptchaImage().getResponse());

				String s = getCaptchaChallenge();
				addUser();
			}
		});
	}

	private native void showCaptcha(String publicKey)
	/*-{
	    $wnd.Recaptcha.create(publicKey, "", {
	        "theme" : "custom"
	    });
	}-*/;

	private native String getCaptchaChallenge()
	/*-{
	    return $wnd.Recaptcha.get_challenge();
	}-*/;

	private native void destroyCaptcha()
	/*-{
	    $wnd.Recaptcha.destroy();
	}-*/;

	private void addUser(){
		User user = new User();
		user.setEmail(display.getEmail().getText());
		user.setPassword(display.getPassword().getText());
		user.setUserName(display.getName().getText());
		new RegistratonFieldVerifier(display);

		rpcService.addUser(user, new AsyncCallback<String>() {

			@Override
			public void onSuccess(String result) {
				if(result.equals(ApplicationConstants.INVALID_EMAIL)){
					display.getEmailError().setText(result);
				}else{
					display.clearFields();
					Window.alert(result);
				}
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Fail: addUser "+ caught.getMessage());

			}
		});
	}

}
