package com.mamallan.gwtapp.client;

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
		rpcService = GWT.create(HelloService.class);
		
//		GWT.create( Reflection.class ).;
		
		HandlerManager eventBus = new HandlerManager(null);
//		loadBeansJson();
		AppController appViewer = new AppController(rpcService, eventBus);
		appViewer.go(RootPanel.get("bodyContainer"));
		//	    System.out.println("PASSWORD is:"+ md5("koala"));
		//	    DynHelper dynHelper = new DynHelper();
		//	    dynHelper.createDynamicBean("com.mamallan.gwtapp.shared.dto.DummyBean");
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
