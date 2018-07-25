package com.sapientarrow.gwtapp.client.templates;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;
import com.sapientarrow.gwtapp.client.AppController;
import com.sapientarrow.gwtapp.client.HelloService;
import com.sapientarrow.gwtapp.client.HelloServiceAsync;
import com.sapientarrow.gwtapp.client.view.ApplicationConstants;

public class TemplatesApp implements EntryPoint {

    @Override
    public void onModuleLoad() {

	HelloServiceAsync rpcService = GWT.create(HelloService.class);
	HandlerManager eventBus = new HandlerManager(null);
	AppController appViewer = new AppController(rpcService, eventBus);
	appViewer.go(RootPanel.get("bodyContainer"));
	// Presenter presenter = new TemplatesPresenter(rpcService, eventBus,
	// new TemplatesView(), null);
	// presenter.go(null);
	History.newItem(ApplicationConstants.TOKEN_TEMPLATES);

    }

}
