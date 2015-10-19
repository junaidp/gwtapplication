package com.helloworld.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.UserEntity;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface HelloService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
	String addUser(UserEntity user) throws Exception;
	boolean verifyCaptcha(String challenge, String response)throws Exception;
	boolean verifySubscription(String email) throws Exception;
	UserEntity signIn(String userName, String password) throws Exception;
	String editUser(UserEntity user) throws Exception;
	ArrayList<String> readUploadedFiles() throws Exception;
	String fetchLogo() throws Exception;
	GlobalPreferencesEntity fetchGlobalPreferences() throws Exception;
	String updateGlobalPreferences(GlobalPreferencesEntity globalPreferencesEntity) throws Exception;
	String updateMyAccount (MyAccountEntity myAccountEntity)throws Exception;
}
