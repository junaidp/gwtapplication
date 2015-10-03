package com.helloworld.client.presenter;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.MainEvent;

public class LoginPresenter implements Presenter 

{
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;

	public interface Display 
	{
		Widget asWidget();
		com.google.gwt.user.client.ui.Button getBtnSubmit();
		
	}  

	public LoginPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.rpcService = rpcService;
		this.eventBus = eventBus;
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
		display.getBtnSubmit().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				signIn();
			}});
	
		
	}


	public void signIn()
	{
		eventBus.fireEvent(new MainEvent());
	}
}


