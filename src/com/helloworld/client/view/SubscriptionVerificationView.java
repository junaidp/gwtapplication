package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.SubscriptionVerificationPresenter.Display;

public class SubscriptionVerificationView extends Composite implements Display {

	private static SubscriptionVerificationViewUiBinder uiBinder = GWT
			.create(SubscriptionVerificationViewUiBinder.class);

	interface SubscriptionVerificationViewUiBinder extends
			UiBinder<Widget, SubscriptionVerificationView> {
	}
	@UiField TextBox email;
	@UiField Button submit;
	

	public SubscriptionVerificationView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public TextBox getEmail() {
		return email;
	}

	public Button getSubmit() {
		return submit;
	}

}
