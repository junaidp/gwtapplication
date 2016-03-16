package com.mamallan.gwtapp.client.view.widgets;

import java.util.LinkedHashMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;

public class AddBindingWidget extends Composite {

	private static AddBindingWidgetUiBinder uiBinder = GWT
			.create(AddBindingWidgetUiBinder.class);

	interface AddBindingWidgetUiBinder extends
			UiBinder<Widget, AddBindingWidget> {
	}
	@UiField
	HTMLPanel panelBindingType;
	private ComboBoxItem listBindings = new ComboBoxItem();
	@UiField
	Image imgClose;
	private LinkedHashMap<String, String> valueMapDataType = new LinkedHashMap<String, String>();  
	

	public AddBindingWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		
		DynamicForm formPackages= new DynamicForm();
		panelBindingType.add(formPackages);
		formPackages.setItems(listBindings);
		listBindings.setShowTitle(false);
		listBindings.setHeight(20);
		listBindings.setPickerIconHeight(40);
		listBindings.setWidth(226);
		
		addPremetiveTypes();
	}

	private void addPremetiveTypes() {
		valueMapDataType.put("short"   , "short");  
        valueMapDataType.put("int"     , "int");  
        valueMapDataType.put("long"    , "long");  
        valueMapDataType.put("float"   , "float");  
        valueMapDataType.put("double"  , "double");  
        valueMapDataType.put("boolean" , "boolean");  
        valueMapDataType.put("char"    , "char");
        valueMapDataType.put("string"  , "String");
        valueMapDataType.put("byte"    , "byte");
        valueMapDataType.put("date"    , "date");
        
        listBindings.setValueMap(valueMapDataType);
		
	}

	public ComboBoxItem getListBindings() {
		return listBindings;
	}

	public void setListBindings(ComboBoxItem listBindings) {
		this.listBindings = listBindings;
	}

	public Image getImgClose() {
		return imgClose;
	}

}
