package com.helloworld.client.view.widgets;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.shared.entity.UserEntity;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.form.fields.events.ChangedEvent;
import com.smartgwt.client.widgets.form.fields.events.ChangedHandler;
import com.smartgwt.client.widgets.layout.HLayout;

public class AddBeanProportyWidget extends Composite {

	private static AddBeanProportyWidgetUiBinder uiBinder = GWT
			.create(AddBeanProportyWidgetUiBinder.class);

	interface AddBeanProportyWidgetUiBinder extends
			UiBinder<Widget, AddBeanProportyWidget> {
	}
	
	@UiField
	HTMLPanel comboContainer;
	ComboBoxItem listDataType = new ComboBoxItem("dataType");  
	private SelectItem listAccessModifiers = new SelectItem();
	private SelectItem listHaveGetterSetters = new SelectItem();
	private SelectItem listNonAccessModifiers = new SelectItem();
	private ButtonItem btnSave = new ButtonItem();
	private TextItem textPropertyName = new TextItem();

	public AddBeanProportyWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		listDataType.setTitle("Data Type");  
		listAccessModifiers.setTitle("Access Modifiers");
		listNonAccessModifiers.setTitle("Non Access Modifiers");
		listHaveGetterSetters.setTitle("Getters/Setters");
		
		listDataType.setWidth(300);
		listAccessModifiers.setWidth(300);
		listHaveGetterSetters.setWidth(300);
		listNonAccessModifiers.setWidth(300);
		listDataType.setWrapTitle(false);
		listAccessModifiers.setWrapTitle(false);
		listHaveGetterSetters.setWrapTitle(false);
		listNonAccessModifiers.setWrapTitle(false);
		textPropertyName.setWidth(300);
		textPropertyName.setTitle(ApplicationConstants.PROPERTY_NAME);
		
		
		//TODO: Populate lists from database....
		LinkedHashMap<String, String> valueMapDataType = new LinkedHashMap<String, String>();  
		LinkedHashMap<String, String> valueMapGetterSetters = new LinkedHashMap<String, String>();  
		LinkedHashMap<String, String> valueMapNonAccessModifiers = new LinkedHashMap<String, String>();  
		   
		valueMapGetterSetters.put("getters", "Getters");
		valueMapGetterSetters.put("setters", "Setters");
		valueMapGetterSetters.put("both", "Both");
		
		valueMapDataType.put("short", "short");  
        valueMapDataType.put("int", "int");  
        valueMapDataType.put("long", "long");  
        valueMapDataType.put("float", "float");  
        valueMapDataType.put("double", "double");  
        valueMapDataType.put("boolean", "boolean");  
        valueMapDataType.put("char", "char");
        valueMapDataType.put("string", "String");
        valueMapDataType.put("byte", "byte");
       
        DynamicForm form = new DynamicForm();
        comboContainer.add(form);
        btnSave.setTitle(ApplicationConstants.SAVE);
        listDataType.setValueMap(valueMapDataType);
        listHaveGetterSetters.setValueMap(valueMapGetterSetters);
      
        form.setItems(textPropertyName, listDataType, listAccessModifiers, listHaveGetterSetters, btnSave);
        form.setHeight(300);
        
        populateList(listAccessModifiers);
        
        listAccessModifiers.addChangedHandler(new ChangedHandler() {
			
			@Override
			public void onChanged(ChangedEvent event) {
				
			}
		});
       
	}
	
	public void populateList(SelectItem listAccessModifiers){
		
		LinkedHashMap<String, String> valueMapAccessModifiers = new LinkedHashMap<String, String>();  
		valueMapAccessModifiers.put("public"   , "public");  
		valueMapAccessModifiers.put("protected", "protected"); 
		valueMapAccessModifiers.put("private"  , "private"); 
		listAccessModifiers.setValueMap(valueMapAccessModifiers); 
			
	}

	public HTMLPanel getComboContainer() {
		return comboContainer;
	}

	public ComboBoxItem getListDataType() {
		return listDataType;
	}

	public SelectItem getListAccessModifiers() {
		return listAccessModifiers;
	}

	public SelectItem getListHaveGetterSetters() {
		return listHaveGetterSetters;
	}

	public SelectItem getListNonAccessModifiers() {
		return listNonAccessModifiers;
	}

	public TextItem getTextPropertyName() {
		return textPropertyName;
	}

	public ButtonItem getBtnSave() {
		return btnSave;
	}

}
