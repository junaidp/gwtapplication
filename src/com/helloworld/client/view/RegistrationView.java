package com.helloworld.client.view;

import com.claudiushauptmann.gwt.recaptcha.client.RecaptchaWidget;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.RegistrationPresenter.Display;
import com.helloworld.shared.entity.User;

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
	@UiField VerticalPanel container;
	@UiField Label captchaError;
	private User loggedInUser;
	
	private RecaptchaWidget rw;
	
	public RegistrationView() {
		initWidget(uiBinder.createAndBindUi(this));
		rw = new RecaptchaWidget("6LcEKg4TAAAAAFADmX5mrhcKkaeNMcxh7k5CiQ2K");
		container.add(rw);

	}


	public RegistrationView(User loggedInUser) {
		name.setText(loggedInUser.getName());
		userName.setText(loggedInUser.getUserName());
		password.setText(loggedInUser.getPassword());
		email.setText(loggedInUser.getEmail());
		btnSubmit.setText("update");
	}


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
		nameError.setText("");
		emailError.setText("");
		passwordError.setText("");
		confirmPasswordError.setText("");
		userNameError.setText("");
		captchaError.setText("");
	}

	public RecaptchaWidget getRw() {
		return rw;
	}


	public Label getCaptchaError() {
		return captchaError;
	}


	public User getLoggedInUser() {
		return loggedInUser;
	}

}
