package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.MainPresenter.Display;
import com.helloworld.client.view.ControlPanels.ControlPanelsContainer;
import com.helloworld.shared.entity.UserEntity;

public class MainView extends Composite implements Display{

	private static MainViewUiBinder uiBinder = GWT
			.create(MainViewUiBinder.class);

	interface MainViewUiBinder extends UiBinder<Widget, MainView> {
	}
	
	@UiField
	VerticalPanel center;
	@UiField
	ControlPanelsContainer controlPanelContainer;
	@UiField Label lblWelcome;
	@UiField DisclosurePanel discPanel;
	private UserEntity loggedInUser;
	@UiField Anchor ancFileUpload;
	@UiField Anchor ancJavaBeanEditor;
	@UiField Anchor ancGlobalPreferences;
	@UiField Anchor ancDownloadJson;

	public MainView(UserEntity loggedInUser) {
		initWidget(uiBinder.createAndBindUi(this));
		this.loggedInUser = loggedInUser;
		lblWelcome.setText(loggedInUser.getUserName());

	}

	public ControlPanelsContainer getControlPanelContainer() {
		return controlPanelContainer;
	}

	public void setControlPanelContainer(
			ControlPanelsContainer controlPanelContainer) {
		this.controlPanelContainer = controlPanelContainer;
	}

	public VerticalPanel getCenter() {
		return center;
	}

	public void setCenter(VerticalPanel center) {
		this.center = center;
	}


	public UserEntity getLoggedInUser() {
		return loggedInUser;
	}

	public Anchor getFileUpload() {
		return ancFileUpload;
	}

	public Anchor getAncJavaBeanEditor() {
		return ancJavaBeanEditor;
	}

	public Anchor getAncGlobalPreferences() {
		return ancGlobalPreferences;
	}

	public Anchor getAncDownloadJson() {
		return ancDownloadJson;
	}

	public void setAncDownloadJson(Anchor ancDownloadJson) {
		this.ancDownloadJson = ancDownloadJson;
	}


}
