package com.helloworld.client.view.MyDashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.CenterPanels.CenterPanelsView;

public class MyAccountPanel extends CenterPanelsView {

	private static MyAccountViewUiBinder uiBinder = GWT
			.create(MyAccountViewUiBinder.class);

	interface MyAccountViewUiBinder extends UiBinder<Widget, MyAccountPanel> {
	}

	public MyAccountPanel() {
		container.add(uiBinder.createAndBindUi(this));
		setHeading(ApplicationConstants.MYACCOUNT_HEADING);
	}

}
