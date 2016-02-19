package com.mamallan.gwtapp.client.view;

import com.claudiushauptmann.gwt.recaptcha.client.RecaptchaWidget;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.RegistrationPresenter.Display;
import com.mamallan.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.mamallan.gwtapp.shared.entity.UserEntity;

public class RegistrationView extends Composite implements Display {

	private static RegistrationViewUiBinder uiBinder = GWT
			.create(RegistrationViewUiBinder.class);

	interface RegistrationViewUiBinder extends
			UiBinder<Widget, RegistrationView> {
	}
	
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
	@UiField TextBox registeredTo;
	@UiField Label registedToError;
	@UiField HTMLPanel panelRegisteredTo;
	@UiField VerticalPanel container;
	@UiField Label captchaError;
	@UiField HTMLPanel panelName;
	@UiField HTMLPanel panelUserName;
	@UiField HTMLPanel panelEmail;
	@UiField HTMLPanel panelPassword;
	@UiField HTMLPanel panelConfirmPassword;
	@UiField HTMLPanel panelCloseAccount;
	@UiField Button btnCloseAccount;
	
	private UserEntity loggedInUser;
	private GlobalPreferencesEntity globalPreferencesEntity;
	
	
	private RecaptchaWidget rw;
	
	public RegistrationView() {
		initWidget(uiBinder.createAndBindUi(this));
		rw = new RecaptchaWidget("6LcEKg4TAAAAAFADmX5mrhcKkaeNMcxh7k5CiQ2K");
		container.add(rw);
		btnCloseAccount.setVisible(false);

	}


	public RegistrationView(UserEntity loggedInUser, GlobalPreferencesEntity globalPreferencesEntity) {
		this.loggedInUser = loggedInUser;
		this.globalPreferencesEntity = globalPreferencesEntity;
		initWidget(uiBinder.createAndBindUi(this));
		rw = new RecaptchaWidget("6LcEKg4TAAAAAFADmX5mrhcKkaeNMcxh7k5CiQ2K");
		name.setText(loggedInUser.getName());
		userName.setText(loggedInUser.getUserName());
		password.setText(loggedInUser.getPassword());
		email.setText(loggedInUser.getEmail());
		btnSubmit.setText("update");
		btnCloseAccount.setVisible(true);
		confirmPassword.setText(loggedInUser.getPassword());
		registeredTo.setText(loggedInUser.getMyAccountId().getRegisteredTo());
		displayPanelsAsPerGlobalPreferences();
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
		registeredTo.setText("");
		registedToError.setText("");
		captchaError.setText("");
	}
	
	public void displayPanelsAsPerGlobalPreferences(){
		panelEmail.setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isEditRegEmail());
		panelConfirmPassword.setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isEditRegPassword());
		panelPassword.setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isEditRegPassword());
		panelName.setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isEditRegName());
		panelUserName.setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isEditRegUserName());
		panelRegisteredTo.setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isEditRegRegisteredTo());
		panelCloseAccount.setVisible(globalPreferencesEntity.getMyAccountPreferencesId().isEditRegCloseAccount());
	}

	public RecaptchaWidget getRw() {
		return rw;
	}


	public Label getCaptchaError() {
		return captchaError;
	}


	public UserEntity getLoggedInUser() {
		return loggedInUser;
	}


	public TextBox getRegisteredTo() {
		return registeredTo;
	}


	public Label getRegistedToError() {
		return registedToError;
	}


	public Button getBtnCloseAccount() {
		return btnCloseAccount;
	}

}
