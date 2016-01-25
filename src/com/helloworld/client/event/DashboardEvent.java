package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class DashboardEvent extends GwtEvent<DashboardEventHandler> {

	public static Type<DashboardEventHandler> TYPE = new Type<DashboardEventHandler>();

	public DashboardEvent(){

	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<DashboardEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(DashboardEventHandler handler) {
		handler.onDashboard(this);

	}
}


