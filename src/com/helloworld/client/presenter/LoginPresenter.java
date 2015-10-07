package com.helloworld.client.presenter;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.MainEvent;
import com.helloworld.client.event.RegistrationEvent;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.shared.entity.User;

public class LoginPresenter implements Presenter 

{
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;

	public interface Display 
	{
		Widget asWidget();
		com.google.gwt.user.client.ui.Button getBtnSubmit();
		
		TextBox getTxtUserName();
		PasswordTextBox getTxtPassword();
		Label getLblError();
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
		setHandlers();
	}

	public void signIn()
	{
		display.getLblError().setText("");
		
		rpcService.signIn(display.getTxtUserName().getText(), display.getTxtPassword().getText(), new AsyncCallback<User>() {
			
			@Override
			public void onSuccess(User user) {
				if(user==null){
					display.getLblError().setText(ApplicationConstants.USERNAME_PASSWORD_NOT_MATCH);
				}else{
				eventBus.fireEvent(new MainEvent(user));
				}
			}
			
			@Override
			public void onFailure(Throwable caught) {
			}
		});
		
	}

	@Override
	public void setHandlers() {
		display.getBtnSubmit().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				signIn();
			}});
		
		
	}
}


