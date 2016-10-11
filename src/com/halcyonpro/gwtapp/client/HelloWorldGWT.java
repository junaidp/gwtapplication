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
package com.halcyonpro.gwtapp.client;



import org.fusesource.restygwt.client.Defaults;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.resources.client.CssResource;
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

//		Document.get().getBody().setClassName("w3-theme-light");
//		RootPanel.getBodyElement().setClassName("w3-theme-blue.css");
		
		
//		loadjscssfile("http://www.w3schools.com/lib/w3.css", "css");
		
//		loadjscssfile("w3-theme-blue.css", "css");
//		RootPanel.get("bodyContainer").getElement().appendChild(fileref);
//		Element s = DOM.createElement("link");
//		s.setAttribute("type", "text/css");
//	    s.setAttribute("href", "w3-theme-red.css");
//	    DOM.getElementById("body").appendChild(s);
//		loadCSS("/w3-theme-red.css");

		
//		StyleInjector.setContents(style, contents);.injectStylesheet("/w3-theme-red.css");
	}

	private native void loadCSS (String cssHref) /*-{
	//	$doc.wrtie('<link rel="stylesheet" href="/w3-theme-red.css">');
	document.write('<link rel="stylesheet" type="text/css" href="HelloWorldGWT.css">');
	}-*/;
	
//	 public static native void loadjscssfile(String filename,  String filetype) /*-{
//	 	
//	 	var fileref=document.createElement("link")
//        fileref.setAttribute("rel", "stylesheet")
//        fileref.setAttribute("type", "text/css")
//        fileref.setAttribute("href", filename)
//       
//        if (typeof fileref!="undefined")
//        var ss = document.getElementsByTagName("body")
//          $wnd.alert(ss.length);
//        document.getElementsByTagName("body").appendChild[0](fileref)
//    
//      }-*/;

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
