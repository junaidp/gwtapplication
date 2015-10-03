package com.helloworld.client.view.CenterPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class CenterPanelsView extends VerticalPanel {

	private static CenterPanelsViewUiBinder uiBinder = GWT
			.create(CenterPanelsViewUiBinder.class);

	interface CenterPanelsViewUiBinder extends
			UiBinder<Widget, CenterPanelsView> {
	}
	
	@UiField
	public HTMLPanel container;
	@UiField
	public Label heading;

	public CenterPanelsView() {
	add(uiBinder.createAndBindUi(this));
	
	}
	
	public void setHeading(String text){
		heading.setText(text);
		
	}


}
