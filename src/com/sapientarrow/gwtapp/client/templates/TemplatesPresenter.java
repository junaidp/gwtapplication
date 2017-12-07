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
package com.sapientarrow.gwtapp.client.templates;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.sapientarrow.gwtapp.client.HelloServiceAsync;
import com.sapientarrow.gwtapp.client.presenter.Presenter;
import com.sapientarrow.gwtapp.client.templates.previews.TemplateGreenPreview;
import com.sapientarrow.gwtapp.client.templates.previews.TemplateMetroPreview;
import com.sapientarrow.gwtapp.client.view.ApplicationConstants;
import com.sapientarrow.gwtapp.shared.entity.UserEntity;

// This class manages the functionality/logic of Application's Templates Page where we see previes f All the templates.
public class TemplatesPresenter implements Presenter

{

    private final Display display;
    private UserEntity loggedInUser;
    private final HandlerManager eventBus;

    public interface Display {
	Widget asWidget();

	TemplateMetroPreview getTemplateMetroPreview();

	TemplateGreenPreview getTemplateGreenPreview() ;

    }

    public TemplatesPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, UserEntity user) {
	this.display = view;
	this.eventBus = eventBus;
	this.loggedInUser = user;

    }

    public void go(HasWidgets container) {
	container.clear();
	container.add(display.asWidget());
	bind();
	setHandlers();
    }

    public void bind() {

    }

    @Override
    public void setHandlers() {

	display.getTemplateGreenPreview().getBtnSelect().addClickHandler(new ClickHandler() {

	    @Override
	    public void onClick(ClickEvent event) {

		History.newItem(ApplicationConstants.TOKEN_TEMPLATE_GREEN);
	    }
	});

	display.getTemplateMetroPreview().getBtnSelect().addClickHandler(new ClickHandler() {

	    @Override
	    public void onClick(ClickEvent event) {

		History.newItem(ApplicationConstants.TOKEN_TEMPLATE_METRO);
	    }
	});

    }
}
