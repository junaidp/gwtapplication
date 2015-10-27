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
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.widgets.DisplayAlert;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.MyAccountPreferencesEntity;
import com.helloworld.shared.entity.UserEntity;

public class ViewPlanPresenter implements Presenter 

{

	private final Display display;
	private final HandlerManager eventBus;
	private GlobalPreferencesEntity globalPreferencesEntity;
	private UserEntity loggedInUser;
	private HelloServiceAsync rpcService;
	
	public interface Display 
	{
		Widget asWidget();
		Label getBtnBack();
		void displaySelectedPanels(MyAccountPreferencesEntity myAccountPreferencesEntity);
		Button getBtnUpdate();
		void updateFields(MyAccountEntity myAccountEntity);
		void updateMyAccount(MyAccountEntity myAccountEntity);
	}  

	public ViewPlanPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, GlobalPreferencesEntity globalPreferencesEntity, UserEntity loggedInUser) 
	{
		this.display = view;
		this.eventBus = eventBus;
		this.globalPreferencesEntity = globalPreferencesEntity;
		this.loggedInUser = loggedInUser;
		this.rpcService = rpcService;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
		display.updateFields(loggedInUser.getMyAccountId());
	}

	private void bind() {
		if(globalPreferencesEntity!=null){
			display.displaySelectedPanels(globalPreferencesEntity.getMyAccountPreferencesId());
		}

	}

	@Override
	public void setHandlers() {
		
		display.getBtnUpdate().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				 display.updateMyAccount(loggedInUser.getMyAccountId());
				 updateMyAccountInDb();
			}

			});
		
		display.getBtnBack().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				History.back();
			}
		});


	}
	
	private void updateMyAccountInDb() {
		display.getBtnUpdate().addStyleName("loading-pulse");
			rpcService.updateMyAccount(loggedInUser.getMyAccountId(), new AsyncCallback<String>() {
				
				@Override
				public void onSuccess(String result) {
					new DisplayAlert(result);
					display.getBtnUpdate().removeStyleName("loading-pulse");
				}
				
				@Override
				public void onFailure(Throwable caught) {
					display.getBtnUpdate().removeStyleName("loading-pulse");
					Window.alert("Fail int"+ caught.getLocalizedMessage());
				}
			});
	}

}
