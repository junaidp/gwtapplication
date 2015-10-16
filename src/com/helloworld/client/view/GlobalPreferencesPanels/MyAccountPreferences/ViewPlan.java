package com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ViewPlan extends Composite {

	private static ViewPlanUiBinder uiBinder = GWT
			.create(ViewPlanUiBinder.class);

	interface ViewPlanUiBinder extends UiBinder<Widget, ViewPlan> {
	}
	@UiField CheckBox planType;
	@UiField CheckBox paymentDetails;
	
	public ViewPlan() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public CheckBox getPlanType() {
		return planType;
	}

	public void setPlanType(CheckBox planType) {
		this.planType = planType;
	}

	public CheckBox getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(CheckBox paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

}
