package com.helloworld.shared.utility;

import com.helloworld.client.presenter.CreatePasswordPresenter.Display;
import com.helloworld.client.view.ApplicationConstants;


public class CreatePasswordFieldVerifier {
	private boolean verified = true;
	public boolean registratonFieldsVerifid(Display display){
		
		display.getNewPasswordError().setText(isValidPassword(display.getTxtNewPassword().getText()));
		
		if(! display.getTxtNewPassword().getText().equals(display.getTxtConfirmPassword().getText())){
			verified = false;
			display.getLblError().setText(ApplicationConstants.PASSWORD_NOTMATCH);
		}else{
			display.getLblError().setText("");
		}
		return verified;
	
	}
	
	
	public String isValidPassword(String input){

		if(input.trim().length()<3 ){
			verified = false;
			return ApplicationConstants.INVALID_PASSWORD;
		}
		return "";


	} 

}
