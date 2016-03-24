package com.mamallan.gwtapp.shared;

import java.util.ArrayList;

public class UIFieldsErrors {
	ArrayList<UIFieldsError> error = new ArrayList<UIFieldsError>();
	
	public ArrayList<UIFieldsError> getErrors(){
		return error;
	}
	
	public void add(UIFieldsError uiFieldsError){
		error.add(uiFieldsError);
	}
	
	public void clear(){
		error.clear();
	}

}
