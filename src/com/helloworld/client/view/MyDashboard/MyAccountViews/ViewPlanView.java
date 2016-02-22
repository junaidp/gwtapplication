package com.helloworld.client.view.MyDashboard.MyAccountViews;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.ViewPlanPresenter.Display;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.MyAccountPreferencesEntity;

public class ViewPlanView extends Composite implements Display {

	private static ViewPlanViewUiBinder uiBinder = GWT
			.create(ViewPlanViewUiBinder.class);

	interface ViewPlanViewUiBinder extends UiBinder<Widget, ViewPlanView> {
	}


	@UiField
	FlowPanel planTypePanel;
	@UiField
	FlowPanel panelPaymentTerms;
	@UiField
	FlowPanel paymentDetailsPanel;
	@UiField
	RadioButton radioMonthlyPayments;
	@UiField
	RadioButton radioQuarterlyPayments;
	@UiField
	RadioButton radioYearlyPayments;
	@UiField
	Label lblPaymentTerms;
	@UiField
	Button btnUpdate;


	public ViewPlanView() {
		initWidget(uiBinder.createAndBindUi(this));
	}


	//Display only panels which Admin selected from Global preferences
	public void displaySelectedPanels(MyAccountPreferencesEntity myAccountPreferencesEntity){
		if(myAccountPreferencesEntity!=null){
			planTypePanel.setVisible(myAccountPreferencesEntity.isShowPaymentDetails());
			paymentDetailsPanel.setVisible(myAccountPreferencesEntity.isShowPlanType());
			panelPaymentTerms.setVisible(myAccountPreferencesEntity.isViewPaymentTerms());
			radioMonthlyPayments.setVisible(myAccountPreferencesEntity.isViewPlanMonthlyPayments());
			radioQuarterlyPayments.setVisible(myAccountPreferencesEntity.isViewPlanQuarterlyPayments());
			radioYearlyPayments.setVisible(myAccountPreferencesEntity.isViewPlanYearlyPayments());
			lblPaymentTerms.setVisible(myAccountPreferencesEntity.isViewPaymentTerms());
		}

	}

	public Button getBtnUpdate() {
		return btnUpdate;
	}

	//Update Fields in UI as per User Saved last time in View Plan section
	@SuppressWarnings("deprecation")
	@Override
	public void updateFields(MyAccountEntity myAccountEntity) {
		radioMonthlyPayments.setChecked(myAccountEntity.isMonthlyPaymentPlan());
		radioQuarterlyPayments.setChecked(myAccountEntity.isQuarterlyPaymentPlan());
		radioYearlyPayments.setChecked(myAccountEntity.isYearlyPaymentPlan());
		
	}
	
	//Update Entity for saving in db as per user selection in UI
	@SuppressWarnings("deprecation")
	@Override
	public void updateMyAccount(MyAccountEntity myAccountEntity){
		myAccountEntity.setMonthlyPaymentPlan(radioMonthlyPayments.isChecked());
		myAccountEntity.setQuarterlyPaymentPlan(radioQuarterlyPayments.isChecked());
		myAccountEntity.setYearlyPaymentPlan(radioYearlyPayments.isChecked());
	}

	
}
