package com.mamallan.gwtapp.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.view.ApplicationConstants;

public class ForgotPasswordPresenter implements Presenter 

{
	
	private final Display display;
	private final HelloServiceAsync rpcService;
	
	public interface Display 
	{
		Widget asWidget();
		Button getBtnSubmit();
		void setHtmlError(SafeHtml safeHtml);
		TextBox getTxtUserName();
		TextBox getTxtEmail();
	}  

	public ForgotPasswordPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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
		
		display.getBtnSubmit().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				display.setHtmlError(SafeHtmlUtils.fromTrustedString(""));
				forgotPassword();
			}

			});
		
		
	}
	
	private void forgotPassword() {
		checkUserStatus(display.getTxtUserName().getText(), display.getTxtEmail().getText());
	}
	
	public void checkUserStatus(final String username, String email){
		display.getBtnSubmit().addStyleName("loading-pulse");
		rpcService.fetchUserStatus(username, email , new AsyncCallback<String>(){

			@Override
			public void onFailure(Throwable caught) {
				display.getBtnSubmit().removeStyleName("loading-pulse");
				Window.alert("Fail: fetch user status");
			}

			@Override
			public void onSuccess(String result) {
				if(result.equals(ApplicationConstants.CONTACT_ADMIN)){
					display.setHtmlError(SafeHtmlUtils.fromTrustedString(result));
				}else{
					if(result.contains("does not match")){
//						if(username.equals(worngPasswordUser)){
//							worngPasswordCount = worngPasswordCount+1;
//						}else{
//							worngPasswordCount = 0;
//						}
//						
//						if(username.equals(worngPasswordUser) && worngPasswordCount>=2 ){
//							inactiveAccount(username);
//						}
//						else{
							display.setHtmlError(SafeHtmlUtils.fromTrustedString(result));
//						}
//						worngPasswordUser = username;
					}else{
						display.setHtmlError(SafeHtmlUtils.fromTrustedString(result));
					}
				}
				display.getBtnSubmit().removeStyleName("loading-pulse");
			}});
	}

	
	
}
