package com.halcyonpro.gwtapp.client.view.GlobalPreferencesPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.halcyonpro.gwtapp.client.view.ApplicationConstants;
import com.halcyonpro.gwtapp.client.view.widgets.Attachment;
import com.halcyonpro.gwtapp.client.view.widgets.LogoAttachment;
import com.halcyonpro.gwtapp.shared.entity.GlobalPreferencesEntity;

public class LogoPreferences extends Composite {

	private static HeaderPreferencesUiBinder uiBinder = GWT
			.create(HeaderPreferencesUiBinder.class);

	
	interface HeaderPreferencesUiBinder extends
			UiBinder<Widget, LogoPreferences> {
	}
	
	@UiField
	LogoAttachment attachmentPanel;
	@UiField
	Image currentLogo;
	@UiField
	TextBox txtWidth;
	@UiField
	TextBox txtHeight;

	public LogoPreferences() {
		initWidget(uiBinder.createAndBindUi(this));
		txtWidth.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_WIDTH);
		txtHeight.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_HEIGHT);
	}
	
	

	public void updateFieldsWithAlreadySavedPreferences(
			GlobalPreferencesEntity alreadySavedGlobalPreferencesEntity) {

		attachmentPanel.setLogoUrl(alreadySavedGlobalPreferencesEntity.getLogoUrl());
		txtHeight.setText(alreadySavedGlobalPreferencesEntity.getLogoHeight()+"");
		txtWidth.setText(alreadySavedGlobalPreferencesEntity.getLogoWidth()+"");
	}



	public LogoAttachment getAttachmentPanel() {
		return attachmentPanel;
	}



	public TextBox getTxtWidth() {
		return txtWidth;
	}



	public TextBox getTxtHeight() {
		return txtHeight;
	}

}
