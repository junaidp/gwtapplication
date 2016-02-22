package com.mamallan.gwtapp.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.view.widgets.DisplayAlert;
import com.mamallan.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.mamallan.gwtapp.shared.entity.MyAccountEntity;
import com.mamallan.gwtapp.shared.entity.MyAccountPreferencesEntity;
import com.mamallan.gwtapp.shared.entity.UserEntity;

public class ViewPlanPresenter implements Presenter 

{

	private final Display display;
	private GlobalPreferencesEntity globalPreferencesEntity;
	private UserEntity loggedInUser;
	private HelloServiceAsync rpcService;
	
	public interface Display 
	{
		Widget asWidget();
		void displaySelectedPanels(MyAccountPreferencesEntity myAccountPreferencesEntity);
		Button getBtnUpdate();
		void updateFields(MyAccountEntity myAccountEntity);
		void updateMyAccount(MyAccountEntity myAccountEntity);
	}  

	public ViewPlanPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, GlobalPreferencesEntity globalPreferencesEntity, UserEntity loggedInUser) 
	{
		this.display = view;
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
