package com.mamallan.gwtapp.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class GlobalPreferencesEvent extends GwtEvent<GlobalPreferencesEventHandler> {

	public static Type<GlobalPreferencesEventHandler> TYPE = new Type<GlobalPreferencesEventHandler>();

	public GlobalPreferencesEvent() {

	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<GlobalPreferencesEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GlobalPreferencesEventHandler handler) {
		handler.onGlobalPreferences(this);

	}

}


