package com.mamallan.gwtapp.client.presenter;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.event.AssignEditorsEvent;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.client.view.widgets.JavaComponentAttachment;
import com.mamallan.gwtapp.client.view.widgets.XmlComponentAttachment;
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
		eventBus.fireEvent(new AssignEditorsEvent(className));

	}
}
