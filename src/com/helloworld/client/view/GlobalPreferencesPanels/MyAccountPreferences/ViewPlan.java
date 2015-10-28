package com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.view.GlobalPreferencesPanels.GlobalPreferencesPanels;
import com.helloworld.shared.entity.GlobalPreferencesEntity;

public class ViewPlan extends Composite implements GlobalPreferencesPanels {

	private static ViewPlanUiBinder uiBinder = GWT
			.create(ViewPlanUiBinder.class);

	interface ViewPlanUiBinder extends UiBinder<Widget, ViewPlan> {
	}
	@UiField CheckBox checkBoxPlanType;
	@UiField CheckBox paymentDetails;
	@UiField CheckBox checkBoxPaymentPlan;
	@UiField CheckBox checkBoxMonthly;
	@UiField CheckBox checkBoxQuaterly;
	@UiField CheckBox checkBoxYearly;
	
	public ViewPlan() {
		initWidget(uiBinder.createAndBindUi(this));
		setPaymentTermsLayout();
	}
	
	@SuppressWarnings("deprecation")
	public void updateFieldsWithAlreadySavedPreferences(GlobalPreferencesEntity alreadySavedGlobalPreferencesEntity){
		if(alreadySavedGlobalPreferencesEntity != null){
			checkBoxPlanType.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isShowPlanType());
			paymentDetails.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isShowPaymentDetails());
			checkBoxPaymentPlan.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewPaymentTerms());
			checkBoxMonthly.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewPlanMonthlyPayments());
			checkBoxQuaterly.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewPlanQuarterlyPayments());
			checkBoxYearly.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewPlanYearlyPayments());
		}
	}
	
	public void setPaymentTermsLayout(){
		checkBoxMonthly.addValueChangeHandler(new ValueChangeHandler<Boolean>() {

			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				if(event.getValue() == true){
					checkBoxPaymentPlan.setChecked(true);
				}
			}
			
			
		});
		
		checkBoxQuaterly.addValueChangeHandler(new ValueChangeHandler<Boolean>() {

			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				if(event.getValue() == true){
					checkBoxPaymentPlan.setChecked(true);
				}
			}
			
			
		});
		
		checkBoxYearly.addValueChangeHandler(new ValueChangeHandler<Boolean>() {

			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				if(event.getValue() == true){
					checkBoxPaymentPlan.setChecked(true);
				}
			}
			
			
		});
	}

	public CheckBox getPlanType() {
		return checkBoxPlanType;
	}

	public void setPlanType(CheckBox planType) {
		this.checkBoxPlanType = planType;
	}

	public CheckBox getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(CheckBox paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public CheckBox getCheckBoxPlanType() {
		return checkBoxPlanType;
	}

	public CheckBox getCheckBoxPaymentPlan() {
		return checkBoxPaymentPlan;
	}

	public CheckBox getCheckBoxMonthly() {
		return checkBoxMonthly;
	}

	public CheckBox getCheckBoxQuaterly() {
		return checkBoxQuaterly;
	}

	public CheckBox getCheckBoxYearly() {
		return checkBoxYearly;
	}

	@Override
	public void disableAllFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enableAllFields() {
		// TODO Auto-generated method stub
		
	}

}
