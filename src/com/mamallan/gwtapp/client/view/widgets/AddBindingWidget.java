package com.mamallan.gwtapp.client.view.widgets;

import java.util.LinkedHashMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
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
	private ComboBoxItem listNameSpace = new ComboBoxItem();
	@UiField
	Image imgClose;
	@UiField 
	TextBox txtBindingName;
	@UiField
	TextBox txtBindingValue;
	@UiField 
	Button btnSave;
	@UiField
	HTMLPanel htmlError;
	private LinkedHashMap<String, String> valueMapDataType = new LinkedHashMap<String, String>();  
	

	public AddBindingWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		txtBindingName.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_BINDING_NAME);
		txtBindingValue.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_BINDING_VALUE);
		txtBindingValue.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_BINDING_VALUE);
		
		DynamicForm formPackages= new DynamicForm();
		panelBindingType.add(formPackages);
		formPackages.setItems(listBindings, listNameSpace);
		listBindings.setShowTitle(false);
		listBindings.setHeight(20);
		listBindings.setPickerIconHeight(40);
		listBindings.setWidth(226);
		listNameSpace.setShowTitle(false);
		listNameSpace.setHeight(20);
		listNameSpace.setPickerIconHeight(40);
		listNameSpace.setWidth(226);
	
		txtBindingName.addBlurHandler(new BlurHandler() {
			
			@Override
			public void onBlur(BlurEvent event) {
				listBindings.focusInItem();
			}
		});
		
		listBindings.addBlurHandler(new com.smartgwt.client.widgets.form.fields.events.BlurHandler() {
			
			@Override
			public void onBlur(
					com.smartgwt.client.widgets.form.fields.events.BlurEvent event) {
				listNameSpace.focusInItem();
			}
		});
		listNameSpace.addBlurHandler(new com.smartgwt.client.widgets.form.fields.events.BlurHandler() {
			
			@Override
			public void onBlur(
					com.smartgwt.client.widgets.form.fields.events.BlurEvent event) {
				txtBindingValue.setFocus(true);
			}
		});
		
		
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

	public TextBox getTxtBindingName() {
		return txtBindingName;
	}

	public TextBox getTxtBindingValue() {
		return txtBindingValue;
	}

	public Button getBtnSave() {
		return btnSave;
	}

	public ComboBoxItem getListNameSpace() {
		return listNameSpace;
	}

	public HTMLPanel getHtmlError() {
		return htmlError;
	}

	
}