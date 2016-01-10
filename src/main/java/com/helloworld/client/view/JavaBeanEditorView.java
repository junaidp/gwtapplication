package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.JavaBeanEditorPresenter.Display;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.TextItem;

public class JavaBeanEditorView extends Composite implements Display {

	private static JavaBeanEditorViewUiBinder uiBinder = GWT.create(JavaBeanEditorViewUiBinder.class);

	interface JavaBeanEditorViewUiBinder extends UiBinder<Widget, JavaBeanEditorView> {
	}
	
	@UiField
	HTMLPanel panelBeanGenerator;
	@UiField
	HTMLPanel panelReflection;
	private ButtonItem btnGenerate = new ButtonItem();
	private ButtonItem btnAddProperty = new ButtonItem();
	private TextItem txtBeanName = new TextItem();
	private ButtonItem btnCreate = new ButtonItem();
	private SelectItem listBeans = new SelectItem();
	private ComboBoxItem listPackages = new ComboBoxItem();
	
	
	public JavaBeanEditorView() {
		initWidget(uiBinder.createAndBindUi(this));
//		listPackages.setTitle(ApplicationConstants.SELECT_PACKAGE);
//		txtBeanName.setEmptyDisplayValue(ApplicationConstants.ENTER_BEANNAME);
		DynamicForm formBeanGenerator = new DynamicForm();
		DynamicForm formReflection = new DynamicForm();
		panelBeanGenerator.add(formBeanGenerator);
		panelReflection.add(formReflection);
		formBeanGenerator.setItems(listPackages, txtBeanName, btnAddProperty, btnCreate);
		formReflection.setItems(listBeans, btnGenerate);
		btnGenerate.setTitle("Generate Reflection");
		btnCreate.setTitle("Create Bean");
		btnAddProperty.setTitle("Add Property");
		listPackages.setTitle("Select Package");
		txtBeanName.setTitle("Enter Bean Name");
		listBeans.setTitle("Select Bean For Reflection");
		listBeans.setWrapTitle(false);
		listPackages.setWrapTitle(false);
		txtBeanName.setWrapTitle(false);
		
		
	}
	
	public void clearFields(){
		
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

	public ComboBoxItem getListPackages() {
		return listPackages;
	}

	
}
