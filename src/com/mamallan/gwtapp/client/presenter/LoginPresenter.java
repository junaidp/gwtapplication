package com.mamallan.gwtapp.client.presenter;


import org.fusesource.restygwt.client.Defaults;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
import org.glassfish.jersey.client.ClientResponse;

import com.google.gwt.core.client.GWT;
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
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.event.MainEvent;
import com.mamallan.gwtapp.client.rest.RestClient;
import com.mamallan.gwtapp.client.rest.SignInClient;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.client.view.FooterView;
import com.mamallan.gwtapp.client.view.HeaderView;
import com.mamallan.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.mamallan.gwtapp.shared.entity.UserEntity;

public class LoginPresenter implements Presenter 

{
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;
	private int worngPasswordCount = 0;
	private String worngPasswordUser = "";
	
	public interface Display 
	{
		Widget asWidget();
		com.google.gwt.user.client.ui.Button getBtnSubmit();
		Anchor getBtnForgotPassword();
		TextBox getTxtUserName();
		PasswordTextBox getTxtPassword();
		Label getLblError();
		Anchor getBtnForgotUsername();
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

//	public void signIn()
//	{
//		display.getLblError().setText("");
//		final String username = display.getTxtUserName().getText();
//		//		final LoadingPopup loadingPopup = new LoadingPopup();
//		display.getBtnSubmit().addStyleName("loading-pulse");
//
//
//		//		loadingPopup.display();
//		rpcService.signIn(username, display.getTxtPassword().getText(), new AsyncCallback<UserEntity>() {
//
//			@Override
//			public void onSuccess(UserEntity user) {
//				if(user.getStatus() == ApplicationConstants.BLOCK || user.getStatus() == ApplicationConstants.CLOSED ){
//					String status = user.getStatus() == ApplicationConstants.BLOCK?"Blocked":"Closed";
//					display.getLblError().setText("Your Account is " + status + " , Please Conatct Adminstrator for activation");
//				}
//				else{
//				if(user!=null && user.getUserFetchStatus().equals(ApplicationConstants.USER_NOT_FOUND)){
//					display.getLblError().setText(ApplicationConstants.USER_NOT_FOUND);
//				}
//				else if(user!=null && user.getUserFetchStatus().equals(ApplicationConstants.USERNAME_PASSWORD_NOT_MATCH)){
//					if(username.equals(worngPasswordUser)){
//						worngPasswordCount = worngPasswordCount+1;
//					}else{
//						worngPasswordCount = 0;
//					}
//
//					if(username.equals(worngPasswordUser) && worngPasswordCount>=2 ){
//						inactiveAccount(username);
//					}
//					display.getLblError().setText(ApplicationConstants.USERNAME_PASSWORD_NOT_MATCH);
//					worngPasswordUser = username;
//				}
//
//
//
////				else if(user.isAdmin()){
////					eventBus.fireEvent(new AdminEvent());
////				}
//				else{
//					
//					fetchGlobalPreferences(user);
//
//				}
//				
//			}
//				display.getBtnSubmit().removeStyleName("loading-pulse");
//			}
//			@Override
//			public void onFailure(Throwable caught) {
//				display.getBtnSubmit().removeStyleName("loading-pulse");
//			}
//		});
//
//	}
	
	public void signIn()
	{
		display.getLblError().setText("");
		final String username = display.getTxtUserName().getText();
		//		final LoadingPopup loadingPopup = new LoadingPopup();
		display.getBtnSubmit().addStyleName("loading-pulse");

		
		Defaults.setServiceRoot(GWT.getHostPageBaseURL());
		SignInClient client = GWT.create(SignInClient.class);

		client.signIn(username, display.getTxtPassword().getText(), new MethodCallback<UserEntity>() {
			
			@Override
			public void onSuccess(Method method, UserEntity user) {
				if(user.getStatus() == ApplicationConstants.BLOCK || user.getStatus() == ApplicationConstants.CLOSED ){
					String status = user.getStatus() == ApplicationConstants.BLOCK?"Blocked":"Closed";
					display.getLblError().setText("Your Account is " + status + " , Please Conatct Adminstrator for activation");
				}
				else{
				if(user!=null && user.getUserFetchStatus().equals(ApplicationConstants.USER_NOT_FOUND)){
					display.getLblError().setText(ApplicationConstants.USER_NOT_FOUND);
				}
				else if(user!=null && user.getUserFetchStatus().equals(ApplicationConstants.USERNAME_PASSWORD_NOT_MATCH)){
					if(username.equals(worngPasswordUser)){
						worngPasswordCount = worngPasswordCount+1;
					}else{
						worngPasswordCount = 0;
					}

					if(username.equals(worngPasswordUser) && worngPasswordCount>=2 ){
						inactiveAccount(username);
					}
					display.getLblError().setText(ApplicationConstants.USERNAME_PASSWORD_NOT_MATCH);
					worngPasswordUser = username;
				}



//				else if(user.isAdmin()){
//					eventBus.fireEvent(new AdminEvent());
//				}
				else{
					
					fetchGlobalPreferences(user);

				}
				
			}
				display.getBtnSubmit().removeStyleName("loading-pulse");
			
			
				
			}
			
			@Override
			public void onFailure(Method method, Throwable exception) {
				display.getBtnSubmit().removeStyleName("loading-pulse");
				Window.alert(exception.getLocalizedMessage());
				
			}
		});
		

	}
	
	private void setFooter(GlobalPreferencesEntity globalPreferencesEntity) {
		FooterView footerView = new FooterView();
		Presenter presenter = new FooterPresenter(rpcService, eventBus, footerView, globalPreferencesEntity);
		HasWidgets container = RootPanel.get("footerContainer");
		container.clear();
		presenter.go(container);
	}

	private void setHeader(UserEntity user, GlobalPreferencesEntity globalPreferences) {
		HeaderView headerView = new HeaderView();
		HeaderPresenter headerPresenter = new HeaderPresenter(rpcService, eventBus, headerView, user, globalPreferences);
		HasWidgets container = RootPanel.get("headerContainer");
		container.clear();
		headerPresenter.go(container);
	}

	private void fetchGlobalPreferences(final UserEntity user) {
		rpcService.fetchGlobalPreferences(new AsyncCallback<GlobalPreferencesEntity>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Fail Fetch Global Preferences: "+ caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(GlobalPreferencesEntity globalPreferences) {
				setHeader(user, globalPreferences);
				setFooter(globalPreferences);
				eventBus.fireEvent(new MainEvent(user, globalPreferences));

			}
		});


	}

	public void inactiveAccount(String username){
		rpcService.inactivateAccount(username, new AsyncCallback<String>(){

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Failed: Incativating account" + caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(String result) {
				display.getLblError().setText(result);

			}});
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

		display.getBtnForgotUsername().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				History.newItem(ApplicationConstants.TOKEN_FORGOT_USERNAME);
			}
		});
	}
}


