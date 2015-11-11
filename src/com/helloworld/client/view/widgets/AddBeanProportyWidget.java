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
import com.helloworld.shared.entity.UserEntity;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.events.ChangedEvent;
import com.smartgwt.client.widgets.form.fields.events.ChangedHandler;

public class AddBeanProportyWidget extends Composite {

	private static AddBeanProportyWidgetUiBinder uiBinder = GWT
			.create(AddBeanProportyWidgetUiBinder.class);

	interface AddBeanProportyWidgetUiBinder extends
			UiBinder<Widget, AddBeanProportyWidget> {
	}
	
	@UiField
	HTMLPanel comboContainer;

	public AddBeanProportyWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		
		ComboBoxItem listDataType = new ComboBoxItem("dataType");  
		final SelectItem listAccessModifiers = new SelectItem();
		final SelectItem listHaveGetterSetters = new SelectItem();
		final SelectItem listNonAccessModifiers = new SelectItem();
		
		
		
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
        valueMapDataType.put("string", "string");
       
        DynamicForm form = new DynamicForm();
        comboContainer.add(form);
        
        listDataType.setValueMap(valueMapDataType);
        listHaveGetterSetters.setValueMap(valueMapGetterSetters);
      
        form.setItems(listDataType, listAccessModifiers, listHaveGetterSetters);
        
        populateList(listAccessModifiers);
        
        listAccessModifiers.addChangedHandler(new ChangedHandler() {
			
			@Override
			public void onChanged(ChangedEvent event) {
				Window.alert(listAccessModifiers.getValueAsString());
				Window.alert(listAccessModifiers.getDisplayValue());
			}
		});
       
	}
	
	public void populateList(SelectItem listAccessModifiers){
		ArrayList<UserEntity> users = new ArrayList<UserEntity>();
		UserEntity user1 = new UserEntity();
		user1.setUserId(1);
		user1.setUserName("u1");
		UserEntity user2 = new UserEntity();
		user2.setUserId(2);
		user2.setUserName("u2");
		
		users.add(user1);
		users.add(user2);
		
		
		LinkedHashMap<String, String> valueMapAccessModifiers = new LinkedHashMap<String, String>();  
		valueMapAccessModifiers.put("public"   , "Public");  
		valueMapAccessModifiers.put("protected", "Protected"); 
		valueMapAccessModifiers.put("private"  , "Private"); 
		
//		valueMapAccessModifiers.clear();
//		for(int i=0; i< users.size(); i++){
//			valueMapAccessModifiers.put(users.get(i).getUserId()+""   , users.get(i).getUserName());  
//		}
		 listAccessModifiers.setValueMap(valueMapAccessModifiers); 
			
	}

}
