package com.helloworld.client.view.MyDashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.CenterPanels.CenterPanelsView;

public class ConfigurationView extends VerticalPanel {

	private static ConfigurationViewUiBinder uiBinder = GWT
			.create(ConfigurationViewUiBinder.class);

	interface ConfigurationViewUiBinder extends
			UiBinder<Widget, ConfigurationView> {
	}

	public ConfigurationView() {
		add(uiBinder.createAndBindUi(this));
//		container.add(uiBinder.createAndBindUi(this));
//		setHeading(ApplicationConstants.CONFIGURATION_HEADING);
	}

}
