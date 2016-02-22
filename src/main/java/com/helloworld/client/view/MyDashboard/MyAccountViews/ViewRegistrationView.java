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
import com.helloworld.shared.entity.UserEntity;

public class ViewRegistrationView extends Composite implements Display{

	private static ViewRegistrationViewUiBinder uiBinder = GWT
			.create(ViewRegistrationViewUiBinder.class);

	interface ViewRegistrationViewUiBinder extends
			UiBinder<Widget, ViewRegistrationView> {
	}
	@UiField
	HTMLPanel panelName;
	@UiField
	HTMLPanel panelUserName;
	@UiField
	HTMLPanel panelEmail;
	@UiField
	HTMLPanel panelRegisteredTo;
	@UiField
	HTMLPanel panelLastEdited;
	@UiField
	Label lblName;
	@UiField
	Label lblUserName;
	@UiField
	Label lblEmail;
	@UiField
	Label lblRegisteredTo;
	@UiField
	Label lblLastEdited;

	public ViewRegistrationView() {
		initWidget(uiBinder.createAndBindUi(this));
		setHandlers();
		
	}

	private void setHandlers() {
		
	}

	@Override
	public void displaySelectedPanels(
			MyAccountPreferencesEntity myAccountPreferencesEntity) {
		if(myAccountPreferencesEntity!=null){
			panelName.setVisible(myAccountPreferencesEntity.isViewRegName());
			panelLastEdited.setVisible(myAccountPreferencesEntity.isViewRegLastEdited());
			panelUserName.setVisible(myAccountPreferencesEntity.isViewRegUserName());
			panelEmail.setVisible(myAccountPreferencesEntity.isViewRegEmail());
			panelRegisteredTo.setVisible(myAccountPreferencesEntity.isViewRegRegisteredTo());
		
		}
	}

	

	@Override
	public void updateUIFields(UserEntity userEntity) {
		lblName.setText(userEntity.getName());
		lblUserName.setText(userEntity.getUserName());
		lblEmail.setText(userEntity.getEmail());
		lblRegisteredTo.setText(userEntity.getMyAccountId().getRegisteredTo());
		lblLastEdited.setText(userEntity.getMyAccountId().getLastEdited()+"");
	}

	
	
	


}
