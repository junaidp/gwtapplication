package com.helloworld.client.view.GlobalPreferencesPanels;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class AddMenuItem extends HorizontalPanel {
	
	TextBox txtMenuName = new TextBox(); 
	CheckBox checkHasSubMenu = new  CheckBox("this item will have sub menus");
	Button btnCreate = new Button("create");
	
	public AddMenuItem(){
		
//		HorizontalPanel hpnl = new HorizontalPanel();
		add(txtMenuName);
		add(checkHasSubMenu);
		add(btnCreate);
		setSpacing(4);
	}

	public TextBox getTxtMenuName() {
		return txtMenuName;
	}

	public void setTxtMenuName(TextBox txtMenuName) {
		this.txtMenuName = txtMenuName;
	}

	public CheckBox getCheckHasSubMenu() {
		return checkHasSubMenu;
	}

	public void setCheckHasSubMenu(CheckBox checkHasSubMenu) {
		this.checkHasSubMenu = checkHasSubMenu;
	}

	public Button getBtnCreate() {
		return btnCreate;
	}

}
