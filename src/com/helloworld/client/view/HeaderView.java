package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.HeaderPresenter.Display;
import com.helloworld.shared.entity.UserEntity;

public class HeaderView extends Composite implements Display {

	private static HeaderViewUiBinder uiBinder = GWT
			.create(HeaderViewUiBinder.class);

	interface HeaderViewUiBinder extends UiBinder<Widget, HeaderView> {
	}

	@UiField
	Image imgLogo;
	@UiField
	MenuBar mainMenuBar;
	@UiField
	MenuItem menuHome;
	
	public HeaderView() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}
	public Image getImgLogo() {
		
		
		return imgLogo;
	}
	public MenuBar getMainMenu() {
		return mainMenuBar;
	}
	public void setMainMenu(MenuBar mainMenu) {
		this.mainMenuBar = mainMenu;
	}
	public MenuItem getMenuHome() {
		return menuHome;
	}
	

}
