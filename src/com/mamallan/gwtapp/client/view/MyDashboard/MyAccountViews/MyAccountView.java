package com.mamallan.gwtapp.client.view.MyDashboard.MyAccountViews;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.MyAccountPresenter.Display;

public class MyAccountView extends Composite implements Display {

	private static myAccountViewUiBinder uiBinder = GWT
			.create(myAccountViewUiBinder.class);

	interface myAccountViewUiBinder extends UiBinder<Widget, MyAccountView> {
	}
	
	
	@UiField
	FocusPanel panelViewPlan;
	@UiField
	FocusPanel panelViewReg;
	@UiField
	FocusPanel panelEditReg;

	public MyAccountView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public FocusPanel getPanelViewPlan() {
		return panelViewPlan;
	}

	public FocusPanel getPanelViewReg() {
		return panelViewReg;
	}

	public void setPanelViewReg(FocusPanel panelViewReg) {
		this.panelViewReg = panelViewReg;
	}

	public FocusPanel getPanelEditReg() {
		return panelEditReg;
	}

	public void setPanelEditReg(FocusPanel panelEditReg) {
		this.panelEditReg = panelEditReg;
	}

	
}
