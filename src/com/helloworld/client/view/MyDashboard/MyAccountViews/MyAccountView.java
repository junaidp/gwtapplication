package com.helloworld.client.view.MyDashboard.MyAccountViews;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.MyAccountPresenter.Display;

public class MyAccountView extends Composite implements Display {

	private static myAccountViewUiBinder uiBinder = GWT
			.create(myAccountViewUiBinder.class);

	interface myAccountViewUiBinder extends UiBinder<Widget, MyAccountView> {
	}
	
	@UiField 
	Label btnBack;
	@UiField
	FocusPanel panelViewPlan;

	public MyAccountView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public Label getBtnBack() {
		
		return btnBack;
	}

	public FocusPanel getPanelViewPlan() {
		return panelViewPlan;
	}

}
