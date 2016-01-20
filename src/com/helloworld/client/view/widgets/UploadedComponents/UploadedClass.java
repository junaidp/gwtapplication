package com.helloworld.client.view.widgets.UploadedComponents;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;

public class UploadedClass extends ApplicationBean{

	private static UploadedClassUiBinder uiBinder = GWT
			.create(UploadedClassUiBinder.class);

	interface UploadedClassUiBinder extends UiBinder<Widget, UploadedClass> {
	}
	
	@UiField 
	ListBox listIds;
	@UiField TextBox textBoxName;
	@UiField TextBox textBoxUser_Name;
	
	

	public UploadedClass() {
		initWidget(uiBinder.createAndBindUi(this));
		listIds.addItem("0");
		listIds.addItem("1");
		listIds.addItem("2");
		
		listIds.addChangeHandler(new ChangeHandler(){

			@Override
			public void onChange(ChangeEvent event) {
				pcs.firePropertyChange(listIds.getName(), "", Integer.parseInt(listIds.getItemText(listIds.getSelectedIndex())));
			}});
		
	}


		@UiHandler("textBoxName")
		void onTextBoxBlur(BlurEvent event) {
			pcs.firePropertyChange(textBoxName.getName(),  "", textBoxName.getText());
		}
		
		@UiHandler("textBoxUser_Name")
		void onTextBoxUserBlur(BlurEvent event) {
			pcs.firePropertyChange(textBoxUser_Name.getName(), "", textBoxUser_Name.getText());
		}
	
	
	
	
	
	
}
