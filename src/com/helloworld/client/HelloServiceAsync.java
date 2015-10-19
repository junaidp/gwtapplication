package com.helloworld.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.UserEntity;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface HelloServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
	void addUser(UserEntity user, AsyncCallback<String> callback);
	void verifyCaptcha(String challenge, String response, AsyncCallback<Boolean> callback);
	void verifySubscription(String email, AsyncCallback<Boolean> callback);
	void signIn(String userName, String password, AsyncCallback<UserEntity> callback);
	void editUser(UserEntity user, AsyncCallback<String> callback);
	void readUploadedFiles( AsyncCallback<ArrayList<String>> callback);
	void fetchLogo(AsyncCallback<String> callback);
	void fetchGlobalPreferences(AsyncCallback<GlobalPreferencesEntity> callback);
	void updateGlobalPreferences(GlobalPreferencesEntity globalPreferencesEntity, AsyncCallback<String> callback);
	void updateMyAccount(MyAccountEntity myAccountEntity, AsyncCallback<String> callback);
}
