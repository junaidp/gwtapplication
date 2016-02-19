package com.mamallan.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.HeaderPresenter.Display;

public class HeaderView extends Composite implements Display {

	private static HeaderViewUiBinder uiBinder = GWT
			.create(HeaderViewUiBinder.class);

	interface HeaderViewUiBinder extends UiBinder<Widget, HeaderView> {
	}

	@UiField
	Image imgLogo;
	@UiField
	FocusPanel menuHome;
	
	public HeaderView() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}
	public Image getImgLogo() {
		
		
		return imgLogo;
	}
	
	public FocusPanel getMenuHome() {
		return menuHome;
	}
	

}