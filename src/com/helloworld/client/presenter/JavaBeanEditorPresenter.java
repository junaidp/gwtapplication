package com.helloworld.client.presenter;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.widgets.AddBeanProportyWidget;
import com.helloworld.client.view.widgets.DisplayAlert;
import com.helloworld.shared.AddedBeanDTO;
import com.helloworld.shared.AddedBeanPropertyDTO;
import com.smartgwt.client.util.BooleanCallback;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Window;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.events.ClickEvent;
import com.smartgwt.client.widgets.form.fields.events.ClickHandler;


public class JavaBeanEditorPresenter implements Presenter 

{
	
	private final Display display;
	private final HelloServiceAsync rpcService;
	private ArrayList<AddedBeanPropertyDTO> listAddedBeanPropertyDTO = new ArrayList<AddedBeanPropertyDTO>();
	
	public interface Display 
	{
		Widget asWidget();
		ButtonItem getBtnGenerate();
		ButtonItem getBtnAddProperty();
		ButtonItem getBtnCreate();
	}  

	public JavaBeanEditorPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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
		populatePackagesList();
	}
	
	public void populatePackagesList(){
		
		LinkedHashMap<String, String> valueMapPackagesList = new LinkedHashMap<String, String>();  
		   
		valueMapGetterSetters.put("getters", "Getters");
		
		Package[] packagesList = Package.getPackages();
		for(int i=0; i< packagesList.length; i++){
			packagesList[i].getName();
		}
	}

	@Override
	public void setHandlers() {
			
		display.getBtnGenerate().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				fetchBeanjson();
			}
		});
		
		
		
		display.getBtnCreate().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				if(listAddedBeanPropertyDTO.size()<1){
					alertNoProperties();
				}
			}
		});

		
		display.getBtnAddProperty().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
			
				Window window = new Window();
				window.setSize("500px", "400px");
				window.setCanDragResize(true);
				AddBeanProportyWidget addBeanProportyWidget = new AddBeanProportyWidget();
				window.addItem(addBeanProportyWidget);
				window.setTitle("Bean Properties");
				window.moveTo(400, 300);
				window.show();
				addBeanProportyWidgetHandlers(addBeanProportyWidget);
				
			}
		});
	}
	
	private void addBeanProportyWidgetHandlers(final AddBeanProportyWidget addBeanProportyWidget) {
		addBeanProportyWidget.getBtnSave().addClickHandler(new com.smartgwt.client.widgets.form.fields.events.ClickHandler() {
			
			@Override
			public void onClick(
					com.smartgwt.client.widgets.form.fields.events.ClickEvent event) {
				saveBeanProperty(addBeanProportyWidget);
			}
		});
		
	}
	
	private void alertNoProperties() {
		 SC.ask("You have not added any property to this bean , You like to proceed with empty Bean?", new BooleanCallback() {  
               public void execute(Boolean value) {  
                   if (value != null && value) {  
                      generateBean();
                   }  
               }
         });  
	}
	
	private void generateBean() {
		AddedBeanDTO addedBeanDTO = new AddedBeanDTO();
		addedBeanDTO.setListProperties(listAddedBeanPropertyDTO);
		rpcService.generateBean();
	}  
	
	private void saveBeanProperty(
			AddBeanProportyWidget addBeanProportyWidget) {
		
		AddedBeanPropertyDTO addedBeanPropertyDTO = new AddedBeanPropertyDTO();
		addedBeanPropertyDTO.setDataType(addBeanProportyWidget.getListDataType().getDisplayValue());
		addedBeanPropertyDTO.setGetterSetter(addBeanProportyWidget.getListHaveGetterSetters().getDisplayValue());
		addedBeanPropertyDTO.setModifier(addBeanProportyWidget.getListAccessModifiers().getDisplayValue());
		addedBeanPropertyDTO.setName(addBeanProportyWidget.getTextPropertyName().getDisplayValue());
		listAddedBeanPropertyDTO.add(addedBeanPropertyDTO);
	
	}
	
	private void fetchBeanjson() {
		rpcService.fetchBeanJSON("com.helloworld.shared.beans.MyFirstBean", new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String json) {
				new DisplayAlert("Json retrieved");
//					 JSONValue jsonValue = JSONParser.parse(json);
//			         JSONObject object = jsonValue.isObject();
			}
			
			@Override
			public void onFailure(Throwable caught) {
				new DisplayAlert("fail fetchBeanJson: "+ caught.getLocalizedMessage());
			}
		});
	}
	
}
