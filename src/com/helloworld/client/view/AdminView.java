package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.AdminPresenter.Display;

public class AdminView extends Composite implements Display {

	private static AdminViewUiBinder uiBinder = GWT
			.create(AdminViewUiBinder.class);

	interface AdminViewUiBinder extends UiBinder<Widget, AdminView> {
	}

	@UiField
	Label globalPreferences;
	
	public AdminView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Label getGlobalPreferences() {
		return globalPreferences;
	}

}
