/*******************************************************************************
 * Copyright (c) 2015 Halcyon Technologies.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Affero GNU Public License
 *   which accompanies this distribution, and is available at
 *   https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   Copyright:
 *       Halcyon Technologies llc
 *   
 *   This file is part of the Business Suite software of Halcyonpro.net.
 *   Copyright (C) 2012-2020 Halcyonpro.net
 *  
 *   The primary contact email is support@halcyonpro.net
 *  
 *   Version: AGPL
 *  
 *   Halcyon Technologies, Halcyon Information Systems, Halcyonpro along with their domain names,  
 *   etc and the names Acuity, Ingenuity, Derivo, Colander etc are copyright of
 *   Halcyon llc and usage of these without prior permission of the owner is strictly prohibited
 *    
 *  The contents of this file may be used under the terms of
 *   the Affero GNU General Public License Version (the "AGPL"),
 *   A copy of the AGPL v2.1 can be obtained from https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   AGPL, in essence, means that this software requires a commercial license for use in or as a commercial application
 *******************************************************************************/
package com.halcyonpro.gwtapp.client.view.CenterPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

// This class is a superclass of All the Panels in the main screen, like accounts panel ,reportView etc.
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
		add(uiBinder.createAndBindUi(this));
		setHeight("100%");
		setWidth("100%");
	}
	
	public void setHeading(String text){
		heading.setText(text);
		
	}

	public FocusPanel getPanel() {
		return panel;
	}

	public Label getHeading() {
		return heading;
	}

}
