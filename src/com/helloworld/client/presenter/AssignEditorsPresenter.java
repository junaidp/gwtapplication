package com.helloworld.client.presenter;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.PopupsView;
import com.helloworld.client.view.widgets.UploadedComponents.UploadedClass;


public class AssignEditorsPresenter implements Presenter 

{
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;
	private String selectedBeanName;
	private Class selectedBean = null;
	private TreeMap beanPropertiesMap = new TreeMap();
	
	public interface Display 
	{
		Widget asWidget();
		HTMLPanel getLeftContainer();
		Button getBtnSubmit();

	}  

	public AssignEditorsPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, String beanName) 
	{
		this.rpcService = rpcService;
		this.eventBus = eventBus;
		this.display = view;
		this.selectedBeanName = beanName;

	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
	}

	private void bind() {

		setHandlers();
		uploadLayout();
	}

	private void uploadLayout() {

	}

	private void editBeanOnPropertyChange(String selectedBeanName,
			String propertyName, Object object) {


		beanPropertiesMap.put(propertyName, object);

	}


	@Override
	public void setHandlers() {

		UploadedClass uploadedClass = new UploadedClass();
		display.getLeftContainer().add(uploadedClass);
		

		uploadedClass.pcs.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				editBeanOnPropertyChange(selectedBeanName, evt.getPropertyName(), evt.getNewValue());
			}


		});

		display.getBtnSubmit().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				display.getBtnSubmit().addStyleName("loading-pulse");
				editBean();
			}


		});

	}

	private void editBean() {
		rpcService.editBeanOnPropertyChange(selectedBeanName, beanPropertiesMap, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable exceptionJson) {
				display.getBtnSubmit().removeStyleName("loading-pulse");
				display.getBtnSubmit().removeStyleName("loading-pulse");
				int ind = exceptionJson.getMessage().indexOf("{");
				JSONValue jsonValue = JSONParser.parse(exceptionJson.getMessage().substring(ind));
				JSONObject object = jsonValue.isObject();
				Set<String> keys =  object.keySet();
				
				
				
				FlexTable flex = new FlexTable();
				Object[] keyArray = keys.toArray();
//				for (String s : keys) {
				for(int i=0; i< keyArray.length; i++){
				   Label lbl = new Label((String) keyArray[i]);
				   JSONValue s = object.get(keyArray[i].toString());
				   s.toString();
				   
				   flex.setWidget(i, 0, lbl);
				   flex.setWidget(i, 1, new Label(s.toString()));
				}
				new PopupsView(flex);
				display.getBtnSubmit().removeStyleName("loading-pulse");
			}

			@Override
			public void onSuccess(String result) {

				fetchBeanObject(selectedBeanName);
			}
		});
	}
	
	private void fetchBeanObject(String selectedBeanName) {
		
		rpcService.fetchBeanObject(selectedBeanName, new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				
				new PopupsView(new Label(result));
			}
			
			@Override
			public void onFailure(Throwable exceptionJson) {
				
			}
		});
		
	}
}


