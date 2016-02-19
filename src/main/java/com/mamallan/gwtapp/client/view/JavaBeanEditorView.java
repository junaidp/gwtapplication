package com.mamallan.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.JavaBeanEditorPresenter.Display;
import com.mamallan.gwtapp.client.view.widgets.AddAnnotationsWidget;
import com.mamallan.gwtapp.client.view.widgets.AddBeanProportyWidget;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;


public class JavaBeanEditorView extends Composite implements Display {

	private static JavaBeanEditorViewUiBinder uiBinder = GWT.create(JavaBeanEditorViewUiBinder.class);

	interface JavaBeanEditorViewUiBinder extends UiBinder<Widget, JavaBeanEditorView> {
	}
	
	@UiField
	Button btnGenerate;
	@UiField
	Button btnAddProperty;
	@UiField
	Button btnCreate;
	@UiField
	TextBox txtBeanName;
	@UiField
	ListBox listBeans;
	@UiField
	HTMLPanel panelDynamicForm;
	@UiField
	AddBeanProportyWidget addBeanPropertyWidget;
	@UiField
	ListBox listAddObject;
	@UiField
	VerticalPanel vpnlObjectContainer;
	@UiField
	AddAnnotationsWidget addAnnotationsWidget;
	@UiField
	Anchor btnAssignEditors;
	
	private ComboBoxItem listPackages = new ComboBoxItem();
	
	
	public JavaBeanEditorView() {
		initWidget(uiBinder.createAndBindUi(this));
		txtBeanName.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_BEANNAME);
		listAddObject.addItem(ApplicationConstants.ADDOBJECT);
		listBeans.addItem(ApplicationConstants.SELECT_FOR_REFLECTION);
		DynamicForm formPackages= new DynamicForm();
		panelDynamicForm.add(formPackages);
		formPackages.setItems(listPackages);
		listPackages.setShowTitle(false);
		listPackages.setHeight(20);
		listPackages.setPickerIconHeight(40);
		listPackages.setWidth(200);
		addAnnotationsWidget.getLblHeading().setText(ApplicationConstants.CLASS_LEVEL_ANNOTATIONS);
		
	}
	
	public void clearFields(){
		
	
	}

	public Button getBtnGenerate() {
		return btnGenerate;
	}

	public Button getBtnAddProperty() {
		return btnAddProperty;
	}

	public Button getBtnCreate() {
		return btnCreate;
	}

	public TextBox getTxtBeanName() {
		return txtBeanName;
	}

	public ListBox getListBeans() {
		return listBeans;
	}

	public ComboBoxItem getListPackages() {
		return listPackages;
	}

	public AddBeanProportyWidget getAddBeanPropertyWidget() {
		return addBeanPropertyWidget;
	}

	public ListBox getListAddObject() {
		return listAddObject;
	}

	public VerticalPanel getVpnlObjectContainer() {
		return vpnlObjectContainer;
	}

	public AddAnnotationsWidget getAddAnnotationsWidget() {
		return addAnnotationsWidget;
	}

	public Anchor getBtnAssignEditors() {
		return btnAssignEditors;
	}

	
	
	
}
