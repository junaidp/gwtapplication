package com.mamallan.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.FooterPresenter.Display;

public class FooterView extends Composite implements Display {

	private static FooterViewUiBinder uiBinder = GWT
			.create(FooterViewUiBinder.class);

	interface FooterViewUiBinder extends UiBinder<Widget, FooterView> {
	}
	
	@UiField
	FocusPanel logOut;
	@UiField
	FocusPanel back;

	public FooterView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public FocusPanel getLogOut() {
		return logOut;
	}

	public FocusPanel getBack() {
		return back;
	}

}