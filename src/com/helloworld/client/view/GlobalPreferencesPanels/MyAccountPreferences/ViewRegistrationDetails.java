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

public class ViewRegistrationDetails extends Composite implements GlobalPreferencesPanels{

	private static ViewRegistrationDetailsUiBinder uiBinder = GWT
			.create(ViewRegistrationDetailsUiBinder.class);

	interface ViewRegistrationDetailsUiBinder extends
			UiBinder<Widget, ViewRegistrationDetails> {
	}
	
	@UiField
	CheckBox checkShowThisPanel;
	@UiField
	CheckBox checkRegisteredTo;
	@UiField
	CheckBox checkFirstName;
	@UiField
	CheckBox checkLastName;
	@UiField
	CheckBox checkPassword;
	@UiField
	CheckBox checkLastTimeEdited;
	@UiField
	CheckBox checkAllowEditing;
	

	public ViewRegistrationDetails() {
		initWidget(uiBinder.createAndBindUi(this));
		
		setHandlers();
	}


	private void setHandlers() {
		checkShowThisPanel.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				if(event.getValue()== true){
					enableAllFields();
				}else{
					disableAllFields();
				}
			}
		});
	}


	public CheckBox getCheckShowThisPanel() {
		return checkShowThisPanel;
	}


	public void setCheckShowThisPanel(CheckBox checkShowThisPanel) {
		this.checkShowThisPanel = checkShowThisPanel;
	}


	public CheckBox getCheckRegisteredTo() {
		return checkRegisteredTo;
	}


	public void setCheckRegisteredTo(CheckBox checkRegisteredTo) {
		this.checkRegisteredTo = checkRegisteredTo;
	}


	public CheckBox getCheckLastName() {
		return checkLastName;
	}


	public void setCheckLastName(CheckBox checkLastName) {
		this.checkLastName = checkLastName;
	}


	public CheckBox getCheckPassword() {
		return checkPassword;
	}


	public void setCheckPassword(CheckBox checkPassword) {
		this.checkPassword = checkPassword;
	}


	public CheckBox getCheckLastTimeEdited() {
		return checkLastTimeEdited;
	}


	public void setCheckLastTimeEdited(CheckBox checkLastTimeEdited) {
		this.checkLastTimeEdited = checkLastTimeEdited;
	}


	@SuppressWarnings("deprecation")
	@Override
	public void updateFieldsWithAlreadySavedPreferences(
			GlobalPreferencesEntity alreadySavedGlobalPreferencesEntity) {
		if(alreadySavedGlobalPreferencesEntity != null){
			checkLastName.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewRegLastName());
			checkFirstName.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewRegFirstName());
			checkLastTimeEdited.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewRegLastEdited());
			checkPassword.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewRegPassword());
			checkRegisteredTo.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewRegRegisteredTo());
			checkShowThisPanel.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewRegShowPanel());
			checkAllowEditing.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewRegAllowEditing());
			
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public void disableAllFields() {
		checkShowThisPanel.setChecked(false);
		checkRegisteredTo.setChecked(false);
		checkFirstName.setChecked(false);
		checkLastName.setChecked(false);
		checkPassword.setChecked(false);
		checkLastTimeEdited.setChecked(false);
		checkAllowEditing.setChecked(false);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void enableAllFields() {
		checkShowThisPanel.setChecked(true);
		checkRegisteredTo.setChecked(true);
		checkFirstName.setChecked(true);
		checkLastName.setChecked(true);
		checkPassword.setChecked(true);
		checkLastTimeEdited.setChecked(true);
		checkAllowEditing.setChecked(true);
	}


	public CheckBox getCheckFirstName() {
		return checkFirstName;
	}


	public void setCheckFirstName(CheckBox checkFirstName) {
		this.checkFirstName = checkFirstName;
	}


	public CheckBox getCheckAllowEditing() {
		return checkAllowEditing;
	}

}
