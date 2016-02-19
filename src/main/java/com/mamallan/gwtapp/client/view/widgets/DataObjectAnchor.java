package com.mamallan.gwtapp.client.view.widgets;

import com.google.gwt.user.client.ui.Anchor;

public class DataObjectAnchor extends Anchor{
	
	private String packageName;
	
	public DataObjectAnchor(){
		addStyleName("point");
		
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	

}
