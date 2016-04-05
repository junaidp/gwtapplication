package com.mamallan.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.BeanFieldsEditorPresenter.Display;
import com.mamallan.gwtapp.client.view.widgets.JavaComponentAttachment;
import com.mamallan.gwtapp.client.view.widgets.XmlComponentAttachment;

public class BeanFieldsEditorView extends Composite implements Display {

	private static BeanFieldsEditorViewUiBinder uiBinder = GWT
			.create(BeanFieldsEditorViewUiBinder.class);

	interface BeanFieldsEditorViewUiBinder extends
	UiBinder<Widget, BeanFieldsEditorView> {
	}

	@UiField 
	ListBox listBeans;
	@UiField
	Button btnSubmit;
	@UiField
	XmlComponentAttachment xmlComponentAttachment;
	@UiField
	JavaComponentAttachment javaComponentAttachment;
	@UiField
	Image imgClose;
	private String beanType ;


	public BeanFieldsEditorView(String beanType) {
		initWidget(uiBinder.createAndBindUi(this));

		javaComponentAttachment.setData(beanType);
		xmlComponentAttachment.setData(beanType);
		this.beanType = beanType;
	}


	public Button getBtnSubmit() {
		return btnSubmit;
	}


	public void setBtnSubmit(Button btnSubmit) {
		this.btnSubmit = btnSubmit;
	}


	public ListBox getListBeans() {
		return listBeans;
	}


	public XmlComponentAttachment getXmlComponentAttachment() {
		return xmlComponentAttachment;
	}


	public JavaComponentAttachment getJavaComponentAttachment() {
		return javaComponentAttachment;
	}


	public String getBeanType() {
		return beanType;
	}


	public Image getImgClose() {
		return imgClose;
	}

}
