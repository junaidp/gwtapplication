package com.helloworld.client;


import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.helloworld.client.event.DashboardAccordionEvent;
import com.helloworld.client.event.DashboardAccordionEventHandler;
import com.helloworld.client.event.DashboardEvent;
import com.helloworld.client.event.DashboardEventHandler;
import com.helloworld.client.event.EditUserEvent;
import com.helloworld.client.event.EditUserEventHandler;
import com.helloworld.client.event.GlobalPreferencesEvent;
import com.helloworld.client.event.GlobalPreferencesEventHandler;
import com.helloworld.client.event.MainEvent;
import com.helloworld.client.event.MainEventHandler;
import com.helloworld.client.event.MyAccountEvent;
import com.helloworld.client.event.MyAccountEventHandler;
import com.helloworld.client.event.RegistrationEvent;
import com.helloworld.client.event.RegistrationEventHandler;
import com.helloworld.client.event.SearchDataEvent;
import com.helloworld.client.event.SearchDataEventHandler;
import com.helloworld.client.event.SubscriptionVerificationEvent;
import com.helloworld.client.event.SubscriptionVerificationEventHandler;
import com.helloworld.client.event.ViewPlanEvent;
import com.helloworld.client.event.ViewPlanEventHandler;
import com.helloworld.client.presenter.DashboardAccordionPresenter;
import com.helloworld.client.presenter.DashboardPortalPresenter;
import com.helloworld.client.presenter.DashboardPresenter;
import com.helloworld.client.presenter.FileUploadPresenter;
import com.helloworld.client.presenter.FooterPresenter;
import com.helloworld.client.presenter.GlobalPreferencesPresenter;
import com.helloworld.client.presenter.HeaderPresenter;
import com.helloworld.client.presenter.LoginPresenter;
import com.helloworld.client.presenter.MainPresenter;
import com.helloworld.client.presenter.MyAccountPresenter;
import com.helloworld.client.presenter.Presenter;
import com.helloworld.client.presenter.RegistrationPresenter;
import com.helloworld.client.presenter.SearchDataPresenter;
import com.helloworld.client.presenter.SubscriptionVerificationPresenter;
import com.helloworld.client.presenter.ViewPlanPresenter;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.FileUploadView;
import com.helloworld.client.view.FooterView;
import com.helloworld.client.view.GlobalPreferencesView;
import com.helloworld.client.view.HeaderView;
import com.helloworld.client.view.LoginView;
import com.helloworld.client.view.MainView;
import com.helloworld.client.view.RegistrationView;
import com.helloworld.client.view.SubscriptionVerificationView;
import com.helloworld.client.view.CenterPanels.DashboardAccordion;
import com.helloworld.client.view.CenterPanels.DashboardPortalView;
import com.helloworld.client.view.CenterPanels.DashboardView;
import com.helloworld.client.view.CenterPanels.SearchDataView;
import com.helloworld.client.view.MyDashboard.MyAccountViews.MyAccountView;
import com.helloworld.client.view.MyDashboard.MyAccountViews.ViewPlanView;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.UserEntity;


public class AppController implements Presenter, ValueChangeHandler<String> {
	private final HandlerManager eventBus;

	private final HelloServiceAsync rpcService; 
	private HasWidgets container;
	private VerticalPanel center;
	private UserEntity loggedInUser;
	private HeaderPresenter headerPresenter;
	private GlobalPreferencesEntity globalPreferencesEntity;
	
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
		
		eventBus.addHandler(GlobalPreferencesEvent.TYPE,
				new GlobalPreferencesEventHandler() {
			public void onGlobalPreferences(GlobalPreferencesEvent event) {
				loggedInUser = event.getUser();
				History.newItem(ApplicationConstants.TOKEN_GLOBAL_PREFERENCES);
			}
		}); 
		
		eventBus.addHandler(DashboardEvent.TYPE,
				new DashboardEventHandler() {
			public void onDashboard(DashboardEvent event) {
				center = event.getCenter();
				History.newItem(ApplicationConstants.TOKEN_DASHBOARD);
			}
		}); 
		
		eventBus.addHandler(DashboardAccordionEvent.TYPE,
				new DashboardAccordionEventHandler() {
			public void onDashboardAccordion(DashboardAccordionEvent event) {
				center = event.getCenter();
				History.newItem(ApplicationConstants.TOKEN_DASHBOARD_ACCORDION);
			}
		}); 
		
		eventBus.addHandler(ViewPlanEvent.TYPE,
				new ViewPlanEventHandler() {
			public void onViewPlan(ViewPlanEvent event) {
				History.newItem(ApplicationConstants.TOKEN_VIEW_PLAN);
			}
		}); 
		
		
		
		eventBus.addHandler(SearchDataEvent.TYPE,
				new SearchDataEventHandler() {
			public void onSearchData(SearchDataEvent event) {
				center = event.getCenter();
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
	}

	public void go(final HasWidgets container) {
		this.container = container;
		setHeader();
		setFooter();

		if ("".equals(History.getToken())) {
			History.newItem(ApplicationConstants.TOKEN_SUBSCRIPTION_VERFICATION);
		}
		else {
			History.fireCurrentHistoryState();
		}
	}
	
	private void setFooter() {
		FooterView footerView = new FooterView();
		Presenter presenter = new FooterPresenter(rpcService, eventBus, footerView, globalPreferencesEntity);
		HasWidgets container = RootPanel.get("footerContainer");
		container.clear();
		presenter.go(container);
	}

	private void setHeader() {
		HeaderView headerView = new HeaderView();
		headerPresenter = new HeaderPresenter(rpcService, eventBus, headerView);
		HasWidgets container = RootPanel.get("headerContainer");
		container.clear();
		headerPresenter.go(container);
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
				headerPresenter.setUser(loggedInUser);
				if (presenter != null) {
					presenter.go(container);
				}
			}
			
			if (token.equals(ApplicationConstants.TOKEN_EDIT_USER)) {
				presenter = new RegistrationPresenter(rpcService, eventBus, new RegistrationView(loggedInUser));
				if (presenter != null) {
					presenter.go(container);
				}
			}
			
			if (token.equals(ApplicationConstants.TOKEN_DASHBOARD)) {
				presenter = new DashboardPresenter(rpcService, eventBus, new DashboardView());
				if (presenter != null) {
//					setContainer(center);
					presenter.go(container);
				}
			}
			
			if (token.equals(ApplicationConstants.TOKEN_DASHBOARD_ACCORDION)) {
				presenter = new DashboardAccordionPresenter(rpcService, eventBus, new DashboardAccordion());
				if (presenter != null) {
//					setContainer(center);
					presenter.go(container);
				}
			}
			
			if (token.equals(ApplicationConstants.TOKEN_DASHBOARD_PORTAL)) {
				presenter = new DashboardPortalPresenter(rpcService, eventBus, new DashboardPortalView());
				if (presenter != null) {
//					setContainer(center);
					presenter.go(container);
				}
			}
			
			if (token.equals(ApplicationConstants.TOKEN_SEARCHDATA)) {
				presenter = new SearchDataPresenter(rpcService, eventBus, new SearchDataView());
				if (presenter != null) {
//					setContainer(center);
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
				presenter = new MyAccountPresenter(rpcService, eventBus, new MyAccountView(), loggedInUser);
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
		}
	} 
	
	private void setContainer(HasWidgets container) {
		this.container = container;
		this.container.clear();
	}


	@Override
	public void setHandlers() {
		// TODO Auto-generated method stub
		
	}

}
