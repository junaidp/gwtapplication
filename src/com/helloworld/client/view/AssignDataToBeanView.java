package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.AssignDataToBeanPresenter.Display;
import com.helloworld.client.view.widgets.ErrorPanelWidget;

public class AssignDataToBeanView extends Composite implements Display {

	private static AssignEditorsViewUiBinder uiBinder = GWT
			.create(AssignEditorsViewUiBinder.class);

	interface AssignEditorsViewUiBinder extends
			UiBinder<Widget, AssignDataToBeanView> {
	}
	
	@UiField HTMLPanel beanUiContainer;
	@UiField Button btnSubmit;
	@UiField ErrorPanelWidget errorPanelWidget;
	
	public AssignDataToBeanView() {
		initWidget(uiBinder.createAndBindUi(this));
		errorPanelWidget.setVisible(false);
	}

	public Button getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(Button btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	public HTMLPanel getBeanUiContainer() {
		return beanUiContainer;
	}

	public ErrorPanelWidget getErrorPanelWidget() {
		return errorPanelWidget;
	}

}
