/*******************************************************************************
 * Copyright (c) 2015 Halcyon Technologies.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Affero GNU Public License
 *   which accompanies this distribution, and is available at
 *   https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   Copyright:
 *       Halcyon Technologies llc
 *   
 *   This file is part of the Business Suite software of Halcyonpro.net.
 *   Copyright (C) 2012-2020 Halcyonpro.net
 *  
 *   The primary contact email is support@halcyonpro.net
 *  
 *   Version: AGPL
 *  
 *   Halcyon Technologies, Halcyon Information Systems, Halcyonpro along with their domain names,  
 *   etc and the names Acuity, Ingenuity, Derivo, Colander etc are copyright of
 *   Halcyon llc and usage of these without prior permission of the owner is strictly prohibited
 *    
 *  The contents of this file may be used under the terms of
 *   the Affero GNU General Public License Version (the "AGPL"),
 *   A copy of the AGPL v2.1 can be obtained from https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   AGPL, in essence, means that this software requires a commercial license for use in or as a commercial application
 *******************************************************************************/
package com.halcyonpro.gwtapp.client.view;

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
import com.halcyonpro.gwtapp.client.presenter.LoginPresenter.Display;
 
//This class manages the VIEW of a Login Page of this application.
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
