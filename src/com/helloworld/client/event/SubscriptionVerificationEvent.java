package com.helloworld.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class SubscriptionVerificationEvent extends GwtEvent<SubscriptionVerificationEventHandler> {

	public static Type<SubscriptionVerificationEventHandler> TYPE = new Type<SubscriptionVerificationEventHandler>();

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<SubscriptionVerificationEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SubscriptionVerificationEventHandler handler) {
		handler.onSubscriptionVerification(this);

	}

}


