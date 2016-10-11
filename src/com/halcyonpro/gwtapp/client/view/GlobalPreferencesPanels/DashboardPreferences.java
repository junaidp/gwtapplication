package com.halcyonpro.gwtapp.client.view.GlobalPreferencesPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;
import com.halcyonpro.gwtapp.shared.entity.GlobalPreferencesEntity;

public class DashboardPreferences extends Composite {

	private static EditDashboardDetailsUiBinder uiBinder = GWT
			.create(EditDashboardDetailsUiBinder.class);

	interface EditDashboardDetailsUiBinder extends
			UiBinder<Widget, DashboardPreferences> {
	}

	public DashboardPreferences() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField
	RadioButton checkDashboard;
	@UiField
	RadioButton checkAccordion;
	@UiField
	RadioButton checkPortlet;

	public void updateFieldsWithAlreadySavedPreferences(
			GlobalPreferencesEntity alreadySavedGlobalPreferencesEntity) {
		
		 DOM.setElementAttribute(checkDashboard.getElement(), "id", "w3-radio");
		
		if(alreadySavedGlobalPreferencesEntity != null){
			checkDashboard.setChecked(alreadySavedGlobalPreferencesEntity.isPanelTypeDashboard());
			checkAccordion.setChecked(alreadySavedGlobalPreferencesEntity.isPanelTypeAccordion());
			checkPortlet.setChecked(alreadySavedGlobalPreferencesEntity.isPanelTypePortlet());
		}
		
	}

	public RadioButton getCheckDashboard() {
		return checkDashboard;
	}

	public void setCheckDashboard(RadioButton checkDashboard) {
		this.checkDashboard = checkDashboard;
	}

	public RadioButton getCheckAccordion() {
		return checkAccordion;
	}

	public void setCheckAccordion(RadioButton checkAccordion) {
		this.checkAccordion = checkAccordion;
	}

	public RadioButton getCheckPortlet() {
		return checkPortlet;
	}

	public void setCheckPortlet(RadioButton checkPortlet) {
		this.checkPortlet = checkPortlet;
	}

}
