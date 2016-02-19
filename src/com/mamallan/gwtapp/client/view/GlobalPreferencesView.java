package com.mamallan.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.GlobalPreferencesPresenter.Display;

@SuppressWarnings("deprecation")
public class GlobalPreferencesView extends Composite implements Display {

	private static GlobalPreferencesViewUiBinder uiBinder = GWT
			.create(GlobalPreferencesViewUiBinder.class);

	interface GlobalPreferencesViewUiBinder extends
	UiBinder<Widget, GlobalPreferencesView> {
	}
	@UiField
	Tree treePreferences;
	@UiField
	TreeItem treeItemViewPlan;
	@UiField
	TreeItem treeItemViewRegistration;
	@UiField
	TreeItem treeItemEditRegistration;
	@UiField
	TreeItem treeItemUsage;
	@UiField
	TreeItem treeItemMyAccount;
	@UiField
	HorizontalSplitPanel splitPanel;
	@UiField
	Button btnCancel;
	@UiField
	Button btnSave;
	

	public GlobalPreferencesView() {
		initWidget(uiBinder.createAndBindUi(this));
		treeItemViewPlan.setHTML(ApplicationConstants.VIEW_PLAN);
		treeItemViewRegistration.setHTML(ApplicationConstants.VIEW_REGISTRATION);
		treeItemEditRegistration.setHTML(ApplicationConstants.EDIT_REGISTRATION);
		treeItemUsage.setHTML(ApplicationConstants.VIEW_USAGE);
		treeItemMyAccount.setHTML(ApplicationConstants.MY_ACCOUNT);
		
		splitPanel.setHeight(Window.getClientHeight()-150+"px");
		splitPanel.setSplitPosition("200px");
		
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
