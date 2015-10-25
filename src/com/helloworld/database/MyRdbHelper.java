package com.helloworld.database;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.mindrot.BCrypt;

import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.UserEntity;

public class MyRdbHelper {

	private SessionFactory sessionFactory;
	Logger logger;
	private static int workload = 12;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public String addUser(UserEntity user) throws Exception {
		Session session = null;
		try{
			session = sessionFactory.openSession();

			boolean existingUser = true;
			if(user.getUserId()== 0){
				existingUser = false;
			}
			String generatedPassword = user.getPassword();

			if(userNameAlreadyExist(session, user.getUserName(), user.getUserId())){
				return ApplicationConstants.USERNAME_NOT_AVAILABLE;
			}
			if(emailAlreadyExist(session, user.getEmail(),  user.getUserId())){
				return ApplicationConstants.EMAIL_NOT_AVAILABLE;
			}

			if(! existingUser){
				String password = createBCrypt(user.getPassword());
				user.setPassword(password);
			}
			user.setTokenGeneratedDate(new Date());
			user.setToken(generatedPassword);
			
			session.saveOrUpdate(user.getMyAccountId());
			session.saveOrUpdate(user);
			session.flush();
			if(existingUser){
				return ApplicationConstants.USER_UPDATED;
			}else{
				return ApplicationConstants.USER_ADDED;
			}

		}
		catch(Exception ex){
			logger.warn(String.format("Exception occured in adduser", ex.getMessage()), ex);
			System.out.println("Exception occured in adduser"+ ex.getMessage());
			throw new Exception("Exception occured in adduser");
		}
		finally{
			session.close();
		}
	}

	public String createBCrypt(String password){

		String hash = bCrypt(password);
		return hash;
	}

	public static String bCrypt(String password_plaintext) {
		String salt = BCrypt.gensalt(workload);
		String hashed_password = BCrypt.hashpw(password_plaintext, salt);

		return(hashed_password);
	}


	public static boolean checkPassword(String password_plaintext, String stored_hash) {
		boolean password_verified = false;

		if(null == stored_hash)
			throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");

		password_verified = BCrypt.checkpw(password_plaintext, stored_hash);

		return(password_verified);
	}

	public boolean userNameAlreadyExist(Session session, String userName, int userId)throws Exception{

		try{
			Criteria crit = session.createCriteria(UserEntity.class);
			crit.add(Restrictions.eq("userName", userName));
			crit.add(Restrictions.ne("userId", userId));
			if(crit.list().size()>0){
				return true;
			}else{
				return false;
			}
		}	catch(Exception ex){
			logger.warn(String.format("Exception occured in userNameAlreadyExist", ex.getMessage()), ex);
			System.out.println("Exception occured in userNameAlreadyExist"+ ex.getMessage());
			throw new Exception("Exception occured in userNameAlreadyExist");
		}

	}

	public boolean emailAlreadyExist(Session session, String email, int userId)throws Exception{
		try{
			Criteria crit = session.createCriteria(UserEntity.class);
			crit.add(Restrictions.eq("email", email));
			crit.add(Restrictions.ne("userId", userId));
			if(crit.list().size()>0){
				return true;
			}else{
				return false;
			}
		}	catch(Exception ex){
			logger.warn(String.format("Exception occured in emailAlreadyExist", ex.getMessage()), ex);
			System.out.println("Exception occured in emailAlreadyExist"+ ex.getMessage());
			throw new Exception("Exception occured in emailAlreadyExist");
		}
	}


	public boolean verifySubscription(String email)throws Exception {
		Session session = null;
		try{
			session = sessionFactory.openSession();
			Criteria crit = session.createCriteria(UserEntity.class);
			crit.add(Restrictions.eq("email", email));
			if(crit.list().size()>0){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception ex){
			logger.warn(String.format("Exception occured in verifySubscription", ex.getMessage()), ex);
			System.out.println("Exception occured in verifySubscription"+ ex.getMessage());
			throw new Exception("Exception occured in verifySubscription");
		}
	}


	public UserEntity signIn(String userName, String password) throws Exception{
		Session session = null;
		UserEntity user = null;
		try{
			session = sessionFactory.openSession();
			Criteria crit = session.createCriteria(UserEntity.class);
			crit.add(Restrictions.eq("userName", userName));
			crit.createAlias("myAccountId", "myAccount");
			if(crit.list().size()>0){
				user = (UserEntity) crit.list().get(0);
				if(checkPassword(password, user.getPassword())){
					System.out.println("User LoggedIn "+ user.getName());
					return user;
				}else{
					System.out.println("User Login Attemt failed "+ user.getName());
					return null;
				}
			}else{
				return null;
			}
		}catch(Exception ex){
			logger.warn(String.format("Exception occured in signIn", ex.getMessage()), ex);
			System.out.println("Exception occured in signIn"+ ex.getMessage());
			throw new Exception("Exception occured in signIn");
		}
	}


	public GlobalPreferencesEntity fetchGlobalPreferences()throws Exception {
		Session session = null;
		try{
			session = sessionFactory.openSession();
			Criteria crit = session.createCriteria(GlobalPreferencesEntity.class);
			crit.createAlias("myAccountPreferencesId", "myAccountPreferences");
			if(crit.list().size()>0){
				GlobalPreferencesEntity globalPreferencesEntity = (GlobalPreferencesEntity) crit.list().get(0);
				return globalPreferencesEntity;
			}
			else {
				return null;
			}
		}catch(Exception ex){
			logger.warn(String.format("Exception occured in fetchGlobalPreferences", ex.getMessage()), ex);
			System.out.println("Exception occured in fetchGlobalPreferences"+ ex.getMessage());
			throw new Exception("Exception occured in fetchGlobalPreferences");
		}
	}


	public String updateGlobalPreferences(
			GlobalPreferencesEntity globalPreferencesEntity)throws Exception {
		Session session = null;
		try{
			session = sessionFactory.openSession();
			session.saveOrUpdate(globalPreferencesEntity.getMyAccountPreferencesId());
			session.saveOrUpdate(globalPreferencesEntity);
			session.flush();
			return ApplicationConstants.GLOBALPREFERENCESUPDATED;
		}catch(Exception ex){
			logger.warn(String.format("Exception occured in updateGlobalPreferences", ex.getMessage()), ex);
			System.out.println("Exception occured in updateGlobalPreferences"+ ex.getMessage());
			throw new Exception("Exception occured in updateGlobalPreferences");
		}
	}


	public String updateMyAccount(MyAccountEntity myAccountEntity)throws Exception {
		Session session = null;
		try{
			session = sessionFactory.openSession();
			session.update(myAccountEntity);
			session.flush();
			return ApplicationConstants.MY_ACCOUNT_UPDATED;
		}catch(Exception ex){
			logger.warn(String.format("Exception occured in updateGlobalPreferences", ex.getMessage()), ex);
			System.out.println("Exception occured in updateGlobalPreferences"+ ex.getMessage());
			throw new Exception("Exception occured in updateGlobalPreferences");
		}
	}

	public String inactivateAccount(String username) throws Exception{

		Session session = null;
		try{
			session = sessionFactory.openSession();
			Criteria crit = session.createCriteria(UserEntity.class);
			crit.add(Restrictions.eq("userName", username));
			if(crit.list().size()>0){
				Transaction tr = session.beginTransaction();
				UserEntity user = (UserEntity) crit.list().get(0);
				user.setStatus(ApplicationConstants.BLOCK);
				session.update(user);
				tr.commit();
				return ApplicationConstants.ACCOUNT_INACTIVATED;
			}
			return ApplicationConstants.USER_NOT_FOUND;
		}catch(Exception ex){
			logger.warn(String.format("Exception occured in inactivateAccount", ex.getMessage()), ex);
			throw new Exception("Exception occured in inactivateAccount");
		}
		finally{
			session.close();
		}

	}

	public UserEntity fetchUser(String username) throws Exception{

		Session session = null;
		try{
			session = sessionFactory.openSession();
			Criteria crit = session.createCriteria(UserEntity.class);
			crit.add(Restrictions.eq("userName", username));
			if(crit.list().size()>0){
				UserEntity user = (UserEntity) crit.list().get(0);

				return user;
			}
			return null;
		}catch(Exception ex){
			logger.warn(String.format("Exception occured in fetchUser", ex.getMessage()), ex);
			throw new Exception("Exception occured in fetchUser");
		}
		finally{
			session.close();
		}

	}

	public String fetchUserStatus(String username)throws Exception {
		Session session = null;
		int status = 0;
		try{
			session = sessionFactory.openSession();
			Criteria crit = session.createCriteria(UserEntity.class);
			crit.add(Restrictions.eq("userName", username));
			if(crit.list().size()>0){
				UserEntity user = (UserEntity) crit.list().get(0);
				status = user.getStatus();
				if(status==1){
					sendActivationEmailForgotPassword(username);
				}
			}
		}catch(Exception ex){
			logger.warn(String.format("Exception occured in fetchUserStatus", ex.getLocalizedMessage()), ex);
			logger.info(String.format("Exception occured in fetchUserStatus", ex.getLocalizedMessage()), ex);
			System.out.println(ex.getLocalizedMessage());
		}
		finally{
			session.close();
		}
		if(status != 1){
			return ApplicationConstants.CONTACT_ADMIN;
		}
		else{
			return sendActivationEmailForgotPassword(username);
			
		}
	}

	public String sendActivationEmailForgotPassword(String username) throws Exception {

		UserEntity user = fetchUser(username);
		if(user ==null){
			return ApplicationConstants.USER_NOT_FOUND;
		}
		else{
			Session session = sessionFactory.openSession();
			Criteria crit = session.createCriteria(UserEntity.class);
			crit.add(Restrictions.eq("userName", username));

			if(crit.list().size() > 0){
				user = (UserEntity) crit.list().get(0);
				Transaction tr = session.beginTransaction();
				user.setTokenGeneratedDate(new Date());
				session.update(user);
				tr.commit();
				sendEmailForgotPassword(user);
			}else{
				return "The answer you have enterted does not match the answer you submitted at <br>" +
						"the time of creating the password. Please try again ";
			}
			return "Thank you for you answer. A new temporary password token <br>" +
			"has been emailed to you";
		}
	}

	private void sendEmailForgotPassword(UserEntity user){
		final String username = "hyphenconsult@gmail.com";
		final String password = "ilzhkshpmtqduzuc";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		javax.mail.Session sessionMail = javax.mail.Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(sessionMail);
			message.setFrom(new InternetAddress("hyphenconsult@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(user.getEmail()));
			message.setSubject("TIE Account Password changed");

			message.setContent("Dear " + user.getName() +" <br></br> <br></br>"
					+ "Your Password updated <br></br> <br></br>"
					+ "Please create your new password <br></br> <br></br>"
					//					+" Your password must be at least 8 charcters long, should have atleast 1 digit(0-9) and should have an uppercase letter.<br></br>"
					//					+" You secret question must be at least  8 characters long and should have an uppercase letter, You will need to answer the secret question if you ever forget your password.<br></br>"
					+" To activate your account, please click on the link below.<br></br> <br></br>"
					+" <a href= http://localhost:8080/tie/#"+ user.getToken()+">"+"Activate Account</a>","text/html" );


			Transport.send(message);

			System.out.println("email sent");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}

}


