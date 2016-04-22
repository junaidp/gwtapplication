package com.mamallan.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.SubscriptionVerificationPresenter.Display;

public class SubscriptionVerificationView extends Composite implements Display {

	private static SubscriptionVerificationViewUiBinder uiBinder = GWT
			.create(SubscriptionVerificationViewUiBinder.class);

	interface SubscriptionVerificationViewUiBinder extends
			UiBinder<Widget, SubscriptionVerificationView> {
	}
	@UiField TextBox email;
	@UiField Button submit;
	@UiField Anchor registerAccount;
	

	public SubscriptionVerificationView() {
		initWidget(uiBinder.createAndBindUi(this));
		email.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_REGISTERED_EMAIL);
		RootPanel.get("headerContainer").clear();
		RootPanel.get("footerContainer").clear();

	}

	public TextBox getEmail() {
		return email;
	}

	public Button getSubmit() {
		return submit;
	}
	
	public Anchor getRegisterAccount() {
		return registerAccount;
	}


}
