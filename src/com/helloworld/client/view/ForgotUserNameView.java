package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.ForgotUserNamePresenter.Display;

public class ForgotUserNameView extends Composite implements Display {

	private static ForgotUserNameViewUiBinder uiBinder = GWT
			.create(ForgotUserNameViewUiBinder.class);

	interface ForgotUserNameViewUiBinder extends
			UiBinder<Widget, ForgotUserNameView> {
	}
	@UiField
	TextBox txtEmail;
	@UiField
	Button btnSubmit;
	@UiField
	Label lblError;
	@UiField
	Button btnBack;
	

	public ForgotUserNameView() {
		initWidget(uiBinder.createAndBindUi(this));
		txtEmail.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_REGISTERED_EMAIL);
		
	}

	public TextBox getTxtEmail() {
		return txtEmail;
	}

	public Button getBtnSubmit() {
		return btnSubmit;
	}

	public Label getLblError() {
		return lblError;
	}

	public Button getBtnBack() {
		return btnBack;
	}

}
