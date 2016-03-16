package com.mamallan.gwtapp.client.view.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;

public class AddBindingWidget extends Composite {

	private static AddBindingWidgetUiBinder uiBinder = GWT
			.create(AddBindingWidgetUiBinder.class);

	interface AddBindingWidgetUiBinder extends
			UiBinder<Widget, AddBindingWidget> {
	}
	@UiField
	HTMLPanel panelDynamicForm;
	private ComboBoxItem listBindings = new ComboBoxItem();
	@UiField
	Image imgClose;

	public AddBindingWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		
		DynamicForm formPackages= new DynamicForm();
		panelDynamicForm.add(formPackages);
		formPackages.setItems(listBindings);
		listBindings.setShowTitle(false);
		listBindings.setHeight(20);
		listBindings.setPickerIconHeight(40);
		listBindings.setWidth(200);
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

}
