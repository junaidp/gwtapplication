package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MetroTest extends Composite {

	private static MetroTestUiBinder uiBinder = GWT
			.create(MetroTestUiBinder.class);

	interface MetroTestUiBinder extends UiBinder<Widget, MetroTest> {
	}

	public MetroTest() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
