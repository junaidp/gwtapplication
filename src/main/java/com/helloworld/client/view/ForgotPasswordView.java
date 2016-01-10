package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.ForgotPasswordPresenter.Display;

public class ForgotPasswordView extends Composite implements Display{

	private static ForgotPasswordViewUiBinder uiBinder = GWT
			.create(ForgotPasswordViewUiBinder.class);

	interface ForgotPasswordViewUiBinder extends
			UiBinder<Widget, ForgotPasswordView> {
	}
	
	
	@UiField
	Button btnSubmit;
	@UiField
	HTML htmlError;
	@UiField
	TextBox txtUserName;
	@UiField
	TextBox txtEmail;
	
	

	public ForgotPasswordView() {
		initWidget(uiBinder.createAndBindUi(this));
		txtUserName.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_USERNAME);
		txtEmail.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_REGISTERED_EMAIL);
	}

	
	public Button getBtnSubmit() {
		return btnSubmit;
	}



	public TextBox getTxtUserName() {
		return txtUserName;
	}

	public TextBox getTxtEmail() {
		return txtEmail;
	}

	public HTML getHtmlError() {
		return htmlError;
	}

	public void setHtmlError(SafeHtml safeHtml) {
		this.htmlError.setHTML(safeHtml);
	}
//
//	@Override
//	public HTML setHtmlError(SafeHtml safeHtml) {
//		// TODO Auto-generated method stub
//		return null;
//	}


}
