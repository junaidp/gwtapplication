package com.mamallan.gwtapp.shared;


public class UIFieldsError {
	private String errorMessage = "";

	public UIFieldsError(String inputMessage){
		this.errorMessage = inputMessage;
	}
	
	public String getErrorMessage(){
		return errorMessage;
	}
	
}