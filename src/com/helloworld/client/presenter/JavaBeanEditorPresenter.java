package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.widgets.DisplayAlert;


public class JavaBeanEditorPresenter implements Presenter 

{
	
	private final Display display;
	private final HelloServiceAsync rpcService;
	
	public interface Display 
	{
		Widget asWidget();
		Button getBtnGenerate();
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
				Window.alert("fail fetchBeanJson: "+ caught.getLocalizedMessage());
			}
		});
	}
	
}
