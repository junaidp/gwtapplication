package com.mamallan.gwtapp.client.view.GlobalPreferencesPanels.MyAccountPreferences;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MyAccount extends Composite {

	private static MyAccountUiBinder uiBinder = GWT
			.create(MyAccountUiBinder.class);

	interface MyAccountUiBinder extends UiBinder<Widget, MyAccount> {
	}

	public MyAccount() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
