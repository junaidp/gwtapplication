package com.mamallan.gwtapp.client;


import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
//import com.helloworld.client.view.CenterPanels.DashboardPortalView;
import com.mamallan.gwtapp.client.event.AdminEvent;
import com.mamallan.gwtapp.client.event.AdminEventHandler;
import com.mamallan.gwtapp.client.event.AssignEditorsEvent;
import com.mamallan.gwtapp.client.event.AssignEditorsEventHandler;
import com.mamallan.gwtapp.client.event.DashboardAccordionEvent;
import com.mamallan.gwtapp.client.event.DashboardAccordionEventHandler;
import com.mamallan.gwtapp.client.event.DashboardEvent;
import com.mamallan.gwtapp.client.event.DashboardEventHandler;
import com.mamallan.gwtapp.client.event.DynamicBeanEditorEvent;
import com.mamallan.gwtapp.client.event.DynamicBeanEditorEventHandler;
import com.mamallan.gwtapp.client.event.EditUserEvent;
import com.mamallan.gwtapp.client.event.EditUserEventHandler;
import com.mamallan.gwtapp.client.event.GlobalPreferencesEvent;
import com.mamallan.gwtapp.client.event.GlobalPreferencesEventHandler;
import com.mamallan.gwtapp.client.event.JavaBeanEditorEvent;
import com.mamallan.gwtapp.client.event.JavaBeanEditorEventHandler;
import com.mamallan.gwtapp.client.event.MainEvent;
import com.mamallan.gwtapp.client.event.MainEventHandler;
import com.mamallan.gwtapp.client.event.MyAccountEvent;
import com.mamallan.gwtapp.client.event.MyAccountEventHandler;
import com.mamallan.gwtapp.client.event.RegistrationEvent;
import com.mamallan.gwtapp.client.event.RegistrationEventHandler;
import com.mamallan.gwtapp.client.event.SearchDataEvent;
import com.mamallan.gwtapp.client.event.SearchDataEventHandler;
import com.mamallan.gwtapp.client.event.SubscriptionVerificationEvent;
import com.mamallan.gwtapp.client.event.SubscriptionVerificationEventHandler;
import com.mamallan.gwtapp.client.event.ViewEditRegistrationEvent;
import com.mamallan.gwtapp.client.event.ViewEditRegistrationEventHandler;
import com.mamallan.gwtapp.client.event.ViewPlanEvent;
import com.mamallan.gwtapp.client.event.ViewPlanEventHandler;
import com.mamallan.gwtapp.client.presenter.AdminPresenter;
import com.mamallan.gwtapp.client.presenter.AssignDataToBeanPresenter;
import com.mamallan.gwtapp.client.presenter.BeanFieldsEditorPresenter;
import com.mamallan.gwtapp.client.presenter.BindingsPresenter;
import com.mamallan.gwtapp.client.presenter.CreatePasswordPresenter;
import com.mamallan.gwtapp.client.presenter.DashboardAccordionPresenter;
import com.mamallan.gwtapp.client.presenter.DashboardPresenter;
import com.mamallan.gwtapp.client.presenter.DownloadJsonPresenter;
import com.mamallan.gwtapp.client.presenter.FileUploadPresenter;
import com.mamallan.gwtapp.client.presenter.ForgotPasswordPresenter;
import com.mamallan.gwtapp.client.presenter.ForgotUserNamePresenter;
import com.mamallan.gwtapp.client.presenter.GlobalPreferencesPresenter;
import com.mamallan.gwtapp.client.presenter.JavaBeanEditorPresenter;
import com.mamallan.gwtapp.client.presenter.LoginPresenter;
import com.mamallan.gwtapp.client.presenter.MainPresenter;
import com.mamallan.gwtapp.client.presenter.ManageUserPresenter;
import com.mamallan.gwtapp.client.presenter.MyAccountPresenter;
import com.mamallan.gwtapp.client.presenter.Presenter;
import com.mamallan.gwtapp.client.presenter.RegistrationPresenter;
import com.mamallan.gwtapp.client.presenter.SearchDataPresenter;
import com.mamallan.gwtapp.client.presenter.SubscriptionVerificationPresenter;
import com.mamallan.gwtapp.client.presenter.ViewPlanPresenter;
import com.mamallan.gwtapp.client.presenter.ViewRegistrationPresenter;
import com.mamallan.gwtapp.client.view.AdminView;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.client.view.AssignDataToBeanView;
import com.mamallan.gwtapp.client.view.BeanFieldsEditorView;
import com.mamallan.gwtapp.client.view.BindingsView;
import com.mamallan.gwtapp.client.view.CreatePasswordView;
import com.mamallan.gwtapp.client.view.DownloadJsonView;
import com.mamallan.gwtapp.client.view.FileUploadView;
import com.mamallan.gwtapp.client.view.ForgotPasswordView;
import com.mamallan.gwtapp.client.view.ForgotUserNameView;
import com.mamallan.gwtapp.client.view.GlobalPreferencesView;
import com.mamallan.gwtapp.client.view.JavaBeanEditorView;
import com.mamallan.gwtapp.client.view.LoginView;
import com.mamallan.gwtapp.client.view.MainView;
import com.mamallan.gwtapp.client.view.ManageUserView;
import com.mamallan.gwtapp.client.view.RegistrationView;
import com.mamallan.gwtapp.client.view.SubscriptionVerificationView;
import com.mamallan.gwtapp.client.view.CenterPanels.DashboardAccordion;
import com.mamallan.gwtapp.client.view.CenterPanels.DashboardView;
import com.mamallan.gwtapp.client.view.CenterPanels.SearchDataView;
import com.mamallan.gwtapp.client.view.MyDashboard.MyAccountViews.MyAccountView;
import com.mamallan.gwtapp.client.view.MyDashboard.MyAccountViews.ViewPlanView;
import com.mamallan.gwtapp.client.view.MyDashboard.MyAccountViews.ViewRegistrationView;
import com.mamallan.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.mamallan.gwtapp.shared.entity.UserEntity;



public class AppController implements Presenter, ValueChangeHandler<String> {
	private final HandlerManager eventBus;

	private final HelloServiceAsync rpcService; 
	private HasWidgets container;
	//	private VerticalPanel center;
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
