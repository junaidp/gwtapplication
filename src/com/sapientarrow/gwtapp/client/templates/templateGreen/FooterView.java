package com.sapientarrow.gwtapp.client.templates.templateGreen;

import org.gwtbootstrap3.client.ui.AnchorButton;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class FooterView extends Composite implements HasText {

	private static FooterViewUiBinder uiBinder = GWT.create(FooterViewUiBinder.class);

	interface FooterViewUiBinder extends UiBinder<Widget, FooterView> {
	}

	public FooterView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

//	@UiField
//	Button btnSignup1;
	
	//AnchorButton is Bootstrap Widget so
	//we have to import "import org.gwtbootstrap3.client.ui.AnchorButton;"
	@UiField
	AnchorButton btnSignup;   

	public FooterView(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		btnSignup.setText(firstName);
	}

	@UiHandler("btnSignup")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	public void setText(String text) {
		btnSignup.setText(text);
	}

	public String getText() {
		return btnSignup.getText();
	}

}
