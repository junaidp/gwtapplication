package com.helloworld.server;

import java.io.File;
import java.util.ArrayList;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.servlet.http.HttpSession;

import com.helloworld.client.HelloService;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.client.view.ReadGlobalPreferencesXml;
import com.helloworld.database.MyRdbHelper;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.UserEntity;
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
	HttpSession session ;

	@Override
	public String addUser(UserEntity user) throws Exception {

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
	public UserEntity signIn(String userName, String password)
			throws Exception {
		UserEntity user =  rdbHelper.signIn(userName, password);
		if(user!=null)
		{
			session=getThreadLocalRequest().getSession(true);
			session.setAttribute("userId", user.getUserId());
		}
		return user;
	}

	@Override
	public String editUser(UserEntity user) throws Exception {
		return rdbHelper.addUser(user);
	}

	public ArrayList<String> readUploadedFiles(){
		String root = getServletContext().getRealPath("/");
		ArrayList<String> fileNames = new ArrayList<String>();
		File folder = new File(root + "/fileuploads");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			fileNames.add(listOfFiles[i].getName());
		}
		return fileNames;
	}

	public String fetchLogo(){
		String root = getServletContext().getRealPath("/");
		//		File folder = new File(root + "/users"+"/"+userId+"/logo");
		File folder = new File(root + "/logo");
		String logoUrl = "";
		File[] logos = folder.listFiles();
		if(logos!=null){
			for (int i = 0; i < logos.length; i++) {
				logoUrl = "/logo"+"/"+logos[0].getName();
			}
		}
		return logoUrl;

	}

	@Override
	public GlobalPreferencesEntity fetchGlobalPreferences() throws Exception {
		return rdbHelper.fetchGlobalPreferences();
	}
	
	@Override
	public String updateGlobalPreferences(
			GlobalPreferencesEntity globalPreferencesEntity) throws Exception {
		return rdbHelper.updateGlobalPreferences(globalPreferencesEntity);
	}

	@Override
	public String updateMyAccount(MyAccountEntity myAccountEntity)
			throws Exception {
		return rdbHelper.updateMyAccount(myAccountEntity);
	}

	@Override
	public String logOut() throws Exception {
		session=getThreadLocalRequest().getSession(true);
		session.invalidate();
		return "loggedOut";
	}

	@Override
	public String fetchUserStatus(String userName) throws Exception {
		return rdbHelper.fetchUserStatus(userName);
	}

	@Override
	public String inactivateAccount(String userName) throws Exception {
		return rdbHelper.inactivateAccount(userName);
	}

	@Override
	public String sendActivationEmailForgotPassword(String userName)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLoggedInWithin20Mins(UserEntity user) throws Exception {
		return rdbHelper.isLoggedInWithin20Mins(user);
	}

	@Override
	public UserEntity fetchNewUser(String passwordToken) throws Exception {
		return rdbHelper.fetchNewUser(passwordToken);
	}

	@Override
	public String updatePassword(UserEntity user) throws Exception {
		return rdbHelper.updatePassword(user);
	}

	@Override
	public String emailUserName(String email) throws Exception {
		return rdbHelper.emailUserName(email);
	}


}
