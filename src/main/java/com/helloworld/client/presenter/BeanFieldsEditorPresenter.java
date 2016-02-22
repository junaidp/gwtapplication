package com.helloworld.client.presenter;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.thirdparty.guava.common.reflect.Reflection;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.AssignEditorsEvent;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.widgets.DisplayAlert;
import com.helloworld.client.view.widgets.JavaComponentAttachment;
import com.helloworld.client.view.widgets.XmlComponentAttachment;
import com.helloworld.client.view.widgets.UploadedComponents.UploadedClass;
import com.smartgwt.client.util.SC;


public class BeanFieldsEditorPresenter implements Presenter 

{

	private final Display display;
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;

	public interface Display 
	{
		Widget asWidget();
		Button getBtnSubmit();
		ListBox getListBeans();
		XmlComponentAttachment getXmlComponentAttachment();
		JavaComponentAttachment getJavaComponentAttachment();
	}  

	public BeanFieldsEditorPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.display = view;
		this.eventBus = eventBus;
		this.rpcService = rpcService;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
		display.getBtnSubmit().setVisible(false);

	}

	private void bind() {

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

		display.getJavaComponentAttachment().getForm().addSubmitCompleteHandler(new SubmitCompleteHandler() {

			@Override
			public void onSubmitComplete(SubmitCompleteEvent event) {
				createFieldEditors();
			}
		});

		display.getXmlComponentAttachment().getForm().addSubmitCompleteHandler(new SubmitCompleteHandler(){

			@Override
			public void onSubmitComplete(SubmitCompleteEvent event) {

			}

		});

		display.getBtnSubmit().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				try{
					String xmlFileName = display.getXmlComponentAttachment().getDefaultUploader().getFilename();
					String javaFileName = display.getJavaComponentAttachment().getDefaultUploader().getFilename();
					int indXml = xmlFileName.indexOf(".");
					String xmlFileExt = xmlFileName.substring(indXml);
					int indJava = javaFileName.indexOf(".");
					String javaFileExt = javaFileName.substring(indJava);
					if(!xmlFileExt.equals(".ui.xml")){
						SC.warn(ApplicationConstants.INVALID_UIXML_FILE);
					}
					else if(!javaFileExt.equals(".java")){
						SC.warn(ApplicationConstants.INVALID_UIJAVA_FILE);
					}
					else{
						display.getXmlComponentAttachment().getForm().submit();
						display.getJavaComponentAttachment().getForm().submit();
					}
				}catch(Exception ex){
					SC.warn(ApplicationConstants.INVALID_UIXML_AND_JAVA_FILE);
				}
			}
		});

		display.getListBeans().addChangeHandler(new ChangeHandler() {

			@Override
			public void onChange(ChangeEvent event) {
				if(display.getListBeans().getValue(display.getListBeans().getSelectedIndex()).equals(ApplicationConstants.SELECT_BEAN)){
					display.getBtnSubmit().setVisible(false);
				}else{
					display.getXmlComponentAttachment().setBean(display.getListBeans().getValue(display.getListBeans().getSelectedIndex()));
					display.getBtnSubmit().setVisible(true);
				}
			}
		});
	}

	private void createFieldEditors() {
		String className = display.getListBeans().getValue(display.getListBeans().getSelectedIndex());
		int ind = className.lastIndexOf(".");
		String beanName = className.substring(ind+1);
		String action = ApplicationConstants.FIELD_EDITORS_CREATION;
		rpcService.fetchBeanJSON(className, beanName, action, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {

			}

			@Override
			public void onSuccess(String json) {
				eventBus.fireEvent(new AssignEditorsEvent(json));

			}
		});
	}

	private void loadUploadedClass() {
		rpcService.loadUploadedClass("com.helloworld.client.view.widgets.UploadedComponents.AdminView", new AsyncCallback<String>() {

			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}
		});
	}

}
