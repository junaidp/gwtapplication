package com.mamallan.gwtapp.client.view.MyDashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.client.view.CenterPanels.CenterPanelsView;

public class MyAccountView extends CenterPanelsView {

	private static MyAccountViewUiBinder uiBinder = GWT
			.create(MyAccountViewUiBinder.class);

	interface MyAccountViewUiBinder extends UiBinder<Widget, MyAccountView> {
	}

	public MyAccountView() {
		container.add(uiBinder.createAndBindUi(this));
		setHeading(ApplicationConstants.MYACCOUNT_HEADING);
	}

}
