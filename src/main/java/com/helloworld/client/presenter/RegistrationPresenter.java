package com.helloworld.client.presenter;

import com.claudiushauptmann.gwt.recaptcha.client.RecaptchaWidget;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
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
import com.helloworld.client.view.widgets.DisplayAlert;
import com.helloworld.client.view.widgets.LoadingPopup;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.UserEntity;
import com.helloworld.shared.utility.RegistratonFieldVerifier;

public class RegistrationPresenter implements Presenter 

{

	private final Display display;
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;

	public interface Display 
	{
		Widget asWidget();
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
		RecaptchaWidget getRw();
		Label getCaptchaError();
		UserEntity getLoggedInUser();
		TextBox getRegisteredTo();
		Label getRegistedToError();
		Button getBtnCloseAccount();

	}  

	public RegistrationPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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
		if(display.getBtnSubmit().getText().equals("update")){
			display.getRw().setVisible(false);
		}else{
			display.getRw().setVisible(true);
		}
	}

	@Override
	public void setHandlers() {
		
		display.getBtnCloseAccount().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				boolean confirm = Window.confirm(ApplicationConstants.CLOSE_ACCOUNT_WARNING);
				if(confirm){
					closeAccount();
				}
			}

		
		});

		display.getBtnSubmit().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				if(display.getBtnSubmit().getText().equals("update")){
					addUpdateUser(display.getLoggedInUser());
				}else{
					verifyCaptcha(display.getRw().getChallenge(), display.getRw().getResponse());
				}
			}
		});
	}

	public void verifyCaptcha(String challenge, String response){
		final LoadingPopup loadingPopup = new LoadingPopup();
		loadingPopup.display();
		rpcService.verifyCaptcha(challenge, response, new AsyncCallback<Boolean>() {

			@Override
			public void onSuccess(Boolean result) {
				if(loadingPopup!=null){
					loadingPopup.remove();
				}
			
				display.getRw().reload();
				if(result){
					display.getCaptchaError().setText("");
					UserEntity user = new UserEntity();
					addUpdateUser(user);

				}
				else{
					display.getCaptchaError().setText(ApplicationConstants.CAPTCHANOTVERIFIED);
				}

			}

			@Override
			public void onFailure(Throwable caught) {
				if(loadingPopup!=null){
					loadingPopup.remove();
				}
				Window.alert(caught.getLocalizedMessage());
			}
		});
	}

	private void addUpdateUser(UserEntity user){
		user.setEmail(display.getEmail().getText());
		user.setPassword(display.getPassword().getText());
		user.setUserName(display.getUserName().getText());
		user.setName(display.getName().getText());
		user.setStatus(ApplicationConstants.ACTIVE);
		if(user.getMyAccountId()==null){
			MyAccountEntity myAccountEntity = new MyAccountEntity();
			user.setMyAccountId(myAccountEntity);
		}
		user.getMyAccountId().setRegisteredTo(display.getRegisteredTo().getText());
		
		
		
		RegistratonFieldVerifier regFieldVerifier = new RegistratonFieldVerifier();
		if(regFieldVerifier.registratonFieldsVerifid(display)){
			addUserInDb(user);
		}
	}

	private void addUserInDb(UserEntity user) {
//		final LoadingPopup loadingPopup = new LoadingPopup();
//		loadingPopup.display();
		display.getBtnSubmit().addStyleName("loading-pulse");
		rpcService.addUser(user, new AsyncCallback<String>() {

			@Override
			public void onSuccess(String result) {
//				if(loadingPopup!=null){
//					loadingPopup.remove();
//				}
				if(result.equals(ApplicationConstants.INVALID_EMAIL) || result.equals(ApplicationConstants.EMAIL_NOT_AVAILABLE)) {
					display.getEmailError().setText(result);
				}
				else if(result.equals(ApplicationConstants.USERNAME_NOT_AVAILABLE)){
					display.getUserNameError().setText(result);
				}
				else{
					if(! display.getBtnSubmit().getText().equals("update")){
					display.clearFields();
					}
					
					new DisplayAlert(result);
					History.newItem(ApplicationConstants.TOKEN_LOGIN);
				}
				display.getBtnSubmit().removeStyleName("loading-pulse");
			}

			@Override
			public void onFailure(Throwable caught) {
//				if(loadingPopup!=null){
//					loadingPopup.remove();
//				}
				Window.alert("Fail: addUser "+ caught.getMessage());
				History.newItem(ApplicationConstants.TOKEN_LOGIN);
				display.getBtnSubmit().removeStyleName("loading-pulse");
			}
		});
	}
	
	private void closeAccount() {
		display.getLoggedInUser().setStatus(ApplicationConstants.CLOSED);
		rpcService.closeAccount(display.getLoggedInUser(), new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				new DisplayAlert(result);
				History.newItem(ApplicationConstants.TOKEN_LOGIN);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Fail Account close : "+ caught.getLocalizedMessage());
			}
		});
		
	}

}
