package com.helloworld.client.view.MyDashboard.MyAccountViews;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.ViewPlanPresenter.Display;

public class ViewPlanView extends Composite implements Display {

	private static ViewPlanViewUiBinder uiBinder = GWT
			.create(ViewPlanViewUiBinder.class);

	interface ViewPlanViewUiBinder extends UiBinder<Widget, ViewPlanView> {
	}
	
	@UiField 
	Label btnBack;

	public ViewPlanView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public Label getBtnBack() {
		
		return btnBack;
	}

}
