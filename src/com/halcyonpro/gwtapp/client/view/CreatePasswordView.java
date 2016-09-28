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
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.Widget;
import com.halcyonpro.gwtapp.client.presenter.CreatePasswordPresenter.Display;
import com.halcyonpro.gwtapp.shared.entity.UserEntity;

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