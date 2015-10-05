package com.helloworld.server;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.helloworld.client.HelloService;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.database.MyRdbHelper;
import com.helloworld.shared.entity.User;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class HelloServiceImpl extends RemoteServiceServlet implements
HelloService {

	public String greetServer(String input) throws IllegalArgumentException {
		return "";
	}

	@Override
	public String addUser(User user) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MyRdbHelper rdbHelper = (MyRdbHelper) ctx.getBean("ManagerApp");
		if(isValidEmailAddress(user.getEmail())){
			return rdbHelper.addUser(user);
		}else{
			return ApplicationConstants.INVALID_EMAIL;
		}
	}

	public static boolean isValidEmailAddress(String email) {
		boolean result = true;
		try {
			InternetAddress emailAddr = new InternetAddress(email);
			emailAddr.validate();
		} catch (AddressException ex) {
			result = false;
		}
		return result;
	}
}
