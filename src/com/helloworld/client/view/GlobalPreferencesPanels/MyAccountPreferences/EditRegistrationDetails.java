package com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class EditRegistrationDetails extends Composite {

	private static EditRegistrationDetailsUiBinder uiBinder = GWT
			.create(EditRegistrationDetailsUiBinder.class);

	interface EditRegistrationDetailsUiBinder extends
			UiBinder<Widget, EditRegistrationDetails> {
	}

	public EditRegistrationDetails() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
