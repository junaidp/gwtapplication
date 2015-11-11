package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.JavaBeanEditorPresenter.Display;

public class JavaBeanEditorView extends Composite implements Display {

	private static JavaBeanEditorViewUiBinder uiBinder = GWT.create(JavaBeanEditorViewUiBinder.class);

	interface JavaBeanEditorViewUiBinder extends UiBinder<Widget, JavaBeanEditorView> {
	}
	
	@UiField Button btnGenerate;
	@UiField Button btnAddProperty;
	@UiField TextBox txtBeanName;

	public JavaBeanEditorView() {
		initWidget(uiBinder.createAndBindUi(this));
		txtBeanName.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_BEANNAME);
	}

	public Button getBtnGenerate() {
		return btnGenerate;
	}
	
	public Button getBtnAddProperty() {
		return btnAddProperty;
	}

}
