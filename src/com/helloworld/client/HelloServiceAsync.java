package com.helloworld.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.helloworld.shared.entity.User;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface HelloServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
	void addUser(User user, AsyncCallback<String> callback);
	void verifyCaptcha(String challenge, String response, AsyncCallback<Boolean> callback);
	void verifySubscription(String email, AsyncCallback<Boolean> callback);
	void signIn(String userName, String password, AsyncCallback<User> callback);
	void editUser(User user, AsyncCallback<String> callback);
	void readUploadedFiles( AsyncCallback<ArrayList<String>> callback);

}
