package com.helloworld.client.view.CenterPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class CenterPanelsView extends FlowPanel {

	private static CenterPanelsViewUiBinder uiBinder = GWT
			.create(CenterPanelsViewUiBinder.class);

	interface CenterPanelsViewUiBinder extends
			UiBinder<Widget, CenterPanelsView> {
	}

	@UiField
	public HTMLPanel container;
	@UiField
	public Label heading;
	@UiField
	public FocusPanel panel;
	
	public CenterPanelsView() {
//		initWidget(uiBinder.createAndBindUi(this));
		add(uiBinder.createAndBindUi(this));
		setHeight("100%");
		setWidth("100%");
//		setHeight(Window.getClientHeight()-10+"px");
//		Window.addResizeHandler(new ResizeHandler() {
//			
//			@Override
//			public void onResize(ResizeEvent event) {
//				setHeight(Window.getClientHeight()-10+"px");
//				
//			}
//		});
	}
	
	public void setHeading(String text){
		heading.setText(text);
		
	}

	public FocusPanel getPanel() {
		return panel;
	}

}
