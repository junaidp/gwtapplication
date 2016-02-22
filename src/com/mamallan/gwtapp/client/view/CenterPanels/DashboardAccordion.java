package com.mamallan.gwtapp.client.view.CenterPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.DashboardAccordionPresenter.Display;

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
