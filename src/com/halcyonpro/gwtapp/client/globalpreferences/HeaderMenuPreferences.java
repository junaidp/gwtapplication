package com.halcyonpro.gwtapp.client.globalpreferences;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.halcyonpro.gwtapp.shared.entity.GlobalPreferencesEntity;

public class HeaderMenuPreferences extends Composite {

	private static HeaderMenuPreferencesUiBinder uiBinder = GWT
			.create(HeaderMenuPreferencesUiBinder.class);

	interface HeaderMenuPreferencesUiBinder extends
			UiBinder<Widget, HeaderMenuPreferences> {
	}
	
	@UiField
	CheckBox checkHome;
	@UiField
	CheckBox checkAboutUs;
	@UiField
	CheckBox checkContactUs;

	public HeaderMenuPreferences() {
		initWidget(uiBinder.createAndBindUi(this));
	}



	public void updateFieldsWithAlreadySavedPreferences(
			GlobalPreferencesEntity alreadySavedGlobalPreferencesEntity) {
		
//		checkAboutUs.setChecked(alreadySavedGlobalPreferencesEntity.getHeaderMenuPreferencesId().isAboutUs());
//		checkContactUs.setChecked(alreadySavedGlobalPreferencesEntity.getHeaderMenuPreferencesId().isContactUs());
//		checkHome.setChecked(alreadySavedGlobalPreferencesEntity.getHeaderMenuPreferencesId().isHome());
		
	}
	
	public CheckBox getCheckHome() {
		return checkHome;
	}

	public void setCheckHome(CheckBox checkHome) {
		this.checkHome = checkHome;
	}

	public CheckBox getCheckAboutUs() {
		return checkAboutUs;
	}

	public void setCheckAboutUs(CheckBox checkAboutUs) {
		this.checkAboutUs = checkAboutUs;
	}

	public CheckBox getCheckContactUs() {
		return checkContactUs;
	}

	public void setCheckContactUs(CheckBox checkContactUs) {
		this.checkContactUs = checkContactUs;
	}

}
