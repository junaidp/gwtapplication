package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.MainPresenter.Display;
import com.helloworld.client.view.ControlPanels.ControlPanelsContainer;

public class MainView extends Composite implements Display{

	private static MainViewUiBinder uiBinder = GWT
			.create(MainViewUiBinder.class);

	interface MainViewUiBinder extends UiBinder<Widget, MainView> {
	}
	
	@UiField
	VerticalPanel center;
	@UiField
	ControlPanelsContainer controlPanelContainer;

	public MainView() {
		initWidget(uiBinder.createAndBindUi(this));
		
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

}
