package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.DashboardPresenter.Display;

import com.helloworld.client.view.MyDashboard.MyAccountPanel;

public class DashboardView extends Composite implements Display {

	private static DashboardViewUiBinder uiBinder = GWT
			.create(DashboardViewUiBinder.class);

	interface DashboardViewUiBinder extends UiBinder<Widget, DashboardView> {
	}

	public DashboardView() {
		initWidget(uiBinder.createAndBindUi(this));
	
	}

	public MyAccountPanel getMyAccount() {
		return null;
	}

}
