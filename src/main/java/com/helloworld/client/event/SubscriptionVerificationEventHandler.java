package com.helloworld.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface SubscriptionVerificationEventHandler extends EventHandler {
	void onSubscriptionVerification(SubscriptionVerificationEvent event);
}
