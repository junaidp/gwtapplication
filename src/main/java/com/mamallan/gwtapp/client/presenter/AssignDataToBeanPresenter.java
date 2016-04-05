package com.mamallan.gwtapp.client.presenter;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Set;
import java.util.TreeMap;

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
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.view.widgets.ErrorPanelWidget;
import com.mamallan.gwtapp.client.view.widgets.UploadedClass;
import com.smartgwt.client.util.SC;


public class AssignDataToBeanPresenter implements Presenter 

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
		HTMLPanel getBeanUiContainer();
		Button getBtnSubmit();
		ErrorPanelWidget getErrorPanelWidget();

	}  

	public AssignDataToBeanPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, String beanName) 
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
		display.getBeanUiContainer().add(uploadedClass);
		

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
//				new PopupsView(flex);
				display.getErrorPanelWidget().add(flex);
				display.getErrorPanelWidget().setVisible(true);
				display.getBtnSubmit().removeStyleName("loading-pulse");
			}

			@Override
			public void onSuccess(String result) {
				display.getErrorPanelWidget().setVisible(false);
				fetchBeanObject(selectedBeanName);
			}
		});
	}
	
	private void fetchBeanObject(String selectedBeanName) {
		
		rpcService.fetchBeanObject(selectedBeanName, new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				display.getBtnSubmit().removeStyleName("loading-pulse");
				SC.say("Bean Saved");
				Window.alert(result);
			}
			
			@Override
			public void onFailure(Throwable exceptionJson) {
				SC.warn("Error in fetchBeanObject: " + exceptionJson.getLocalizedMessage());
				display.getBtnSubmit().removeStyleName("loading-pulse");
			}
		});
		
	}
}


