package com.mamallan.gwtapp.client.presenter;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.client.view.widgets.AddBindingWidget;
import com.mamallan.gwtapp.client.view.widgets.DisplayAlert;
import com.mamallan.gwtapp.shared.dto.BeanObjectDTO;
import com.mamallan.gwtapp.shared.entity.BindingsEntity;
import com.smartgwt.client.util.BooleanCallback;
import com.smartgwt.client.util.SC;

public class BindingsPresenter implements Presenter 

{

	private final Display display;
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private LinkedHashMap<String, String> valueMapBindingsList = new LinkedHashMap<String, String>();  

	public interface Display 
	{
		Widget asWidget();
		Button getBtnAddBinding();
		void popuplateTable(ArrayList<BindingsEntity> bindings);
		Column<BindingsEntity, String> getEditColumn();
		Column<BindingsEntity, String> getRemoveColumn();

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
		addPremetiveTypes();
		fetchBindings();
	}

	private void fetchBindings() {
		rpcService.fetchAllBindings(new AsyncCallback<ArrayList<BindingsEntity>>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("fetchAllBindings Failed :" + caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(ArrayList<BindingsEntity> result) {
				display.popuplateTable(result);
			}
		});

	}

	private void fetchBeans(final AddBindingWidget addBindingWidget) {
		rpcService.fetchAllBeansInDb(new AsyncCallback<ArrayList<BeanObjectDTO>>() {

			@Override
			public void onSuccess(ArrayList<BeanObjectDTO> result) {
				addBindingWidget.getListBindings().clearValue();

				for(int i=0; i< result.size(); i++){

					valueMapBindingsList.put(result.get(i).getBeanId()+"", result.get(i).getBeanName());

				}
				addBindingWidget.getListBindings().setValueMap(valueMapBindingsList);
				addBindingWidget.getListBindings().setDefaultValue("Select Binding");
			}

			@Override
			public void onFailure(Throwable caught) {
				SC.warn("fetch beans failed : "+ caught.getLocalizedMessage());
			}
		});
	}

	private void addPremetiveTypes() {
		valueMapBindingsList.put("short"   , "short");  
		valueMapBindingsList.put("int"     , "int");  
		valueMapBindingsList.put("long"    , "long");  
		valueMapBindingsList.put("float"   , "float");  
		valueMapBindingsList.put("double"  , "double");  
		valueMapBindingsList.put("boolean" , "boolean");  
		valueMapBindingsList.put("char"    , "char");
		valueMapBindingsList.put("string"  , "String");
		valueMapBindingsList.put("byte"    , "byte");
		valueMapBindingsList.put("date"    , "date");
	}

	private void bind() {

		display.getEditColumn().setFieldUpdater(new FieldUpdater<BindingsEntity, String>() {

			@Override
			public void update(int index, BindingsEntity bindingsEntity, String value) {
				editBinding(bindingsEntity);

			}
		});

		display.getRemoveColumn().setFieldUpdater(new FieldUpdater<BindingsEntity, String>() {

			@Override
			public void update(int index, BindingsEntity bindingsEntity, String value) {

				final int bindingId = bindingsEntity.getBindingId();
				SC.ask("binding named " + bindingsEntity.getBindingName()+ " will be deleted ", new BooleanCallback() {  
					public void execute(Boolean value) {  
						if (value != null && value) {
							deleteBinding(bindingId);

						}

					}

				});
			}
		});

		display.getBtnAddBinding().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				openAddBindingWidget();
			}

			

		});
	}

	private void editBinding(BindingsEntity bindingsEntity) {

		openAddBindingWidget(bindingsEntity);

	}
	
	private void openAddBindingWidget(BindingsEntity bindingsEntity) {
		AddBindingWidget addBindingWidget = new AddBindingWidget();
		addBindingWidget.getTxtBindingName().setText(bindingsEntity.getBindingName());
		addBindingWidget.getTxtBindingValue().setText(bindingsEntity.getBindingValue());
//		addBindingWidget.getListBindings().
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
		setAddBindingHandlers(addBindingWidget, popup);
	}
	
	private void openAddBindingWidget() {
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
		setAddBindingHandlers(addBindingWidget, popup);
	}

	private void deleteBinding(int bindingId) {

		rpcService.deleteBinding(bindingId, new AsyncCallback<String>(){

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(String result) {
				new DisplayAlert(result);
				fetchBindings();

			}
		});
	}

	private void setAddBindingHandlers(final AddBindingWidget addBindingWidget, final PopupPanel popup) {

		addBindingWidget.getBtnSave().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				saveBinding(addBindingWidget, popup);
			}});


	}

	private void populateAddBindingWidget(
			AddBindingWidget addBindingWidget) {

		fetchBeans(addBindingWidget);

	}

	@Override
	public void setHandlers() {

	}

	private void saveBinding(final AddBindingWidget addBindingWidget, final PopupPanel popup) {

		BindingsEntity bindingsEntity = new BindingsEntity();
		bindingsEntity.setBindingName(addBindingWidget.getTxtBindingName().getText());
		bindingsEntity.setBindingType( addBindingWidget.getListBindings().getDisplayValue());
		bindingsEntity.setBindingValue(addBindingWidget.getTxtBindingValue().getText());
		rpcService.saveBinding(bindingsEntity, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(String result) {
				new DisplayAlert(result);
				fetchBindings();
				popup.removeFromParent();
			}
		});

	}

}
