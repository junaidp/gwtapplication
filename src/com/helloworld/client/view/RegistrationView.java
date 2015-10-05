package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.RegistrationPresenter.Display;

public class RegistrationView extends Composite implements Display, ViewFields {

	private static RegistrationViewUiBinder uiBinder = GWT
			.create(RegistrationViewUiBinder.class);

	interface RegistrationViewUiBinder extends
			UiBinder<Widget, RegistrationView> {
	}
	
	@UiField Button btnCancel;
	@UiField Button btnSubmit;
	@UiField TextBox name;
	@UiField TextBox userName;
	@UiField TextBox password;
	@UiField TextBox confirmPassword;
	@UiField TextBox email;
	@UiField Label nameError;
	@UiField Label userNameError;
	@UiField Label passwordError;
	@UiField Label confirmPasswordError;
	@UiField Label emailError;
	@UiField TextBox captchaTextBox;
	
	public RegistrationView() {
		initWidget(uiBinder.createAndBindUi(this));
		
		captchaTextBox.getElement().setId("recaptcha_response_field");
		captchaTextBox.setName("recaptcha_response_field");
		
//		showCaptcha("6LcEKg4TAAAAAFADmX5mrhcKkaeNMcxh7k5CiQ2K");
		
//		destroyCaptcha();
	}
	
//	private native void showCaptcha(String publicKey)
//	/*-{
//	    $wnd.Recaptcha.create(publicKey, "", {
//	        "theme" : "custom"
//	    });
//	}-*/;
//	
//	private native String getCaptchaChallenge()
//	/*-{
//	    return $wnd.Recaptcha.get_challenge();
//	}-*/;
//	
//	private native void destroyCaptcha()
//	/*-{
//	    $wnd.Recaptcha.destroy();
//	}-*/;

	public Button getBtnCancel() {
		return btnCancel;
	}

	public Button getBtnSubmit() {
		return btnSubmit;
	}

	public TextBox getName() {
		return name;
	}

	public TextBox getUserName() {
		return userName;
	}

	public TextBox getPassword() {
		return password;
	}

	public TextBox getConfirmPassword() {
		return confirmPassword;
	}

	public TextBox getEmail() {
		return email;
	}

	public Label getNameError() {
		return nameError;
	}

	public Label getUserNameError() {
		return userNameError;
	}

	public Label getPasswordError() {
		return passwordError;
	}

	public Label getEmailError() {
		return emailError;
	}

	public Label getConfirmPasswordError() {
		return confirmPasswordError;
	}

	@Override
	public void clearFields() {
		name.setText("");
		userName.setText("");
		email.setText("");
		password.setText("");
		confirmPassword.setText("");
		
	}

}
