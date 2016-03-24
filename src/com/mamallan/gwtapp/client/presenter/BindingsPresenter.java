package com.mamallan.gwtapp.client.presenter;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.RowStyles;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.HelloServiceAsync;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.client.view.widgets.AddBindingWidget;
import com.mamallan.gwtapp.client.view.widgets.DisplayAlert;
import com.mamallan.gwtapp.shared.BindingsFieldVerifier;
import com.mamallan.gwtapp.shared.dto.BeanObjectDTO;
import com.mamallan.gwtapp.shared.entity.BindingsEntity;
import com.mamallan.gwtapp.shared.entity.NameSpaceEntity;
import com.smartgwt.client.util.BooleanCallback;
import com.smartgwt.client.util.SC;

public class BindingsPresenter implements Presenter 

{

	private final Display display;
	private final HelloServiceAsync rpcService;
	private final HandlerManager eventBus;
	private LinkedHashMap<String, String> valueMapBindingsList = new LinkedHashMap<String, String>();
	private LinkedHashMap<String, String> valueMapNameSpaceList = new LinkedHashMap<String, String>();
	private BindingsEntity selectedBindingsEntity; // For Editing
	private ArrayList<Integer> selectedBindings = new ArrayList<Integer>(); // For deletion

	public interface Display 
	{
		Widget asWidget();
		Button getBtnAddBinding();
		void popuplateTable(ArrayList<BindingsEntity> bindings);
		Column<BindingsEntity, String> getEditColumn();
		Column<BindingsEntity, String> getRemoveColumn();
		Column<BindingsEntity, Boolean> getCbColumn();
		Button getBtnDeleteBindings();
		CellTable<BindingsEntity> getTableBindings();
		TextBox getTxtSearch();
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
		fetchBindings("");

	}

	private void fetchBindings(String keyword) {
		rpcService.fetchAllBindings(keyword, new AsyncCallback<ArrayList<BindingsEntity>>() {

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

	private void fetchNameSpaces(final AddBindingWidget addBindingWidget) {
		rpcService.fetchNameSpaces(new AsyncCallback<ArrayList<NameSpaceEntity>>() {

			@Override
			public void onSuccess(ArrayList<NameSpaceEntity> result) {
				addBindingWidget.getListBindings().clearValue();

				for(int i=0; i< result.size(); i++){

					valueMapNameSpaceList.put(result.get(i).getNameSpaceId()+"", result.get(i).getNameSpaceName());

				}
				addBindingWidget.getListNameSpace().setValueMap(valueMapNameSpaceList);
				//				addBindingWidget.getListBindings().setDefaultValue("int");

				if(selectedBindingsEntity != null){
					addBindingWidget.getTxtBindingName().setText(selectedBindingsEntity.getBindingName());
					addBindingWidget.getTxtBindingValue().setText(selectedBindingsEntity.getBindingValue());
					addBindingWidget.getListBindings().setValue(selectedBindingsEntity.getBindingType());
					addBindingWidget.getListNameSpace().setValue(selectedBindingsEntity.getNameSpaceId().getNameSpaceName());
				}
			}

			@Override
			public void onFailure(Throwable caught) {
				SC.warn("fetch namespaces failed : "+ caught.getLocalizedMessage());
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
				addBindingWidget.getListBindings().setDefaultValue("int");

				if(selectedBindingsEntity != null){
					addBindingWidget.getTxtBindingName().setText(selectedBindingsEntity.getBindingName());
					addBindingWidget.getTxtBindingValue().setText(selectedBindingsEntity.getBindingValue());
					addBindingWidget.getListBindings().setValue(selectedBindingsEntity.getBindingType());
				}
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

		display.getTxtSearch().addKeyUpHandler(new KeyUpHandler() {

			@Override
			public void onKeyUp(KeyUpEvent event) {
				fetchBindings(display.getTxtSearch().getText());
			}
		});

		display.getCbColumn().setFieldUpdater(new FieldUpdater<BindingsEntity, Boolean>() {

			@Override
			public void update(int index, BindingsEntity object, Boolean value) {
				if(value == true){
					selectedBindings.add(object.getBindingId());

					display.getTableBindings().getRowElement(index).addClassName("bluebg");

				}else{
					if(selectedBindings.contains(object.getBindingId())){
						selectedBindings.remove(selectedBindings.indexOf(object.getBindingId()));
						display.getTableBindings().getRowElement(index).removeClassName("bluebg");
					}
				}
				if(selectedBindings.size()>0){
					display.getBtnDeleteBindings().setEnabled(true);
				}else{
					display.getBtnDeleteBindings().setEnabled(false);
				}
			}
		});


		display.getBtnDeleteBindings().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				SC.ask("Are you sure to delete the selected Bindings " , new BooleanCallback() {  
					public void execute(Boolean value) {  
						if (value != null && value) {
							deleteBindigs();

						}
					}
				});
			}
		});

		display.getEditColumn().setFieldUpdater(new FieldUpdater<BindingsEntity, String>() {

			@Override
			public void update(int index, BindingsEntity bindingsEntity, String value) {
				selectedBindingsEntity = bindingsEntity;
				editBinding();

			}
		});

		display.getRemoveColumn().setFieldUpdater(new FieldUpdater<BindingsEntity, String>() {

			@Override
			public void update(int index, BindingsEntity bindingsEntity, String value) {

				final int bindingId = bindingsEntity.getBindingId();
				SC.ask("Are you sure to delete binding named " + bindingsEntity.getBindingName(), new BooleanCallback() {  
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
				selectedBindingsEntity = null;
				openAddBindingWidget();
			}



		});
	}

	private void editBinding() {

		openAddBindingWidget();

	}



	private void deleteBindigs() {
		rpcService.deleteMultipleBindings(selectedBindings, new AsyncCallback<String>() {

			@Override
			public void onSuccess(String result) {
				new DisplayAlert(result);
				fetchBindings("");
				display.getBtnDeleteBindings().setEnabled(false);
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getLocalizedMessage());
			}
		});

	}

	private void openAddBindingWidget() {
		AddBindingWidget addBindingWidget = new AddBindingWidget();

		final PopupPanel popup = new PopupPanel();
		popup.setWidget(addBindingWidget);
		addBindingWidget.getTxtBindingName().setFocus(true);
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
				fetchBindings("");

			}
		});
	}

	private void setAddBindingHandlers(final AddBindingWidget addBindingWidget, final PopupPanel popup) {

		addBindingWidget.getBtnSave().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				saveBinding(addBindingWidget, popup);
			}});

		addBindingWidget.getTxtBindingValue().addKeyUpHandler(new KeyUpHandler() {

			@Override
			public void onKeyUp(KeyUpEvent event) {
				if(event.getNativeKeyCode() == 13){
					saveBinding(addBindingWidget, popup);
				}
			}
		});


	}

	private void populateAddBindingWidget(
			AddBindingWidget addBindingWidget) {

		fetchBeans(addBindingWidget);
		fetchNameSpaces(addBindingWidget);

	}

	@Override
	public void setHandlers() {

	}

	private void saveBinding(final AddBindingWidget addBindingWidget, final PopupPanel popup) {

		addBindingWidget.getHtmlError().clear();
		BindingsFieldVerifier bindingsFieldVerifier = new BindingsFieldVerifier();
		bindingsFieldVerifier.validate(addBindingWidget);

		if(bindingsFieldVerifier.getErrors().getErrors().size()<=0){
			BindingsEntity bindingsEntity = null;
			if(selectedBindingsEntity == null){
				bindingsEntity = new BindingsEntity();
			}else{
				bindingsEntity = selectedBindingsEntity;	
			}
			bindingsEntity.setBindingName(addBindingWidget.getTxtBindingName().getText());
			bindingsEntity.setBindingType( addBindingWidget.getListBindings().getDisplayValue());
			bindingsEntity.setBindingValue(addBindingWidget.getTxtBindingValue().getText());
			NameSpaceEntity nameSpace = new NameSpaceEntity();
			try{
				int nameSpaceId = Integer.parseInt(addBindingWidget.getListNameSpace().getValueAsString());
				String name = addBindingWidget.getListNameSpace().getDisplayValue();
				nameSpace.setNameSpaceId(nameSpaceId);
				nameSpace.setNameSpaceName(name);
			}catch(Exception ex){
				nameSpace.setNameSpaceName(addBindingWidget.getListNameSpace().getValueAsString());
			}

			bindingsEntity.setNameSpaceId(nameSpace);
			saveBindingInDb(popup, bindingsEntity);
		}
		else{
			addBindingWidget.getHtmlError().add(new HTML(bindingsFieldVerifier.getErrorMessages()));
		}
	}

	private void saveBindingInDb(final PopupPanel popup,
			BindingsEntity bindingsEntity) {
		rpcService.saveBinding(bindingsEntity, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getLocalizedMessage());
			}

			@Override
			public void onSuccess(String result) {
				if(result.equals("binding saved")){
					new DisplayAlert(result);
					fetchBindings("");
					popup.removeFromParent();
				}else{
					SC.warn(result);
				}
			}
		});
	}

}
