package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.DownloadJsonPresenter.Display;

public class DownloadJsonView extends Composite implements Display {

	private static DownloadJsonViewUiBinder uiBinder = GWT
			.create(DownloadJsonViewUiBinder.class);

	interface DownloadJsonViewUiBinder extends
			UiBinder<Widget, DownloadJsonView> {
	}
	
	@UiField ListBox listBeans;
	@UiField Button btnDowmload;

	public DownloadJsonView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public ListBox getListBeans() {
		return listBeans;
	}

	public void setListBeans(ListBox listBeans) {
		this.listBeans = listBeans;
	}

	public Button getBtnDowmload() {
		return btnDowmload;
	}

	public void setBtnDowmload(Button btnDowmload) {
		this.btnDowmload = btnDowmload;
	}

}
