package com.mamallan.gwtapp.client;

import java.util.List;

import org.fusesource.restygwt.client.Defaults;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.mamallan.gwtapp.shared.RestEntity;


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

		//  ****************  REST TEST //
		Defaults.setServiceRoot(GWT.getHostPageBaseURL());
		RestClient client = GWT.create(RestClient.class);
		
		client.getHellos(new MethodCallback<List<RestEntity>>() {

			public void onSuccess(Method method, List<RestEntity> response) {
//				VerticalPanel panel = new VerticalPanel();
//				for (RestEntity hello : response) {
//					Label label = new Label(hello.getName());
//					panel.add(label);
//				}
//				RootLayoutPanel.get().add(panel);
				Window.alert(response+"");
			}

			public void onFailure(Method method, Throwable exception) {
				Label label = new Label("Error");
				RootLayoutPanel.get().add(label);
			}
		});
		
		

		
		//  ****************END REST RESR //
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
