package com.helloworld.client.presenter;


import java.beans.PropertyChangeSupport;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.widgets.UploadedComponents.UploadedClass;

public class AssignEditorsPresenter implements Presenter 

{
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;
	private String selectedBeanName;

	
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
		
		UploadedClass uploadedClass = new UploadedClass();
		display.getLeftContainer().add(uploadedClass);
//		editBeanOnPropertyChange(uploadedClass.getPcs());
		
		
	}

//	private void editBeanOnPropertyChange(PropertyChangeSupport propertyChangeSupport) {
//			rpcService.editBeanOnPropertyChange(selectedBeanName, propertyChangeSupport, new AsyncCallback<String>() {
//
//				@Override
//				public void onFailure(Throwable caught) {
//					Window.alert("fail editBeanOnPropertyChange"+ caught.getLocalizedMessage());
//				}
//
//				@Override
//				public void onSuccess(String result) {
//					Window.alert(result);
//				}
//		});
//		
//	}

	@Override
	public void setHandlers() {
		
	}

	
}


