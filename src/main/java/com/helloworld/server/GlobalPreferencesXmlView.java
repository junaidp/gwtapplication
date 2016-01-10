package com.helloworld.server;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.GlobalPreferencesPresenter.Display;
import com.helloworld.client.view.ReadGlobalPreferencesXml;

public class GlobalPreferencesXmlView extends VerticalPanel implements Display {

	HorizontalSplitPanel splitPanel = new HorizontalSplitPanel();
	Tree treePreferences = new Tree();
	Button btnSave = new Button("Save");
	Button btnCancel = new Button("Cancel");
	FlowPanel flowPanelRight = new FlowPanel();

	public GlobalPreferencesXmlView() {
		
		add(splitPanel);
		HorizontalPanel hpnlButtons = new HorizontalPanel();
		hpnlButtons.add(btnCancel);
		hpnlButtons.add(btnSave);
		
		add(hpnlButtons);
		splitPanel.setLeftWidget(treePreferences);
		splitPanel.setRightWidget(flowPanelRight);
		splitPanel.setHeight(Window.getClientHeight()-150+"px");
		splitPanel.setSplitPosition("200px");
		
		new ReadGlobalPreferencesXml();
		
		Window.addResizeHandler(new ResizeHandler() {
			
			@Override
			public void onResize(ResizeEvent event) {
				splitPanel.setHeight(Window.getClientHeight()-150+"px");
				
			}
		});
	}
	public HorizontalSplitPanel getSplitPanel() {
		return splitPanel;
	}

	public Tree getTreePreferences() {
		return treePreferences;
	}
	public Button getBtnCancel() {
		return btnCancel;
	}
	public Button getBtnSave() {
		return btnSave;
	}

}
