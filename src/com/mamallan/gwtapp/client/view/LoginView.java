package com.mamallan.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.LoginPresenter.Display;
  
public class LoginView extends Composite implements Display  {

	private static LoginViewUiBinder uiBinder = GWT
			.create(LoginViewUiBinder.class);
	

	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}
	
	@UiField TextBox txtUserName;
	@UiField PasswordTextBox txtPassword;
	@UiField Button btnSubmit;
	@UiField Label lblError;
	@UiField Anchor btnForgotPassword;
	@UiField Anchor btnForgotUsername;
	
	
	public LoginView() {
		initWidget(uiBinder.createAndBindUi(this));
		txtUserName.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_USERNAME);
		txtPassword.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_PASSWORD);
		RootPanel.get("headerContainer").clear();
		RootPanel.get("footerContainer").clear();
	
	}

	public TextBox getTxtUserName() {
		return txtUserName;
	}


	public void setTxtUserName(TextBox txtUserName) {
		this.txtUserName = txtUserName;
	}


	public PasswordTextBox getTxtPassword() {
		return txtPassword;
	}


	public void setTxtPassword(PasswordTextBox txtPassword) {
		this.txtPassword = txtPassword;
	}

	public Button getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(Button btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	
	public Label getLblError() {
		return lblError;
	}

	public Anchor getBtnForgotPassword() {
		return btnForgotPassword;
	}

	public Anchor getBtnForgotUsername() {
		return btnForgotUsername;
	}



}
