package com.mamallan.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.ManageUserPresenter.Display;

public class ManageUserView extends Composite implements Display {

	private static ManageUserViewUiBinder uiBinder = GWT
			.create(ManageUserViewUiBinder.class);

	interface ManageUserViewUiBinder extends UiBinder<Widget, ManageUserView> {
	}

	@UiField
	Button btnSubmit;
	@UiField
	CheckBox checkActive;
	@UiField
	ListBox lisUsers;
	
	public ManageUserView() {
		initWidget(uiBinder.createAndBindUi(this));
		lisUsers.addItem("Select User","0");
	}

	public CheckBox getCheckActive() {
		return checkActive;
	}

	public Button getBtnSubmit() {
		return btnSubmit;
	}

	public ListBox getLisUsers() {
		return lisUsers;
	}

}
