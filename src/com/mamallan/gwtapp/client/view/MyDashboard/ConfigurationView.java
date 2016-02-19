package com.mamallan.gwtapp.client.view.MyDashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

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
