package com.helloworld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HelloWorldGWT implements EntryPoint {

	public void onModuleLoad() {
		HelloServiceAsync rpcService = GWT.create(HelloService.class);
	    HandlerManager eventBus = new HandlerManager(null);
	    AppController appViewer = new AppController(rpcService, eventBus);
	    appViewer.go(RootPanel.get("bodyContainer"));
	}
}
