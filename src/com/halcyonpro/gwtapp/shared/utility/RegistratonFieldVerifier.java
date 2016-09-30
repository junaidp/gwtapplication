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
package com.halcyonpro.gwtapp.shared.utility;

import com.halcyonpro.gwtapp.client.presenter.RegistrationPresenter.Display;
import com.halcyonpro.gwtapp.client.view.ApplicationConstants;

// Field verifier for Registration
public class RegistratonFieldVerifier {
	private boolean verified = true;
	public boolean registratonFieldsVerifid(Display display){
		
		display.getUserNameError().setText(isValidUsername(display.getUserName().getText()));
		display.getNameError().setText(isValidName(display.getName().getText()));
		display.getPasswordError().setText(isValidPassword(display.getPassword().getText()));
		
		if(! display.getPassword().getText().equals(display.getConfirmPassword().getText())){
			verified = false;
			display.getConfirmPasswordError().setText(ApplicationConstants.PASSWORD_NOTMATCH);
		}else{
			display.getConfirmPasswordError().setText("");
		}
		return verified;
	
	}
	
	public String isValidName(String input){

		if(input.trim().length()<2 ){
			verified = false;
			return ApplicationConstants.INVALID_NAME;
		}
		return "";


	} 

	public String isValidUsername(String input){

		if(input.trim().length()<2 ){
			verified = false;
			return ApplicationConstants.INVALID_USERNAME;
		}
		return "";


	} 

	public String isValidPassword(String input){

		if(input.trim().length()<3 ){
			verified = false;
			return ApplicationConstants.INVALID_PASSWORD;
		}
		return "";


	} 

}
