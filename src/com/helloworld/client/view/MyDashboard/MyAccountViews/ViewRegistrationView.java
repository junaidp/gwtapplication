package com.helloworld.client.view.MyDashboard.MyAccountViews;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.ViewRegistrationPresenter.Display;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.MyAccountPreferencesEntity;

public class ViewRegistrationView extends Composite implements Display{

	private static ViewRegistrationViewUiBinder uiBinder = GWT
			.create(ViewRegistrationViewUiBinder.class);

	interface ViewRegistrationViewUiBinder extends
			UiBinder<Widget, ViewRegistrationView> {
	}
	@UiField
	HTMLPanel panelFirstName;
	@UiField
	HTMLPanel panelLastName;
	@UiField
	HTMLPanel panelRegisteredTo;
	@UiField
	HTMLPanel panelLastEdited;
	@UiField
	TextBox txtFirstName;
	@UiField
	TextBox txtLastName;
	@UiField
	TextBox txtRegisteredTo;
	@UiField
	Label lblLastEdited;
	@UiField
	Button btnUpdate;
	@UiField
	Anchor ancEdit;

	public ViewRegistrationView() {
		initWidget(uiBinder.createAndBindUi(this));
		setHandlers();
		
	}

	private void setHandlers() {
		ancEdit.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				enableAllFields();
			}

			
		});
	}

	@Override
	public void displaySelectedPanels(
			MyAccountPreferencesEntity myAccountPreferencesEntity) {
		if(myAccountPreferencesEntity!=null){
			panelFirstName.setVisible(myAccountPreferencesEntity.isViewRegFirstName());
			panelLastEdited.setVisible(myAccountPreferencesEntity.isViewRegLastEdited());
			panelLastName.setVisible(myAccountPreferencesEntity.isViewRegLastName());
			panelRegisteredTo.setVisible(myAccountPreferencesEntity.isViewRegRegisteredTo());
			ancEdit.setVisible(myAccountPreferencesEntity.isViewRegAllowEditing());
		}
	}

	@Override
	public Button getBtnUpdate() {
		return btnUpdate;
	}

	@Override
	public void updateUIFields(MyAccountEntity myAccountEntity) {
		txtFirstName.setText(myAccountEntity.getFirstName());
		txtLastName.setText(myAccountEntity.getLastName());
		txtRegisteredTo.setText(myAccountEntity.getRegisteredTo());
		lblLastEdited.setText(myAccountEntity.getLastEdited().toLocaleString().substring(10));
	}

	@Override
	public void updateEntity(MyAccountEntity myAccountEntity) {
		myAccountEntity.setFirstName(txtFirstName.getText());
		myAccountEntity.setLastName(txtLastName.getText());
		myAccountEntity.setRegisteredTo(txtRegisteredTo.getText());
	}
	
	private void enableAllFields() {
		txtFirstName.setEnabled(true);
		txtLastName.setEnabled(true);
		txtRegisteredTo.setEnabled(true);
		
		
	}

}
