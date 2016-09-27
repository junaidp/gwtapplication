package com.mamallan.gwtapp.client;

import org.fusesource.restygwt.client.Defaults;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HelloWorldGWT implements EntryPoint {

	private HelloServiceAsync rpcService;

	public void onModuleLoad() {
		Defaults.setDateFormat(null);
		rpcService = GWT.create(HelloService.class);
		HandlerManager eventBus = new HandlerManager(null);
//				loadBeansJson();
		AppController appViewer = new AppController(rpcService, eventBus);
		appViewer.go(RootPanel.get("bodyContainer"));

	}


	public void loadBeansJson(){


		rpcService.loadBeansJsonAndCreateDynamicBeans(new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				System.out.println("error in loadBeanJson from onModule"+ caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(String result) {
				System.out.println("success from loadBeansJsonAndCreateDynamicBeans from onModule "+ result);
			}
		});

	}



}
