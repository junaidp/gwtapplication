package com.helloworld.client.view.MyDashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.CenterPanels.CenterPanelsView;

public class ConfigurationView extends CenterPanelsView {

	private static ConfigurationViewUiBinder uiBinder = GWT
			.create(ConfigurationViewUiBinder.class);

	interface ConfigurationViewUiBinder extends
			UiBinder<Widget, ConfigurationView> {
	}

	public ConfigurationView() {
		container.add(uiBinder.createAndBindUi(this));
		setHeading(ApplicationConstants.CONFIGURATION_HEADING);
	}

}
