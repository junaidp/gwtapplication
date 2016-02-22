package com.mamallan.gwtapp.client.presenter;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.client.view.widgets.DisplayAlert;
import com.mamallan.gwtapp.shared.entity.UserEntity;

public class ManageUserPresenter implements Presenter 

{
	
	private final Display display;
	private final HelloServiceAsync rpcService;
	private ArrayList<UserEntity> users;
	private UserEntity selectedUser;
	
	public interface Display 
	{
		Widget asWidget();
		CheckBox getCheckActive();
		Button getBtnSubmit();
		ListBox getLisUsers();
	
	}  

	public ManageUserPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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
		
		fetchAllusers();
	}

	private void fetchAllusers() {
		rpcService.fetchAllUsers(new AsyncCallback<ArrayList<UserEntity>>() {
			
			@Override
			public void onSuccess(ArrayList<UserEntity> result) {
				users = result;
				display.getLisUsers().clear();
				display.getLisUsers().addItem("Select User", "0");
				for(int i=0; i<users.size(); i++){
					display.getLisUsers().addItem(users.get(i).getUserName(), users.get(i).getUserId()+"");
				}
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("fail fetchAllusers: "+ caught.getLocalizedMessage());
			}
		});
		
	}

	private void bind() {
		

	}

	@Override
	public void setHandlers() {
		
		display.getBtnSubmit().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				updateUser();
				
			}
		});
		
		display.getLisUsers().addChangeHandler(new ChangeHandler() {
			
			@Override
			public void onChange(ChangeEvent event) {
				for(int i=0; i< users.size(); i++){
					if(users.get(i).getUserId() == Integer.parseInt(display.getLisUsers().getValue(display.getLisUsers().getSelectedIndex()))){
						selectedUser = users.get(i);
						updateUserValues(i);
						break;
					}
				}
				
			}

			
		});
	}
	
	@SuppressWarnings("deprecation")
	private void updateUserValues(int i) {
		if(users.get(i).getStatus()== ApplicationConstants.ACTIVE){
			display.getCheckActive().setChecked(true);
		}
		else if(users.get(i).getStatus()== ApplicationConstants.BLOCK){
			display.getCheckActive().setChecked(false);
		}
	}
	
	@SuppressWarnings("deprecation")
	private void updateUser() {
		if(display.getCheckActive().isChecked()){
			selectedUser.setStatus(1);
		}else{
			selectedUser.setStatus(2);
		}
		
		rpcService.updateUserAccount(selectedUser, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("fail updateUserAccount : "+caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(String result) {
				new DisplayAlert(result);
				fetchAllusers();
			}
		});
		
	}
	
}
