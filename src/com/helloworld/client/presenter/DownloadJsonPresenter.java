package com.helloworld.client.presenter;


import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.ApplicationConstants;
import com.smartgwt.client.util.SC;

public class DownloadJsonPresenter implements Presenter 

{
	private final HelloServiceAsync rpcService;
	private final Display display;

	public interface Display 
	{
		Widget asWidget();
		ListBox getListBeans();
		Button getBtnDowmload();
	
	}  

	public DownloadJsonPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.rpcService = rpcService;
		this.display = view;
		
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
	}

	private void bind() {
		RootPanel.get("loadingMessage").setVisible(false);
		setHandlers();
		fetchBeans();
	}

	public void fetchBeans(){
		rpcService.fetchClassesOfAllPackages(new AsyncCallback<ArrayList<String>>() {

			@Override
			public void onSuccess(ArrayList<String> classes) {

				display.getListBeans().clear();
				display.getListBeans().addItem(ApplicationConstants.SELECT_BEAN);
				for(int i=0; i< classes.size(); i++){
					int separatorIndex = classes.get(i).indexOf("::"); 
					display.getListBeans().addItem(classes.get(i).substring(0, separatorIndex));
				}

			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("fetchClassesOfAllPackages failed "+ caught.getLocalizedMessage());

			}
		});
	}


	@Override
	public void setHandlers() {
		
		display.getBtnDowmload().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
		
				rpcService.downloadBeanFieldsJson(display.getListBeans().getValue(display.getListBeans().getSelectedIndex()), new AsyncCallback<String>() {

					@Override
					public void onFailure(Throwable caught) {
						SC.warn(caught.getLocalizedMessage());
					}

					@Override
					public void onSuccess(String result) {
//						Window.open("/downloadedJson", "_blank", "", "enabled");
						Window.open(GWT.getHostPageBaseURL() + ApplicationConstants.DOWNLOADED_BEAN_FIELDS_JSON, "_blank", "enabled");
				    
					}
				});
			}});
		
	}

	
}


