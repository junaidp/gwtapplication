package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.widgets.DisplayAlert;

public class ForgotPasswordPresenter implements Presenter 

{
	
	private final Display display;
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private int worngPasswordCount = 0;
	private String worngPasswordUser = "";

	public interface Display 
	{
		Widget asWidget();
		Label getBtnBack();
		Button getBtnSubmit();
		void setHtmlError(SafeHtml safeHtml);
		TextBox getTxtUserName();
		TextBox getTxtEmail();
	}  

	public ForgotPasswordPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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
				forgotPassword();
			}

			});
		
		display.getBtnBack().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				History.back();
			}
		});
	}
	
	private void forgotPassword() {
		checkUserStatus(display.getTxtUserName().getText());
	}
	
	public void checkUserStatus(final String username){
		rpcService.fetchUserStatus(username, new AsyncCallback<String>(){

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Fail: fetch user status");
			}

			@Override
			public void onSuccess(String result) {
				if(result.equals(ApplicationConstants.CONTACT_ADMIN)){
				new DisplayAlert(result);
				}else{
					if(result.contains("does not match")){
						if(username.equals(worngPasswordUser)){
							worngPasswordCount = worngPasswordCount+1;
						}else{
							worngPasswordCount = 0;
						}
						
						if(username.equals(worngPasswordUser) && worngPasswordCount>=2 ){
							display.setHtmlError(SafeHtmlUtils.fromTrustedString("The answer you have enterted does not match the answer you submitted at <br>" +
									" the time of creating the password" + ". Please contact your TIE administrator "));
							
							inactiveAccount(username);
						}else{
							display.setHtmlError(SafeHtmlUtils.fromTrustedString(result));
						}
						worngPasswordUser = username;
					}else{
						display.setHtmlError(SafeHtmlUtils.fromTrustedString(result));
					}
				}

			}});
	}

	public void inactiveAccount(String username){
		rpcService.inactivateAccount(username, new AsyncCallback<String>(){

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Failed: Incativating account");
			}

			@Override
			public void onSuccess(String result) {
				
			}});
	}
	
}
