package com.helloworld.client.view.ControlPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class ControlPanelView extends Composite {

	private static ControlPanelViewUiBinder uiBinder = GWT
			.create(ControlPanelViewUiBinder.class);

	interface ControlPanelViewUiBinder extends
			UiBinder<Widget, ControlPanelView> {
	}
	
	@UiField
	Label heading;
	@UiField
	Image imageUrl;

	public ControlPanelView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setHeading(String text){
		heading.setText(text);
	}
	public void setImage(String url){
		imageUrl.setUrl(url);
	}

	public Label getHeading() {
		return heading;
	}

	public void setHeading(Label heading) {
		this.heading = heading;
	}

}
