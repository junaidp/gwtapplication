package com.helloworld.client.presenter;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.event.AdminEvent;
import com.helloworld.client.event.MainEvent;
import com.helloworld.client.event.RegistrationEvent;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.FooterView;
import com.helloworld.client.view.HeaderView;
import com.helloworld.client.view.CenterPanels.DashboardAccordion;
import com.helloworld.client.view.widgets.LoadingPopup;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.UserEntity;

public class LoginPresenter implements Presenter 

{
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;

	public interface Display 
	{
		Widget asWidget();
		com.google.gwt.user.client.ui.Button getBtnSubmit();
		Label getBtnForgotPassword();
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
		final LoadingPopup loadingPopup = new LoadingPopup();
		loadingPopup.display();
		rpcService.signIn(display.getTxtUserName().getText(), display.getTxtPassword().getText(), new AsyncCallback<UserEntity>() {

			@Override
			public void onSuccess(UserEntity user) {
				if(loadingPopup!=null){
					loadingPopup.remove();
				}
				if(user==null){
					display.getLblError().setText(ApplicationConstants.USERNAME_PASSWORD_NOT_MATCH);
				}else if(user.isAdmin()){
					eventBus.fireEvent(new AdminEvent());
				}
				else{
					fetchGlobalPreferences(user);
					
				}
			}
			@Override
			public void onFailure(Throwable caught) {
				if(loadingPopup!=null){
					loadingPopup.remove();
				}
			}
		});

	}
	
	private void fetchGlobalPreferences(final UserEntity user) {
		rpcService.fetchGlobalPreferences(new AsyncCallback<GlobalPreferencesEntity>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Fail Fetch Global Preferences: "+ caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(GlobalPreferencesEntity globalPreferences) {
				eventBus.fireEvent(new MainEvent(user, globalPreferences));
				
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
		
		display.getBtnForgotPassword().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				History.newItem(ApplicationConstants.TOKEN_FORGOT_PASSWORD);
			}});

	}
}


