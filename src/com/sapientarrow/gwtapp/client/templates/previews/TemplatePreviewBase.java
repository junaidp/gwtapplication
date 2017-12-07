package com.sapientarrow.gwtapp.client.templates.previews;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class TemplatePreviewBase extends Composite {

	private static TemplatePreviewBaseUiBinder uiBinder = GWT.create(TemplatePreviewBaseUiBinder.class);

	interface TemplatePreviewBaseUiBinder extends UiBinder<Widget, TemplatePreviewBase> {
	}
	
	@UiField
	Button btnDemo;
	
	@UiField
	Button btnSelect;
	
	@UiField
	Label lblHeading;
	
	@UiField
	Image imgTemplate;

	public Label getLblHeading() {
		return lblHeading;
	}

	public Image getImgTemplate() {
		return imgTemplate;
	}

	public Button getBtnDemo() {
		return btnDemo;
	}

	public Button getBtnSelect() {
		return btnSelect;
	}

	public TemplatePreviewBase() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
