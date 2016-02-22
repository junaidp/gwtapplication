package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.helloworld.shared.entity.UserEntity;

public class ViewEditRegistrationEvent extends GwtEvent<ViewEditRegistrationEventHandler> {

	public static Type<ViewEditRegistrationEventHandler> TYPE = new Type<ViewEditRegistrationEventHandler>();
	private UserEntity user;


	public ViewEditRegistrationEvent(UserEntity user) {
		this.user = user;

	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<ViewEditRegistrationEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ViewEditRegistrationEventHandler handler) {
		handler.onViewEditRegistration(this);

	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
}


