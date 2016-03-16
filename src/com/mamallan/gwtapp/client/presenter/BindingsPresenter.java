package com.mamallan.gwtapp.client.presenter;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.client.view.PopupsView;
import com.mamallan.gwtapp.client.view.widgets.AddBindingWidget;
import com.smartgwt.client.util.SC;

public class BindingsPresenter implements Presenter 

{
	
	private final Display display;
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;

	public interface Display 
	{
		Widget asWidget();
		Button getBtnAddBinding();
	}  

	public BindingsPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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

	private void fetchBeans(final AddBindingWidget addBindingWidget) {
		
		

			final LinkedHashMap<String, String> valueMapBindingsList = new LinkedHashMap<String, String>();  

			rpcService.fetchPackages(new AsyncCallback<ArrayList<String>>() {

				@Override
				public void onFailure(Throwable caught) {
					SC.warn("fetchPackages failed : "+ caught.getLocalizedMessage());
				}

				@Override
				public void onSuccess(ArrayList<String> result) {
					addBindingWidget.getListBindings().clearValue();

					for(int i=0; i< result.size(); i++){
						if(result.get(i).startsWith(ApplicationConstants.DEFAULT_PACKAGE)){
							valueMapBindingsList.put(result.get(i), result.get(i));
						}
					}
					addBindingWidget.getListBindings().setValueMap(valueMapBindingsList);
					addBindingWidget.getListBindings().setDefaultValue("Select Binding");

				}
			});

		}


	private void bind() {

		display.getBtnAddBinding().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				AddBindingWidget addBindingWidget = new AddBindingWidget();
				final PopupPanel popup = new PopupPanel();
				popup.setWidget(addBindingWidget);
				popup.center();
				
				addBindingWidget.getImgClose().addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						popup.removeFromParent();
					}
				});
				populateAddBindingWidget(addBindingWidget);
			}

			
		});

	}
	
	private void populateAddBindingWidget(
			AddBindingWidget addBindingWidget) {
		
		fetchBeans(addBindingWidget);
		
	}

	@Override
	public void setHandlers() {
		
	}
	
}
