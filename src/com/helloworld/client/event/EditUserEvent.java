package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.helloworld.shared.entity.UserEntity;

public class EditUserEvent extends GwtEvent<EditUserEventHandler> {

	public static Type<EditUserEventHandler> TYPE = new Type<EditUserEventHandler>();
	UserEntity user ;

	public EditUserEvent(UserEntity loggedInUser) {
		this.user = loggedInUser;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<EditUserEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(EditUserEventHandler handler) {
		handler.onEditUser(this);
	}

	public UserEntity getUser() {
		return user;
	}
}


