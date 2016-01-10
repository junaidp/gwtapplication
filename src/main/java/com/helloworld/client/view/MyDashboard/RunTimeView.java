package com.helloworld.client.view.MyDashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.CenterPanels.CenterPanelsView;

public class RunTimeView extends CenterPanelsView {

	private static RunTimeViewUiBinder uiBinder = GWT
			.create(RunTimeViewUiBinder.class);

	interface RunTimeViewUiBinder extends UiBinder<Widget, RunTimeView> {
	}

	public RunTimeView() {
		container.add(uiBinder.createAndBindUi(this));
		setHeading(ApplicationConstants.RUNTIME_HEADING);
	}

}
