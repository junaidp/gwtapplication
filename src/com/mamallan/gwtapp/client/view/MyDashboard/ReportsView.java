package com.mamallan.gwtapp.client.view.MyDashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.client.view.CenterPanels.CenterPanelsView;

public class ReportsView extends CenterPanelsView {

	private static ReportsViewUiBinder uiBinder = GWT
			.create(ReportsViewUiBinder.class);

	interface ReportsViewUiBinder extends UiBinder<Widget, ReportsView> {
	}

	public ReportsView() {
		container.add(uiBinder.createAndBindUi(this));
		setHeading(ApplicationConstants.REPORTS_HEADING);
//		container.add(new PieChartDashboard());
	}

}
