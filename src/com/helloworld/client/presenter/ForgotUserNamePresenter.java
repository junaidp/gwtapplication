package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.widgets.DisplayAlert;

public class ForgotUserNamePresenter implements Presenter 

{

	private final Display display;
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;

	public interface Display 
	{
		Widget asWidget();
		TextBox getTxtEmail();
		Button getBtnSubmit();
		Label getLblError();
		Button getBtnBack();

	}  

	public ForgotUserNamePresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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
	}

	private void bind() {


	}

	@Override
	public void setHandlers() {
		display.getBtnSubmit().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				emailUserName();
			}

		});
		
		display.getBtnBack().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				History.back();
			}});
	}

	private void emailUserName() {
		rpcService.emailUserName(display.getTxtEmail().getText(), new AsyncCallback<String>() {

			@Override
			public void onSuccess(String result) {
				if(result.equals(ApplicationConstants.EMAIL_NOT_VALID)){
					display.getLblError().setText(result);
				}else{
					display.getLblError().setText("");
					new DisplayAlert(result);
					History.newItem(ApplicationConstants.TOKEN_LOGIN);
				}
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("fail email UserName "+ caught.getLocalizedMessage());
			}
		});

	}

}
