package com.helloworld.server;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.helloworld.client.HelloService;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.database.MyRdbHelper;
import com.helloworld.shared.entity.User;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import net.tanesha.recaptcha.ReCaptcha;
import net.tanesha.recaptcha.ReCaptchaFactory;

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
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	MyRdbHelper rdbHelper = (MyRdbHelper) ctx.getBean("ManagerApp");

	@Override
	public String addUser(User user) throws Exception {
		
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

	@Override
	public boolean verifyCaptcha(String challenge, String response)
			throws Exception {
		ReCaptcha r = ReCaptchaFactory.newReCaptcha("6LcEKg4TAAAAAFADmX5mrhcKkaeNMcxh7k5CiQ2K",
				"6LcEKg4TAAAAAPXmd7B6Oskr8N2ywB-4ufp4Hnx5", true);
		boolean result =  r.checkAnswer(
				getThreadLocalRequest().getRemoteAddr().toString(), challenge,
				response).isValid();
		return result;
	}

	@Override
	public boolean verifySubscription(String email) throws Exception {
		
		return rdbHelper.verifySubscription(email);
	}

	@Override
	public User signIn(String userName, String password)
			throws Exception {
		return rdbHelper.signIn(userName, password);
	}

	@Override
	public String editUser(User user) throws Exception {
		return rdbHelper.addUser(user);
	}
	

}
