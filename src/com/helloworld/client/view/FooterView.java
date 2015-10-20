package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.FooterPresenter.Display;

public class FooterView extends Composite implements Display {

	private static FooterViewUiBinder uiBinder = GWT
			.create(FooterViewUiBinder.class);

	interface FooterViewUiBinder extends UiBinder<Widget, FooterView> {
	}
	
	@UiField
	Label logOut;

	public FooterView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Label getLogOut() {
		return logOut;
	}

}
