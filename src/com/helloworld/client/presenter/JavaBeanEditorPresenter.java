package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.widgets.AddBeanProportyWidget;
import com.helloworld.client.view.widgets.DisplayAlert;
import com.helloworld.client.view.widgets.PopupsView;
import com.smartgwt.client.widgets.Window;


public class JavaBeanEditorPresenter implements Presenter 

{
	
	private final Display display;
	private final HelloServiceAsync rpcService;
	
	public interface Display 
	{
		Widget asWidget();
		Button getBtnGenerate();
		Button getBtnAddProperty();
	}  

	public JavaBeanEditorPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.display = view;
		this.rpcService = rpcService;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
	}

	private void bind() {
		
	}

	@Override
	public void setHandlers() {
			
		display.getBtnGenerate().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				fetchBeanjson();
			}

			
		});
		
		display.getBtnAddProperty().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window window = new Window();
				window.setSize("500px", "500px");
				window.setCanDragResize(true);
				window.addItem(new AddBeanProportyWidget());
				window.setTitle("Bean Properties");
				window.moveTo(400, 500);
				window.show();
			}
		});
	}
	
	private void fetchBeanjson() {
		rpcService.fetchBeanJSON("com.helloworld.shared.beans.MyFirstBean", new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String json) {
				new DisplayAlert("Json retrieved");
//					 JSONValue jsonValue = JSONParser.parse(json);
//			         JSONObject object = jsonValue.isObject();
			}
			
			@Override
			public void onFailure(Throwable caught) {
				new DisplayAlert("fail fetchBeanJson: "+ caught.getLocalizedMessage());
			}
		});
	}
	
}
