package com.helloworld.shared.utility;

import com.helloworld.client.presenter.RegistrationPresenter.Display;
import com.helloworld.client.view.ApplicationConstants;


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
