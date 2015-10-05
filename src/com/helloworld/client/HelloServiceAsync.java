package com.helloworld.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.helloworld.shared.entity.User;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface HelloServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
	void addUser(User user, AsyncCallback<String> callback);
	
}
