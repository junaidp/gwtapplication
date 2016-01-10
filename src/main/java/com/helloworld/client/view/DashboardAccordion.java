package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.DashboardAccordionPresenter.Display;

public class DashboardAccordion extends Composite implements Display {

	private static DashboardAccordionUiBinder uiBinder = GWT
			.create(DashboardAccordionUiBinder.class);

	interface DashboardAccordionUiBinder extends
			UiBinder<Widget, DashboardAccordion> {
	}

	public DashboardAccordion() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	
	public DashboardAccordion(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}



}
