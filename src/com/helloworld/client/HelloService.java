package com.helloworld.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.helloworld.shared.entity.User;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface HelloService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
	String addUser(User user) throws Exception;
	boolean verifyCaptcha(String challenge, String response)throws Exception;
	boolean verifySubscription(String email) throws Exception;
	User signIn(String userName, String password) throws Exception;
	String editUser(User user) throws Exception;
	ArrayList<String> readUploadedFiles() throws Exception;
	String fetchUsersLogo(int userId) throws Exception;

}
