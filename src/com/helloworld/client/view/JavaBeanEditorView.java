package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.JavaBeanEditorPresenter.Display;
import com.helloworld.client.view.widgets.AddBeanProportyWidget;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.TextItem;

public class JavaBeanEditorView extends Composite implements Display {

	private static JavaBeanEditorViewUiBinder uiBinder = GWT.create(JavaBeanEditorViewUiBinder.class);

	interface JavaBeanEditorViewUiBinder extends UiBinder<Widget, JavaBeanEditorView> {
	}
	
	@UiField
	DynamicForm form;
	@UiField
	DynamicForm formReflection;
	private ButtonItem btnGenerate = new ButtonItem("Create Reflection");
	private ButtonItem btnAddProperty = new ButtonItem("Add Property");
	private TextItem txtBeanName = new TextItem();
	private ButtonItem btnCreate = new ButtonItem("Create Bean");
	private SelectItem listBeans = new SelectItem();
	private SelectItem listPackages = new SelectItem();
	
	public JavaBeanEditorView() {
		initWidget(uiBinder.createAndBindUi(this));
		listPackages.setTitle(ApplicationConstants.SELECT_PACKAGE);
		txtBeanName.setEmptyDisplayValue(ApplicationConstants.ENTER_BEANNAME);
		form.setItems(listPackages, txtBeanName, btnAddProperty, btnCreate);
		formReflection.setItems(listBeans, btnGenerate);
	}
	
	public ButtonItem getBtnGenerate() {
		return btnGenerate;
	}
	public void setBtnGenerate(ButtonItem btnGenerate) {
		this.btnGenerate = btnGenerate;
	}
	public ButtonItem getBtnAddProperty() {
		return btnAddProperty;
	}
	public void setBtnAddProperty(ButtonItem btnAddProperty) {
		this.btnAddProperty = btnAddProperty;
	}
	public TextItem getTxtBeanName() {
		return txtBeanName;
	}
	public void setTxtBeanName(TextItem txtBeanName) {
		this.txtBeanName = txtBeanName;
	}
	public ButtonItem getBtnCreate() {
		return btnCreate;
	}
	public void setBtnCreate(ButtonItem btnCreate) {
		this.btnCreate = btnCreate;
	}

	
}
