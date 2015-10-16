package com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ViewRegistrationDetails extends Composite {

	private static ViewRegistrationDetailsUiBinder uiBinder = GWT
			.create(ViewRegistrationDetailsUiBinder.class);

	interface ViewRegistrationDetailsUiBinder extends
			UiBinder<Widget, ViewRegistrationDetails> {
	}

	public ViewRegistrationDetails() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
