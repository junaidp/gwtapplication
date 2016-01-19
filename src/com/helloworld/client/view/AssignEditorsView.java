package com.helloworld.client.view;

import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.AssignEditorsPresenter.Display;
import com.helloworld.client.view.widgets.UploadedComponents.UploadedClass;

public class AssignEditorsView extends Composite implements Display {

	private static AssignEditorsViewUiBinder uiBinder = GWT
			.create(AssignEditorsViewUiBinder.class);

	interface AssignEditorsViewUiBinder extends
			UiBinder<Widget, AssignEditorsView> {
	}
	
	@UiField HTMLPanel leftContainer;
	@UiField Button btnSubmit;
	
	public AssignEditorsView() {
		initWidget(uiBinder.createAndBindUi(this));
		
//		JSONValue jsonValue = JSONParser.parse(beanJson);
//		JSONObject object = jsonValue.isObject();
//		Set<String> keys =  object.keySet();
		

//		VerticalPanel vpnl = new VerticalPanel();
//		for (String s : keys) {
//		   Label lbl = new Label(s);
//		   vpnl.add(lbl);
//		}
		
//		leftContainer.add(vpnl);
		
		
	}

	public HTMLPanel getLeftContainer() {
		return leftContainer;
	}

	public Button getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(Button btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

}
