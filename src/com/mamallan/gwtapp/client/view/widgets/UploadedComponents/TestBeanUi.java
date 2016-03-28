package com.mamallan.gwtapp.client.view.widgets.UploadedComponents;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
public class TestBeanUi extends Composite {
	private static TestBeanUiUiBinder uiBinder = GWT
			.create(TestBeanUiUiBinder.class);
	interface TestBeanUiUiBinder extends UiBinder<Widget, TestBeanUi> {
	}
	
	@UiField 
	ListBox listIds;
	public TestBeanUi() {
		initWidget(uiBinder.createAndBindUi(this));
		listIds.addItem("0");
		listIds.addItem("1");
		listIds.addItem("2");
	}
}
