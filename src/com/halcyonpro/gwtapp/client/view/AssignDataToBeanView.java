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
package com.halcyonpro.gwtapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.halcyonpro.gwtapp.client.presenter.AssignDataToBeanPresenter.Display;
import com.halcyonpro.gwtapp.client.view.widgets.ErrorPanelWidget;

public class AssignDataToBeanView extends Composite implements Display {

	private static AssignEditorsViewUiBinder uiBinder = GWT
			.create(AssignEditorsViewUiBinder.class);

	interface AssignEditorsViewUiBinder extends
			UiBinder<Widget, AssignDataToBeanView> {
	}
	
	@UiField HTMLPanel beanUiContainer;
	@UiField Button btnSubmit;
	@UiField ErrorPanelWidget errorPanelWidget;
	
	public AssignDataToBeanView() {
		initWidget(uiBinder.createAndBindUi(this));
		errorPanelWidget.setVisible(false);
	}

	public Button getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(Button btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	public HTMLPanel getBeanUiContainer() {
		return beanUiContainer;
	}

	public ErrorPanelWidget getErrorPanelWidget() {
		return errorPanelWidget;
	}

}
