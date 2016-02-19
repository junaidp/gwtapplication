package com.mamallan.gwtapp.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.event.GlobalPreferencesEvent;
import com.mamallan.gwtapp.client.view.AdminView;
import com.mamallan.gwtapp.client.view.ApplicationConstants;

public class AdminPresenter implements Presenter 

{
	
	private final Display display;
	private final HandlerManager eventBus;

	public interface Display 
	{
		Widget asWidget();
		Anchor getGlobalPreferences();
		Anchor getAnchorEditUser();
	}  

	public AdminPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
	{
		this.display = view;
		this.eventBus = eventBus;
		
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
		
		display.getAnchorEditUser().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				History.newItem(ApplicationConstants.TOKEN_MANAGE_USER);
			}
		});
		
		display.getGlobalPreferences().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new GlobalPreferencesEvent());
			}
		});
	}
	
}
