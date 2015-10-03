package com.helloworld.client;


import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.helloworld.client.event.DashboardEvent;
import com.helloworld.client.event.DashboardEventHandler;
import com.helloworld.client.event.MainEvent;
import com.helloworld.client.event.MainEventHandler;
import com.helloworld.client.event.SearchDataEvent;
import com.helloworld.client.event.SearchDataEventHandler;
import com.helloworld.client.presenter.DashboardPresenter;
import com.helloworld.client.presenter.LoginPresenter;
import com.helloworld.client.presenter.MainPresenter;
import com.helloworld.client.presenter.Presenter;
import com.helloworld.client.presenter.SearchDataPresenter;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.DashboardView;
import com.helloworld.client.view.LoginView;
import com.helloworld.client.view.MainView;
import com.helloworld.client.view.CenterPanels.SearchDataView;


public class AppController implements Presenter, ValueChangeHandler<String> {
	private final HandlerManager eventBus;

	private final HelloServiceAsync rpcService; 
	private HasWidgets container;
	private VerticalPanel center;

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

				History.newItem(ApplicationConstants.TOKEN_MAIN);
			}
		}); 
		
		eventBus.addHandler(DashboardEvent.TYPE,
				new DashboardEventHandler() {
			public void onDashboard(DashboardEvent event) {
				center = event.getCenter();
				History.newItem(ApplicationConstants.TOKEN_DASHBOARD);
			}
		}); 
		
		eventBus.addHandler(SearchDataEvent.TYPE,
				new SearchDataEventHandler() {
			public void onSearchData(SearchDataEvent event) {
				center = event.getCenter();
				History.newItem(ApplicationConstants.TOKEN_SEARCHDATA);
			}
		}); 
	}

	public void go(final HasWidgets container) {
		this.container = container;

		if ("".equals(History.getToken())) {
			History.newItem(ApplicationConstants.TOKEN_LOGIN);
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
				presenter = new MainPresenter(rpcService, eventBus, new MainView());
				if (presenter != null) {
					presenter.go(container);
				}
			}
			
			if (token.equals(ApplicationConstants.TOKEN_DASHBOARD)) {
				presenter = new DashboardPresenter(rpcService, eventBus, new DashboardView());
				if (presenter != null) {
					setContainer(center);
					presenter.go(container);
				}
			}
			
			if (token.equals(ApplicationConstants.TOKEN_SEARCHDATA)) {
				presenter = new SearchDataPresenter(rpcService, eventBus, new SearchDataView());
				if (presenter != null) {
					setContainer(center);
					presenter.go(container);
				}
			}
		}
	} 
	
	private void setContainer(HasWidgets container) {
		this.container = container;
		this.container.clear();
	}

}
