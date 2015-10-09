package com.helloworld.client.view.ControlPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ControlPanelsContainer extends Composite {

	private static ControlPanelsContainerUiBinder uiBinder = GWT
			.create(ControlPanelsContainerUiBinder.class);

	interface ControlPanelsContainerUiBinder extends
			UiBinder<Widget, ControlPanelsContainer> {
	}
	
	@UiField
	DashboardPanelView dashboardPanel;
	@UiField
	SearchDataPanelView searchPanel;
	@UiField
	IntelligencePackPanelView intelligencePanel;
	@UiField
	DashboardAccordionPanelView dashboardAccordionPanel;
	@UiField
	DashboardPortalPanelView dashboardPortalPanel;

	public ControlPanelsContainer() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public DashboardPanelView getDashboardPanel() {
		return dashboardPanel;
	}

	public SearchDataPanelView getSearchPanel() {
		return searchPanel;
	}

	public IntelligencePackPanelView getIntelligencePanel() {
		return intelligencePanel;
	}

	public DashboardAccordionPanelView getDashboardAccordionPanel() {
		return dashboardAccordionPanel;
	}

	public DashboardPortalPanelView getDashboardPortalPanel() {
		return dashboardPortalPanel;
	}

}
