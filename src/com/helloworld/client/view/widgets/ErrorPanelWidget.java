package com.helloworld.client.view.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class ErrorPanelWidget extends VerticalPanel {

	private static ErrorPanelWidgetUiBinder uiBinder = GWT
			.create(ErrorPanelWidgetUiBinder.class);

	interface ErrorPanelWidgetUiBinder extends
			UiBinder<Widget, ErrorPanelWidget> {
	}

	public ErrorPanelWidget() {
		add(uiBinder.createAndBindUi(this));
	}

}
