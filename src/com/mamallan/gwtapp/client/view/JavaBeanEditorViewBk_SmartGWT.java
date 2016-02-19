package com.mamallan.gwtapp.client.view;
//package com.helloworld.client.view;
//
//import com.google.gwt.core.client.GWT;
//import com.google.gwt.uibinder.client.UiBinder;
//import com.google.gwt.uibinder.client.UiField;
//import com.google.gwt.user.client.ui.Composite;
//import com.google.gwt.user.client.ui.HTMLPanel;
//import com.google.gwt.user.client.ui.Widget;
//import com.helloworld.client.presenter.JavaBeanEditorPresenter.Display;
//import com.smartgwt.client.widgets.Button;
//import com.smartgwt.client.widgets.form.DynamicForm;
//import com.smartgwt.client.widgets.form.fields.ButtonItem;
//import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
//import com.smartgwt.client.widgets.form.fields.SelectItem;
//import com.smartgwt.client.widgets.form.fields.TextItem;
//
//public class JavaBeanEditorViewBk_SmartGWT extends Composite implements Display {
//
//	private static JavaBeanEditorViewUiBinder uiBinder = GWT.create(JavaBeanEditorViewUiBinder.class);
//
//	interface JavaBeanEditorViewUiBinder extends UiBinder<Widget, JavaBeanEditorViewBk_SmartGWT> {
//	}
//	
//	@UiField
//	HTMLPanel panelBeanGenerator;
//	@UiField
//	HTMLPanel panelReflection;
//	private ButtonItem btnGenerate = new ButtonItem();
//	private ButtonItem btnAddProperty = new ButtonItem();
//	private TextItem txtBeanName = new TextItem();
//	private Button btnCreate = new Button();
//	private SelectItem listBeans = new SelectItem();
//	private ComboBoxItem listPackages = new ComboBoxItem();
//	
//	
//	public JavaBeanEditorViewBk_SmartGWT() {
//		initWidget(uiBinder.createAndBindUi(this));
////		listPackages.setTitle(ApplicationConstants.SELECT_PACKAGE);
////		txtBeanName.setEmptyDisplayValue(ApplicationConstants.ENTER_BEANNAME);
//		DynamicForm formBeanGenerator = new DynamicForm();
////		DynamicForm formBeanGeneratorButtons = new DynamicForm();
//		formBeanGenerator.setIsGroup(true);  
//		formBeanGenerator.setGroupTitle("Create Bean");  
//		DynamicForm formReflection = new DynamicForm();
//		formReflection.setNumCols(2);
////		formBeanGeneratorButtons.setNumCols(2);
//		
////		panelBeanGenerator.add(formBeanGenerator);
////		panelBeanGenerator.add(formBeanGeneratorButtons);
//		
//		
////		formBeanGeneratorButtons.setNumCols(2);
////		formBeanGeneratorButtons.setWidth(500);
//		
//		
//		
////		panelReflection.add(formReflection);
//		formBeanGenerator.setItems(listPackages, txtBeanName, btnAddProperty);
//		formBeanGenerator.setWidth("350px");
//		formReflection.setWidth("350px");
//		formReflection.setItems(listBeans, btnGenerate);
//		btnGenerate.setTitle("Generate Reflection");
//		btnCreate.setTitle("Create Bean");
//		btnAddProperty.setTitle("Add Property");
//		listPackages.setTitle("Select Package");
//		txtBeanName.setTitle("Enter Bean Name");
//		listBeans.setTitle("Select Bean For Reflection");
//		listBeans.setWrapTitle(false);
//		listPackages.setWrapTitle(false);
//		txtBeanName.setWrapTitle(false);
//		formReflection.setIsGroup(true);
//		formReflection.setGroupTitle("Generate Reflection");
//		formBeanGenerator.moveTo(100, 50);
//		btnCreate.moveTo(200, 200);
//		formReflection.moveTo(100, 250);
//		formBeanGenerator.draw();
//		btnCreate.draw();
//		formReflection.draw();
//	}
//	
//	public void clearFields(){
//		txtBeanName.hide();
//	
//	}
//	
//	public ButtonItem getBtnGenerate() {
//		return btnGenerate;
//	}
//	public void setBtnGenerate(ButtonItem btnGenerate) {
//		this.btnGenerate = btnGenerate;
//	}
//	
//	public TextItem getTxtBeanName() {
//		return txtBeanName;
//	}
//	public void setTxtBeanName(TextItem txtBeanName) {
//		this.txtBeanName = txtBeanName;
//	}
//
//	public ComboBoxItem getListPackages() {
//		return listPackages;
//	}
//
//
//
//	public Button getBtnCreate() {
//		return btnCreate;
//	}
//
//	public ButtonItem getBtnAddProperty() {
//		return btnAddProperty;
//	}
//
//	
//}
