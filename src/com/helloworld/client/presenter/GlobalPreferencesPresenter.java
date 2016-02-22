package com.helloworld.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.HelloServiceAsync;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences.EditRegistrationDetails;
import com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences.ViewPlan;
import com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences.ViewRegistrationDetails;
import com.helloworld.client.view.widgets.DisplayAlert;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.MyAccountPreferencesEntity;

@SuppressWarnings("deprecation")
public class GlobalPreferencesPresenter implements Presenter 

{

	private final Display display;
	private ViewPlan viewPlan;
	private ViewRegistrationDetails viewRegistration;
	private EditRegistrationDetails editRegistration;
	private final HelloServiceAsync rpcService;
	private GlobalPreferencesEntity alreadySavedGlobalPreferencesEntity;

	public interface Display 
	{
		Widget asWidget();
		Tree getTreePreferences();
		HorizontalSplitPanel getSplitPanel();
		HasClickHandlers getBtnCancel();
		Button getBtnSave();
	}  

	public GlobalPreferencesPresenter(HelloServiceAsync rpcService, HandlerManager eventBus, Display view) 
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

		fetchExistingGlobalPreferences();
	}



	@Override
	public void setHandlers() {

		display.getBtnCancel().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				History.back();
			}
		});

		display.getBtnSave().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				savePreferences();

			}

		});

		display.getTreePreferences().addSelectionHandler(new SelectionHandler<TreeItem>() {

			@Override
			public void onSelection(SelectionEvent<TreeItem> event) {
				TreeItem item = event.getSelectedItem();

				switch (item.getHTML()) {
				case ApplicationConstants.VIEW_PLAN:  
					if(viewPlan ==null){
						viewPlan = new ViewPlan();
						viewPlan.updateFieldsWithAlreadySavedPreferences(alreadySavedGlobalPreferencesEntity);
					}

					display.getSplitPanel().setRightWidget(viewPlan);
					break;
				case ApplicationConstants.VIEW_REGISTRATION:  
					if(viewRegistration == null){
					viewRegistration = new ViewRegistrationDetails();
					viewRegistration.updateFieldsWithAlreadySavedPreferences(alreadySavedGlobalPreferencesEntity);
					
					}
					display.getSplitPanel().setRightWidget(viewRegistration);
					break;
					
				case ApplicationConstants.EDIT_REGISTRATION:  
					if(editRegistration == null){
						editRegistration = new EditRegistrationDetails();
						editRegistration.updateFieldsWithAlreadySavedPreferences(alreadySavedGlobalPreferencesEntity);
					
					}
					display.getSplitPanel().setRightWidget(editRegistration);
					break;
				}	
			}
		});
	}

	private void savePreferences() {
		GlobalPreferencesEntity globalPreferencesEntity;
		if(alreadySavedGlobalPreferencesEntity== null){
			globalPreferencesEntity = new  GlobalPreferencesEntity();
			MyAccountPreferencesEntity myAccountPreferencesEntity = new MyAccountPreferencesEntity();
			globalPreferencesEntity.setMyAccountPreferencesId(myAccountPreferencesEntity);

		}else{
			globalPreferencesEntity = alreadySavedGlobalPreferencesEntity;
		}
		saveGlobalPreferences(globalPreferencesEntity);


	}

	private void saveGlobalPreferences(GlobalPreferencesEntity globalPreferencesEntity) {
		if(viewPlan!=null){
			globalPreferencesEntity.getMyAccountPreferencesId().setShowPaymentDetails(viewPlan.getPaymentDetails().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewPaymentTerms(viewPlan.getCheckBoxPaymentPlan().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewPlanMonthlyPayments(viewPlan.getCheckBoxMonthly().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewPlanQuarterlyPayments(viewPlan.getCheckBoxQuaterly().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewPlanYearlyPayments(viewPlan.getCheckBoxYearly().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewPlanShowPanel(viewPlan.getCheckShowThisPanel().isChecked());
			
		}
		if(viewRegistration!=null){
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegName(viewRegistration.getCheckName().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegLastEdited(viewRegistration.getCheckLastTimeEdited().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegUserName(viewRegistration.getCheckUserName().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegEmail(viewRegistration.getCheckEmail().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegRegisteredTo(viewRegistration.getCheckRegisteredTo().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setViewRegShowPanel(viewRegistration.getCheckShowThisPanel().isChecked());
			
		}if(editRegistration!=null){
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegName(editRegistration.getCheckName().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegUserName(editRegistration.getCheckUserName().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegEmail(editRegistration.getCheckEmail().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegRegisteredTo(editRegistration.getCheckRegisteredTo().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegShowPanel(editRegistration.getCheckShowThisPanel().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegPassword(editRegistration.getCheckPassword().isChecked());
			globalPreferencesEntity.getMyAccountPreferencesId().setEditRegCloseAccount(editRegistration.getCheckCloseAccount().isChecked());
			
		}
		
		display.getBtnSave().addStyleName("loading-pulse");
		rpcService.updateGlobalPreferences(globalPreferencesEntity, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getLocalizedMessage());
				display.getBtnSave().removeStyleName("loading-pulse");
			}

			@Override
			public void onSuccess(String result) {
				new DisplayAlert(result);
				History.back();
				display.getBtnSave().removeStyleName("loading-pulse");
			}
		});

	}

	private void fetchExistingGlobalPreferences() {

		rpcService.fetchGlobalPreferences(new AsyncCallback<GlobalPreferencesEntity>() {

			@Override
			public void onSuccess(GlobalPreferencesEntity result) {
				alreadySavedGlobalPreferencesEntity = result;

			}

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}
		});
	}

}
