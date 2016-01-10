package com.helloworld.client.view.GlobalPreferencesPanels;

import com.helloworld.shared.entity.GlobalPreferencesEntity;

public interface GlobalPreferencesPanels {
	
	public void updateFieldsWithAlreadySavedPreferences(GlobalPreferencesEntity alreadySavedGlobalPreferencesEntity);
	public void disableAllFields();
	public void enableAllFields();
}
