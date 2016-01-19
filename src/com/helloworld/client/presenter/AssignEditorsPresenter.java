package com.helloworld.client.presenter;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.Method;
import java.util.HashMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.widgets.UploadedComponents.UploadedClass;
import com.helloworld.shared.dto.InvokedObjectDTO;

public class AssignEditorsPresenter implements Presenter 

{
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;
	private String selectedBeanName;
	private Class selectedBean = null;
	private HashMap beanPropertiesMap = new HashMap();
	private Button btnSave = new Button("Save");

	public interface Display 
	{
		Widget asWidget();
		HTMLPanel getLeftContainer();

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
		
//		rpcService.editBeanOnPropertyChange(object, selectedBeanName, propertyName, newValue, new AsyncCallback<InvokedObjectDTO>() {
//
//			@Override
//			public void onFailure(Throwable caught) {
//				Window.alert("fail editBeanOnPropertyChange"+ caught.getLocalizedMessage());
//			}
//
//			@Override
//			public void onSuccess(InvokedObjectDTO result) {
//				object = result;
//				Window.alert(result.toString());
//			}
//		});
		
	}


	@Override
	public void setHandlers() {
		
		UploadedClass uploadedClass = new UploadedClass();
		display.getLeftContainer().add(uploadedClass);
		display.getLeftContainer().add(btnSave);
		
		uploadedClass.pcs.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				editBeanOnPropertyChange(selectedBeanName, evt.getPropertyName(), evt.getNewValue());
			}

			
		});
		
		btnSave.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				rpcService.editBeanOnPropertyChange(selectedBeanName, beanPropertiesMap, new AsyncCallback<String>() {
					
								@Override
								public void onFailure(Throwable caught) {
									Window.alert("fail editBeanOnPropertyChange"+ caught.getLocalizedMessage());
								}
					
								@Override
								public void onSuccess(String result) {
									
									Window.alert(result.toString());
								}
							});
			}
		});

	}
	
	
//	public String editBeanOnPropertyChange(String selectedBeanName,
//			String propertyName, String newValue) {
//		
//		try {
//			GWT.create( Reflection.class ).instantiate( "YourClass" );
//			 selectedBean = Class.forName(selectedBeanName);
//			Object beanObject = selectedBean.newInstance();
//			final Method[] methods = selectedBean.getMethods();
//		
//		 for(Method method : methods){
//			 
//			 if(method.getName().equalsIgnoreCase("set"+propertyName)){
//				 
//				 	method.invoke(beanObject, newValue);
//				 	break;
//			 }
//		 }
//	
//		
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} 
//	
//		return null;
//	}


}


