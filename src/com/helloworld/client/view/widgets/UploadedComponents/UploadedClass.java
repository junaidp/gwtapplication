package com.helloworld.client.view.widgets.UploadedComponents;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.BlurEvent;

public class UploadedClass extends ApplicationBean{

	private static UploadedClassUiBinder uiBinder = GWT
			.create(UploadedClassUiBinder.class);

	interface UploadedClassUiBinder extends UiBinder<Widget, UploadedClass> {
	}
	
	@UiField 
	ListBox listIds;
	@UiField TextBox textBoxName;
	
	

	public UploadedClass() {
		initWidget(uiBinder.createAndBindUi(this));
		listIds.addItem("0");
		listIds.addItem("1");
		listIds.addItem("2");
		
//		pcs.addPropertyChangeListener(new PropertyChangeListener() {
//			
//			@Override
//			public void propertyChange(PropertyChangeEvent evt) {
//				System.out.println("Name      = " + evt.getPropertyName()+";"+ evt.getNewValue());
//			}
//		});
	}


	@UiHandler("textBoxName")
	void onTextBoxBlur(BlurEvent event) {
		pcs.firePropertyChange(textBoxName.getName(), "", textBoxName.getText());
	}
	
	
}
