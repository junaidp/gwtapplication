package com.helloworld.client.view.widgets;

import com.google.gwt.core.client.GWT;
import com.helloworld.shared.dto.AddedBeanPropertyDTO;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

public class DataObjectWidget extends Composite {

	private static DataObjectWidgetUiBinder uiBinder = GWT
			.create(DataObjectWidgetUiBinder.class);

	interface DataObjectWidgetUiBinder extends
			UiBinder<Widget, DataObjectWidget> {
	}
	
	@UiField
	DataObjectAnchor customAnchor;
	@UiField
	Image imgDelete;
	private AddedBeanPropertyDTO AddedBeanPropertyDTO;
	
	
	
	public DataObjectWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

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

}
