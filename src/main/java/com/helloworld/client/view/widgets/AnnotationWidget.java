package com.helloworld.client.view.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.shared.dto.AddedBeanPropertyDTO;

public class AnnotationWidget extends Composite {

	private static AnnotationWidgetUiBinder uiBinder = GWT
			.create(AnnotationWidgetUiBinder.class);

	interface AnnotationWidgetUiBinder extends
			UiBinder<Widget, AnnotationWidget> {
	}

	public AnnotationWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField
	DataObjectAnchor customAnchor;
	@UiField
	Image imgDelete;
	@UiField
	Anchor annotaionText;
	
	private AddedBeanPropertyDTO AddedBeanPropertyDTO;
		
	public DataObjectAnchor getCustomAnchor() {
		return customAnchor;
	}

	public Image getImgDelete() {
		return imgDelete;
	}

	public AddedBeanPropertyDTO getAddedBeanPropertyDTO() {
		return AddedBeanPropertyDTO;
	}

	public void setAddedBeanPropertyDTO(AddedBeanPropertyDTO addedBeanPropertyDTO) {
		AddedBeanPropertyDTO = addedBeanPropertyDTO;
	}

	public Anchor getAnnotaionText() {
		return annotaionText;
	}

	public void setAnnotaionText(Anchor annotaionText) {
		this.annotaionText = annotaionText;
	}


}
