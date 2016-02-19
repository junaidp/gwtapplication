package com.mamallan.gwtapp.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class RegistrationEvent extends GwtEvent<RegistrationEventHandler> {

	public static Type<RegistrationEventHandler> TYPE = new Type<RegistrationEventHandler>();


	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<RegistrationEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(RegistrationEventHandler handler) {
		handler.onRegistration(this);

	}

}


