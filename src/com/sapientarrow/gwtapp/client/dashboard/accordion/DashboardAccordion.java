/*******************************************************************************
 * Copyright (c) 2017  * Copyright (c) 2015 Sapient Arrow Technologies.
 * All rights reserved. This program and the accompanying materials
 * * are made available under the terms of the Affero GNU Public License
 * which accompanies this distribution, and is available at
 * https://en.wikipedia.org/wiki/Affero_General_Public_License
 *  
 * Copyright:
 *    Sapient Arrow Technologies llc
 *  
 *  This file is part of the Business Suite software of Sapient Arrowpro.net.
 *  Copyright (C) 2012-2020 Sapient Arrowpro.net
 *
 *  The primary contact email is support@Sapient Arrowpro.net
 *
 *  Version: AGPL
 *
 *  Sapient Arrow Technologies, Sapient Arrow Information Systems, Sapient Arrow along with their domain names,  
 *  etc and the names Acuity, Ingenuity, Derivo, Colander etc are copyright of
 *  Sapient Arrow llc and usage of these without prior permission of the owner is strictly prohibited
 *   
 * The contents of this file may be used under the terms of
 *  the Affero GNU General Public License Version (the "AGPL"),
 *  A copy of the AGPL v2.1 can be obtained from https://en.wikipedia.org/wiki/Affero_General_Public_License
 *  
 *  AGPL, in essence, means that this software requires a commercial license for use in or as a commercial application
 *******************************************************************************/
package com.sapientarrow.gwtapp.client.dashboard.accordion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountPanel;
import com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordionPresenter.Display;

// This class is a View for Dashboard Accordion on the main screen
public class DashboardAccordion extends Composite implements Display {

    private static DashboardAccordionUiBinder uiBinder = GWT.create(DashboardAccordionUiBinder.class);

    interface DashboardAccordionUiBinder extends UiBinder<Widget, DashboardAccordion> {
    }

    @UiField
    MyAccountPanel myAccount;

    public DashboardAccordion() {
	initWidget(uiBinder.createAndBindUi(this));
    }

    public DashboardAccordion(String firstName) {
	initWidget(uiBinder.createAndBindUi(this));
    }

    public MyAccountPanel getMyAccount() {
	return myAccount;
    }

}