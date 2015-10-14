package com.helloworld.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.GlobalPreferencesPresenter.Display;

public class GlobalPreferencesView extends Composite implements Display {

	private static GlobalPreferencesViewUiBinder uiBinder = GWT
			.create(GlobalPreferencesViewUiBinder.class);

	interface GlobalPreferencesViewUiBinder extends
	UiBinder<Widget, GlobalPreferencesView> {
	}
	@UiField
	TabPanel tabPanelPreferences;
	@UiField
	FlowPanel tabFooterItems;

	public GlobalPreferencesView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
