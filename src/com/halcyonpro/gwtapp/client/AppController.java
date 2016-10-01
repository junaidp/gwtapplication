/*******************************************************************************
 * Copyright (c) 2015 Halcyon Technologies.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Affero GNU Public License
 *   which accompanies this distribution, and is available at
 *   https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   Copyright:
 *       Halcyon Technologies llc
 *   
 *   This file is part of the Business Suite software of Halcyonpro.net.
 *   Copyright (C) 2012-2020 Halcyonpro.net
 *  
 *   The primary contact email is support@halcyonpro.net
 *  
 *   Version: AGPL
 *  
 *   Halcyon Technologies, Halcyon Information Systems, Halcyonpro along with their domain names,  
 *   etc and the names Acuity, Ingenuity, Derivo, Colander etc are copyright of
 *   Halcyon llc and usage of these without prior permission of the owner is strictly prohibited
 *    
 *  The contents of this file may be used under the terms of
 *   the Affero GNU General Public License Version (the "AGPL"),
 *   A copy of the AGPL v2.1 can be obtained from https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   AGPL, in essence, means that this software requires a commercial license for use in or as a commercial application
 *******************************************************************************/
package com.halcyonpro.gwtapp.client;


import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
//import com.helloworld.client.view.CenterPanels.DashboardPortalView;
import com.halcyonpro.gwtapp.client.event.AdminEvent;
import com.halcyonpro.gwtapp.client.event.AdminEventHandler;
import com.halcyonpro.gwtapp.client.event.AssignEditorsEvent;
import com.halcyonpro.gwtapp.client.event.AssignEditorsEventHandler;
import com.halcyonpro.gwtapp.client.event.DashboardAccordionEvent;
import com.halcyonpro.gwtapp.client.event.DashboardAccordionEventHandler;
import com.halcyonpro.gwtapp.client.event.DashboardEvent;
import com.halcyonpro.gwtapp.client.event.DashboardEventHandler;
import com.halcyonpro.gwtapp.client.event.DynamicBeanEditorEvent;
import com.halcyonpro.gwtapp.client.event.DynamicBeanEditorEventHandler;
import com.halcyonpro.gwtapp.client.event.EditUserEvent;
import com.halcyonpro.gwtapp.client.event.EditUserEventHandler;
import com.halcyonpro.gwtapp.client.event.GlobalPreferencesEvent;
import com.halcyonpro.gwtapp.client.event.GlobalPreferencesEventHandler;
import com.halcyonpro.gwtapp.client.event.JavaBeanEditorEvent;
import com.halcyonpro.gwtapp.client.event.JavaBeanEditorEventHandler;
import com.halcyonpro.gwtapp.client.event.MainEvent;
import com.halcyonpro.gwtapp.client.event.MainEventHandler;
import com.halcyonpro.gwtapp.client.event.MyAccountEvent;
import com.halcyonpro.gwtapp.client.event.MyAccountEventHandler;
import com.halcyonpro.gwtapp.client.event.RegistrationEvent;
import com.halcyonpro.gwtapp.client.event.RegistrationEventHandler;
import com.halcyonpro.gwtapp.client.event.SearchDataEvent;
import com.halcyonpro.gwtapp.client.event.SearchDataEventHandler;
import com.halcyonpro.gwtapp.client.event.SubscriptionVerificationEvent;
import com.halcyonpro.gwtapp.client.event.SubscriptionVerificationEventHandler;
import com.halcyonpro.gwtapp.client.event.ViewEditRegistrationEvent;
import com.halcyonpro.gwtapp.client.event.ViewEditRegistrationEventHandler;
import com.halcyonpro.gwtapp.client.event.ViewPlanEvent;
import com.halcyonpro.gwtapp.client.event.ViewPlanEventHandler;
import com.halcyonpro.gwtapp.client.presenter.AdminPresenter;
import com.halcyonpro.gwtapp.client.presenter.AssignDataToBeanPresenter;
import com.halcyonpro.gwtapp.client.presenter.BeanFieldsEditorPresenter;
import com.halcyonpro.gwtapp.client.presenter.BindingsPresenter;
import com.halcyonpro.gwtapp.client.presenter.CreatePasswordPresenter;
import com.halcyonpro.gwtapp.client.presenter.DashboardAccordionPresenter;
import com.halcyonpro.gwtapp.client.presenter.DashboardPresenter;
import com.halcyonpro.gwtapp.client.presenter.DownloadJsonPresenter;
import com.halcyonpro.gwtapp.client.presenter.FileUploadPresenter;
import com.halcyonpro.gwtapp.client.presenter.ForgotPasswordPresenter;
import com.halcyonpro.gwtapp.client.presenter.ForgotUserNamePresenter;
import com.halcyonpro.gwtapp.client.presenter.GlobalPreferencesPresenter;
import com.halcyonpro.gwtapp.client.presenter.JavaBeanEditorPresenter;
import com.halcyonpro.gwtapp.client.presenter.LoginPresenter;
import com.halcyonpro.gwtapp.client.presenter.MainPresenter;
import com.halcyonpro.gwtapp.client.presenter.ManageUserPresenter;
import com.halcyonpro.gwtapp.client.presenter.MyAccountPresenter;
import com.halcyonpro.gwtapp.client.presenter.Presenter;
import com.halcyonpro.gwtapp.client.presenter.RegistrationPresenter;
import com.halcyonpro.gwtapp.client.presenter.SearchDataPresenter;
import com.halcyonpro.gwtapp.client.presenter.SubscriptionVerificationPresenter;
import com.halcyonpro.gwtapp.client.presenter.ViewPlanPresenter;
import com.halcyonpro.gwtapp.client.presenter.ViewRegistrationPresenter;
import com.halcyonpro.gwtapp.client.view.AdminView;
import com.halcyonpro.gwtapp.client.view.ApplicationConstants;
import com.halcyonpro.gwtapp.client.view.AssignDataToBeanView;
import com.halcyonpro.gwtapp.client.view.BeanFieldsEditorView;
import com.halcyonpro.gwtapp.client.view.BindingsView;
import com.halcyonpro.gwtapp.client.view.CreatePasswordView;
import com.halcyonpro.gwtapp.client.view.DownloadJsonView;
import com.halcyonpro.gwtapp.client.view.FileUploadView;
import com.halcyonpro.gwtapp.client.view.ForgotPasswordView;
import com.halcyonpro.gwtapp.client.view.ForgotUserNameView;
import com.halcyonpro.gwtapp.client.view.GlobalPreferencesView;
import com.halcyonpro.gwtapp.client.view.JavaBeanEditorView;
import com.halcyonpro.gwtapp.client.view.LoginView;
import com.halcyonpro.gwtapp.client.view.MainView;
import com.halcyonpro.gwtapp.client.view.ManageUserView;
import com.halcyonpro.gwtapp.client.view.RegistrationView;
import com.halcyonpro.gwtapp.client.view.SubscriptionVerificationView;
import com.halcyonpro.gwtapp.client.view.CenterPanels.DashboardAccordion;
import com.halcyonpro.gwtapp.client.view.CenterPanels.DashboardView;
import com.halcyonpro.gwtapp.client.view.CenterPanels.SearchDataView;
import com.halcyonpro.gwtapp.client.view.MyDashboard.MyAccountViews.MyAccountView;
import com.halcyonpro.gwtapp.client.view.MyDashboard.MyAccountViews.ViewPlanView;
import com.halcyonpro.gwtapp.client.view.MyDashboard.MyAccountViews.ViewRegistrationView;
import com.halcyonpro.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.halcyonpro.gwtapp.shared.entity.UserEntity;

//This is the main controller of the whole application which manages to navigate from one page to other

public class AppController implements Presenter, ValueChangeHandler<String> {
	private final HandlerManager eventBus;

	private final HelloServiceAsync rpcService; 
	private HasWidgets container;
	private UserEntity loggedInUser;

	private GlobalPreferencesEntity globalPreferencesEntity;
	private String createPasswordtoken ="";
	private String beanName ;
	private String beanType;

	Presenter presenter = null;

	public AppController(HelloServiceAsync rpcService, HandlerManager eventBus) {
		this.eventBus = eventBus;
		this.rpcService = rpcService;


		bind();
	}


	private void bind() {
		History.addValueChangeHandler(this);

		eventBus.addHandler(MainEvent.TYPE,
				new MainEventHandler() {
			public void onMain(MainEvent event) {
				loggedInUser = event.getUser();
				globalPreferencesEntity =event.getGlobalPreferences();
				History.newItem(ApplicationConstants.TOKEN_MAIN);
			}
		}); 

		eventBus.addHandler(EditUserEvent.TYPE,
				new EditUserEventHandler() {
			public void onEditUser(EditUserEvent event) {
				loggedInUser = event.getUser();
				History.newItem(ApplicationConstants.TOKEN_EDIT_USER);
			}
		}); 

		eventBus.addHandler(AssignEditorsEvent.TYPE,
				new AssignEditorsEventHandler() {
			public void onAssignEditors(AssignEditorsEvent event) {
				beanName = event.getJson();
				beanType = event.getBeanType();
				History.newItem(ApplicationConstants.TOKEN_ASSIGN_EDITORS);
			}
		}); 

		eventBus.addHandler(GlobalPreferencesEvent.TYPE,
				new GlobalPreferencesEventHandler() {
			public void onGlobalPreferences(GlobalPreferencesEvent event) {
				History.newItem(ApplicationConstants.TOKEN_GLOBAL_PREFERENCES);
			}
		}); 

		eventBus.addHandler(AdminEvent.TYPE,
				new AdminEventHandler() {
			public void onAdmin(AdminEvent event) {
				History.newItem(ApplicationConstants.TOKEN_ADMIN);
			}
		}); 

		eventBus.addHandler(DashboardEvent.TYPE,
				new DashboardEventHandler() {
			public void onDashboard(DashboardEvent event) {
				//				center = event.getCenter();
				History.newItem(ApplicationConstants.TOKEN_DASHBOARD);
			}
		}); 

		eventBus.addHandler(DashboardAccordionEvent.TYPE,
				new DashboardAccordionEventHandler() {
			public void onDashboardAccordion(DashboardAccordionEvent event) {
				//				center = event.getCenter();
				History.newItem(ApplicationConstants.TOKEN_DASHBOARD_ACCORDION);
			}
		}); 

		eventBus.addHandler(ViewPlanEvent.TYPE,
				new ViewPlanEventHandler() {
			public void onViewPlan(ViewPlanEvent event) {
				History.newItem(ApplicationConstants.TOKEN_VIEW_PLAN);
			}
		}); 

		eventBus.addHandler(ViewEditRegistrationEvent.TYPE,
				new ViewEditRegistrationEventHandler() {
			public void onViewEditRegistration(ViewEditRegistrationEvent event) {
				History.newItem(ApplicationConstants.TOKEN_VIEW_REG);
			}
		}); 



		eventBus.addHandler(SearchDataEvent.TYPE,
				new SearchDataEventHandler() {
			public void onSearchData(SearchDataEvent event) {
				//				center = event.getCenter();
				History.newItem(ApplicationConstants.TOKEN_SEARCHDATA);
			}
		}); 

		eventBus.addHandler(RegistrationEvent.TYPE,
				new RegistrationEventHandler() {
			public void onRegistration(RegistrationEvent event) {
				History.newItem(ApplicationConstants.TOKEN_REGISTRATION);
			}
		}); 

		eventBus.addHandler(SubscriptionVerificationEvent.TYPE,
				new SubscriptionVerificationEventHandler() {
			public void onSubscriptionVerification(SubscriptionVerificationEvent event) {
				History.newItem(ApplicationConstants.TOKEN_SUBSCRIPTION_VERFICATION);
			}
		}); 

		eventBus.addHandler(MyAccountEvent.TYPE,
				new MyAccountEventHandler() {
			public void onMyAccount(MyAccountEvent event) {
				History.newItem(ApplicationConstants.TOKEN_MY_ACCOUNT);
			}
		}); 

		eventBus.addHandler(JavaBeanEditorEvent.TYPE,
				new JavaBeanEditorEventHandler() {
			public void onJavaBeanEditor(JavaBeanEditorEvent event) {
				History.newItem(ApplicationConstants.TOKEN_JAVA_BEAN_EDITOR);
			}
		}); 

		eventBus.addHandler(DynamicBeanEditorEvent.TYPE,
				new DynamicBeanEditorEventHandler() {
			public void onDynamicBeanEditor(DynamicBeanEditorEvent event) {
				History.newItem(ApplicationConstants.TOKEN_DYNAMIC_BEAN_EDITOR);
			}
		}); 
	}

	public void go(final HasWidgets container) {
		this.container = container;


		if ("".equals(History.getToken())) {
			History.newItem(ApplicationConstants.TOKEN_SUBSCRIPTION_VERFICATION);
		}
		else if(History.getToken().startsWith("!")){
			createPasswordtoken = History.getToken().substring(1);
			History.newItem("createPassword");
		}
		else {
			History.fireCurrentHistoryState();
		}
	}



	public void onValueChange(ValueChangeEvent<String> event) {
		String token = event.getValue();

		if (token != null) {
			presenter = null;

			if (token.equals(ApplicationConstants.TOKEN_LOGIN)) {
				presenter = new LoginPresenter(rpcService, eventBus, new LoginView());
				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_MAIN)) {
				presenter = new MainPresenter(rpcService, eventBus, new MainView(loggedInUser));

				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_EDIT_USER)) {
				presenter = new RegistrationPresenter(rpcService, eventBus, new RegistrationView(loggedInUser, globalPreferencesEntity));
				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_DASHBOARD)) {
				presenter = new DashboardPresenter(rpcService, eventBus, new DashboardView());
				if (presenter != null) {
					//					setContainer(center);
					setContainer(container);
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_DASHBOARD_ACCORDION)) {
				presenter = new DashboardAccordionPresenter(rpcService, eventBus, new DashboardAccordion());
				if (presenter != null) {
					//					setContainer(center);
					setContainer(container);
					presenter.go(container);
				}
			}

			//			if (token.equals(ApplicationConstants.TOKEN_DASHBOARD_PORTAL)) {
			//				presenter = new DashboardPortalPresenter(rpcService, eventBus, new DashboardPortalView());
			//				if (presenter != null) {
			////					setContainer(center);
			//					setContainer(container);
			//					presenter.go(container);
			//				}
			//			}

			if (token.equals(ApplicationConstants.TOKEN_SEARCHDATA)) {
				presenter = new SearchDataPresenter(rpcService, eventBus, new SearchDataView());
				if (presenter != null) {
					//					setContainer(center);
					setContainer(container);
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_REGISTRATION)) {
				presenter = new RegistrationPresenter(rpcService, eventBus, new RegistrationView());
				if (presenter != null) {
					setContainer(container);
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_SUBSCRIPTION_VERFICATION)) {
				presenter = new SubscriptionVerificationPresenter(rpcService, eventBus, new SubscriptionVerificationView());
				if (presenter != null) {
					setContainer(container);
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_GLOBAL_PREFERENCES)) {
				presenter = new GlobalPreferencesPresenter(rpcService, eventBus, new GlobalPreferencesView());
				//				presenter = new GlobalPreferencesPresenter(rpcService, eventBus, new GlobalPreferencesXmlView());

				if (presenter != null) {
					setContainer(container);
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_FILE_UPLOAD)) {
				presenter = new FileUploadPresenter(rpcService, eventBus, new FileUploadView());
				if (presenter != null) {
					setContainer(container);
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_MY_ACCOUNT)) {
				presenter = new MyAccountPresenter(rpcService, eventBus, new MyAccountView(), loggedInUser, globalPreferencesEntity);
				if (presenter != null) {
					setContainer(container);
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_VIEW_PLAN)) {
				presenter = new ViewPlanPresenter(rpcService, eventBus, new ViewPlanView(), globalPreferencesEntity, loggedInUser);
				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_VIEW_REG)) {
				presenter = new ViewRegistrationPresenter(rpcService, eventBus, new ViewRegistrationView(), globalPreferencesEntity, loggedInUser);
				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_ADMIN)) {
				presenter = new AdminPresenter(rpcService, eventBus, new AdminView());
				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_FORGOT_PASSWORD)) {
				presenter = new ForgotPasswordPresenter(rpcService, eventBus, new ForgotPasswordView());
				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals("createPassword")) {
				presenter = new CreatePasswordPresenter(rpcService, eventBus, new CreatePasswordView(loggedInUser, createPasswordtoken));

				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_FORGOT_USERNAME)) {
				presenter = new ForgotUserNamePresenter(rpcService, eventBus, new ForgotUserNameView());

				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_MANAGE_USER)) {
				presenter = new ManageUserPresenter(rpcService, eventBus, new ManageUserView());

				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_JAVA_BEAN_EDITOR)) {
				presenter = new JavaBeanEditorPresenter(rpcService, eventBus, new JavaBeanEditorView(ApplicationConstants.JAVA_BEAN));

				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_DYNAMIC_BEAN_EDITOR)) {
				presenter = new JavaBeanEditorPresenter(rpcService, eventBus, new JavaBeanEditorView(ApplicationConstants.DYNAMIC_BEAN));

				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_UPLOAD_COMPONENTS)) {
				presenter = new BeanFieldsEditorPresenter(rpcService, eventBus, new BeanFieldsEditorView(ApplicationConstants.JAVA_BEAN));

				if (presenter != null) {
					presenter.go(container);
				}
			}
			
			if (token.equals(ApplicationConstants.TOKEN_UPLOAD_COMPONENTS_DYNAMICBEAN)) {
				presenter = new BeanFieldsEditorPresenter(rpcService, eventBus, new BeanFieldsEditorView(ApplicationConstants.DYNAMIC_BEAN));

				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_ASSIGN_EDITORS)) {
				presenter = new AssignDataToBeanPresenter(rpcService, eventBus, new AssignDataToBeanView(), beanName, beanType);

				if (presenter != null) {
					presenter.go(container);
				}
			}

			if (token.equals(ApplicationConstants.TOKEN_DOWNLOAD_JSON)) {
				presenter = new DownloadJsonPresenter(rpcService, eventBus, new DownloadJsonView());

				if (presenter != null) {
					presenter.go(container);
				}
			}
			
			if (token.equals(ApplicationConstants.TOKEN_BINDINGS)) {
				presenter = new BindingsPresenter(rpcService, eventBus, new BindingsView());

				if (presenter != null) {
					presenter.go(container);
				}
			}
		}
	} 

	private void setContainer(HasWidgets container) {
		this.container = container;
		this.container.clear();
	}


	@Override
	public void setHandlers() {

	}

}
