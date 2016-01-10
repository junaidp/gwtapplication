package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.CreatePasswordPresenter.Display;
import com.helloworld.shared.entity.UserEntity;

public class CreatePasswordView extends Composite implements Display {

	private static CreatePasswordViewUiBinder uiBinder = GWT
			.create(CreatePasswordViewUiBinder.class);

	interface CreatePasswordViewUiBinder extends
			UiBinder<Widget, CreatePasswordView> {
	}
	
	@UiField
	PasswordTextBox txtNewPassword;
	@UiField
	PasswordTextBox txtConfirmPassword;
	@UiField
	Button btnSubmit;
	@UiField
	Label lblError;
	@UiField
	Label confirmPasswordError;
	@UiField
	Label newPasswordError;
	
	
	private UserEntity loggedInUser ;
	private String createPasswordToken;

	public CreatePasswordView(UserEntity loggedInUser, String createPasswordtoken) {
		initWidget(uiBinder.createAndBindUi(this));
		this.loggedInUser = loggedInUser;
		this.createPasswordToken = createPasswordtoken;
		txtNewPassword.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_NEW_PASSWORD);
		txtConfirmPassword.getElement().setPropertyString("placeholder", ApplicationConstants.CONFIRM_NEW_PASSWORD);
		
	}

	public PasswordTextBox getTxtNewPassword() {
		return txtNewPassword;
	}

	public PasswordTextBox getTxtConfirmPassword() {
		return txtConfirmPassword;
	}

	public Button getBtnSubmit() {
		return btnSubmit;
	}

	public UserEntity getLoggedInUser() {
		return loggedInUser;
	}

	public String getCreatePasswordToken() {
		return createPasswordToken;
	}

	public Label getLblError() {
		return lblError;
	}

	public Label getConfirmPasswordError() {
		return confirmPasswordError;
	}

	public Label getNewPasswordError() {
		return newPasswordError;
	}

}
