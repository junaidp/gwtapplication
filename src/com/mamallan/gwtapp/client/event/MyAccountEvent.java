package com.mamallan.gwtapp.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class MyAccountEvent extends GwtEvent<MyAccountEventHandler> {

	public static Type<MyAccountEventHandler> TYPE = new Type<MyAccountEventHandler>();

	public MyAccountEvent(){

	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<MyAccountEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(MyAccountEventHandler handler) {
		handler.onMyAccount(this);

	}
}


