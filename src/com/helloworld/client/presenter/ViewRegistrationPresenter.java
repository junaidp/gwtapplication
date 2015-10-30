package com.helloworld.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.MyAccountPreferencesEntity;
import com.helloworld.shared.entity.UserEntity;

public class ViewRegistrationPresenter implements Presenter 

{

	private final Display display;
	private GlobalPreferencesEntity globalPreferencesEntity;
	private UserEntity loggedInUser;
	
	public interface Display 
	{
		Widget asWidget();
		void displaySelectedPanels(MyAccountPreferencesEntity myAccountPreferencesEntity);
		void updateUIFields(UserEntity userEntity);
	}  

	public ViewRegistrationPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view, GlobalPreferencesEntity globalPreferencesEntity, UserEntity loggedInUser) 
	{
		this.display = view;
		this.globalPreferencesEntity = globalPreferencesEntity;
		this.loggedInUser = loggedInUser;
	}

	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(display.asWidget());
		bind();
		setHandlers();
		display.updateUIFields(loggedInUser);
		
	}

	private void bind() {
		if(globalPreferencesEntity!=null){
			display.displaySelectedPanels(globalPreferencesEntity.getMyAccountPreferencesId());
		}

	}

	@Override
	public void setHandlers() {
		
		
		
	
	}
	


}
