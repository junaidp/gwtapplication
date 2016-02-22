package com.mamallan.gwtapp.client.view.GlobalPreferencesPanels.MyAccountPreferences;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.view.GlobalPreferencesPanels.GlobalPreferencesPanels;
import com.mamallan.gwtapp.shared.entity.GlobalPreferencesEntity;

public class EditRegistrationDetails extends Composite implements GlobalPreferencesPanels {

	private static EditRegistrationDetailsUiBinder uiBinder = GWT
			.create(EditRegistrationDetailsUiBinder.class);

	interface EditRegistrationDetailsUiBinder extends
			UiBinder<Widget, EditRegistrationDetails> {
	}

	public EditRegistrationDetails() {
		initWidget(uiBinder.createAndBindUi(this));
		setHandlers();
	}
	
	@UiField
	CheckBox checkShowThisPanel;
	@UiField
	CheckBox checkRegisteredTo;
	@UiField
	CheckBox checkName;
	@UiField
	CheckBox checkEmail;
	@UiField
	CheckBox checkUserName;
	@UiField
	CheckBox checkPassword;
	@UiField
	CheckBox checkCloseAccount;
	
	
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
	
	@SuppressWarnings("deprecation")
	@Override
	public void updateFieldsWithAlreadySavedPreferences(
			GlobalPreferencesEntity alreadySavedGlobalPreferencesEntity) {
		if(alreadySavedGlobalPreferencesEntity != null){
			checkName.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isEditRegName());
			checkUserName.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isEditRegUserName());
			checkEmail.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isEditRegEmail());
			checkRegisteredTo.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isEditRegRegisteredTo());
			checkShowThisPanel.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isEditRegShowPanel());
			checkPassword.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isEditRegPassword());
			checkCloseAccount.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isEditRegCloseAccount());
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public void disableAllFields() {
		checkRegisteredTo.setChecked(false);
		checkName.setChecked(false);
		checkUserName.setChecked(false);
		checkEmail.setChecked(false);
		checkPassword.setChecked(false);
		checkCloseAccount.setChecked(false);
		checkRegisteredTo.setEnabled(false);
		checkName.setEnabled(false);
		checkUserName.setEnabled(false);
		checkEmail.setEnabled(false);
		checkPassword.setEnabled(false);
		}

	@SuppressWarnings("deprecation")
	@Override
	public void enableAllFields() {
		checkRegisteredTo.setChecked(true);
		checkName.setChecked(true);
		checkUserName.setChecked(true);
		checkEmail.setChecked(true);
		checkPassword.setChecked(true);
		checkCloseAccount.setChecked(true);
		checkRegisteredTo.setEnabled(true);
		checkName.setEnabled(true);
		checkUserName.setEnabled(true);
		checkEmail.setEnabled(true);
		checkPassword.setEnabled(true);
	}

	public CheckBox getCheckShowThisPanel() {
		return checkShowThisPanel;
	}

	public CheckBox getCheckRegisteredTo() {
		return checkRegisteredTo;
	}

	public CheckBox getCheckName() {
		return checkName;
	}

	public CheckBox getCheckEmail() {
		return checkEmail;
	}

	public CheckBox getCheckUserName() {
		return checkUserName;
	}

	public CheckBox getCheckPassword() {
		return checkPassword;
	}

	public CheckBox getCheckCloseAccount() {
		return checkCloseAccount;
	}


}
