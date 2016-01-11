package com.helloworld.client.view.widgets;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.shared.dto.AnnotationsDTO;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;

public class AddAnnotationsWidget extends Composite {

	private static AddAnnotationsWidgetUiBinder uiBinder = GWT
			.create(AddAnnotationsWidgetUiBinder.class);

	interface AddAnnotationsWidgetUiBinder extends
			UiBinder<Widget, AddAnnotationsWidget> {
	}
	
	@UiField
	DynamicForm panelDynamicFormAnnotations;
	@UiField
	ListBox listImports;
	private ComboBoxItem listAnnotations = new ComboBoxItem();
	@UiField
	Label lblHeading;
	@UiField
	Button btnSaveAnnotation;
	@UiField
	VerticalPanel vpnlContainer;
	@UiField
	TextBox txtAnnotationText;
	public ArrayList<AnnotationsDTO> listAnnotationsDTOs = new ArrayList<AnnotationsDTO>();
	private LinkedHashMap<String, String> valueMapAnnotations = new LinkedHashMap<String, String>(); 
	

	public AddAnnotationsWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		panelDynamicFormAnnotations.setItems(listAnnotations);
		listAnnotations.setTitle("@");
		listImports.addItem("JPA", ApplicationConstants.ANNOTATIONS_JPA);
		listImports.addItem("Hibernate", ApplicationConstants.ANNOTATIONS_HIBERNATE);
		listImports.addItem("Spring", ApplicationConstants.ANNOTATIONS_SPRING);
		listImports.addItem("CDI", ApplicationConstants.ANNOTATIONS_CDI);
		listAnnotations.setDefaultToFirstOption(true);
		listAnnotations.setBrowserSpellCheck(false);
		txtAnnotationText.getElement().setPropertyString("placeholder", ApplicationConstants.ENTER_ANNOTAION_TEXT);
		listImports.setTabIndex(99);
		listAnnotations.setTabIndex(100);
		txtAnnotationText.setTabIndex(101);
		btnSaveAnnotation.setTabIndex(102);
//		setTabIndexes();
	}
	
	public void setTabIndexes(){
		listImports.addKeyUpHandler(new KeyUpHandler() {
			
			@Override
			public void onKeyUp(KeyUpEvent event) {
				if(event.getNativeKeyCode() == KeyCodes.KEY_TAB){
					listAnnotations.focusInItem();
					listAnnotations.setShowFocused(true);
					
				}
			}
		});
		
		listAnnotations.addKeyUpHandler(new com.smartgwt.client.widgets.form.fields.events.KeyUpHandler() {
			
			@Override
			public void onKeyUp(
					com.smartgwt.client.widgets.form.fields.events.KeyUpEvent event) {
				if(event.getKeyName().equalsIgnoreCase("TAB")){
					txtAnnotationText.setFocus(true);
					
				}
			}
		});
	}
	
	public void populateAnnotations(){
		
	}

	public ComboBoxItem getListAnnotations() {
		return listAnnotations;
	}

	public ListBox getListImports() {
		return listImports;
	}

	public Label getLblHeading() {
		return lblHeading;
	}

	public void setLblHeading(Label lblHeading) {
		this.lblHeading = lblHeading;
	}

	public Button getBtnSaveAnnotation() {
		return btnSaveAnnotation;
	}

	public VerticalPanel getVpnlContainer() {
		return vpnlContainer;
	}

	public TextBox getTxtAnnotationText() {
		return txtAnnotationText;
	}

	public ArrayList<AnnotationsDTO> getListAnnotationsDTOs() {
		return listAnnotationsDTOs;
	}

	public void setListAnnotationsDTOs(ArrayList<AnnotationsDTO> listAnnotationsDTOs) {
		this.listAnnotationsDTOs = listAnnotationsDTOs;
	}

	public LinkedHashMap<String, String> getValueMapAnnotations() {
		return valueMapAnnotations;
	}

	public void setValueMapAnnotations(
			LinkedHashMap<String, String> valueMapAnnotations) {
		this.valueMapAnnotations = valueMapAnnotations;
	}

}
