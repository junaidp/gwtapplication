package com.helloworld.shared.utility;

import com.helloworld.client.presenter.RegistrationPresenter.Display;
import com.helloworld.client.view.ApplicationConstants;


public class RegistratonFieldVerifier {

	public RegistratonFieldVerifier(Display display){

		display.getUserNameError().setText(isValidUsername(display.getUserName().getText()));
		display.getNameError().setText(isValidName(display.getName().getText()));
		display.getPasswordError().setText(isValidPassword(display.getPassword().getText()));
		
		if(! display.getPassword().getText().equals(display.getConfirmPassword().getText())){
			display.getConfirmPasswordError().setText(ApplicationConstants.PASSWORD_NOTMATCH);
		}
	
	}
	
	public String isValidName(String input){

		if(input.trim().length()<2 ){
			return ApplicationConstants.INVALID_NAME;
		}
		return input;


	} 

	public String isValidUsername(String input){

		if(input.trim().length()<2 ){
			return ApplicationConstants.INVALID_USERNAME;
		}
		return input;


	} 

	public String isValidPassword(String input){

		if(input.trim().length()<3 ){
			return ApplicationConstants.INVALID_PASSWORD;
		}
		return input;


	} 

}
