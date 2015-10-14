package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.HeaderPresenter.Display;
import com.helloworld.shared.entity.User;

public class HeaderView extends Composite implements Display {

	private static HeaderViewUiBinder uiBinder = GWT
			.create(HeaderViewUiBinder.class);

	interface HeaderViewUiBinder extends UiBinder<Widget, HeaderView> {
	}

	@UiField
	Image imgLogo;
	private User user;
	public HeaderView(User user) {
		initWidget(uiBinder.createAndBindUi(this));
		this.user = user;
	}
	public Image getImgLogo() {
		
		return imgLogo;
	}
	public User getUser() {
		return user;
	}

}
