package com.helloworld.database;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.shared.entity.User;

public class MyRdbHelper {

	private SessionFactory sessionFactory;
	Logger logger;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public String addUser(User user) throws Exception {
		Session session = null;
		try{
			session = sessionFactory.openSession();
			
			boolean existingUser = true;
			if(user.getUserId()== 0){
				existingUser = false;
			}
			
			if(userNameAlreadyExist(session, user.getUserName(), user.getUserId())){
				return ApplicationConstants.USERNAME_NOT_AVAILABLE;
			}
			if(emailAlreadyExist(session, user.getEmail(),  user.getUserId())){
				return ApplicationConstants.EMAIL_NOT_AVAILABLE;
			}
			
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

	public boolean userNameAlreadyExist(Session session, String userName, int userId)throws Exception{

		try{
			Criteria crit = session.createCriteria(User.class);
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
			Criteria crit = session.createCriteria(User.class);
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
			Criteria crit = session.createCriteria(User.class);
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


	public User signIn(String userName, String password) throws Exception{
		Session session = null;
		User user = null;
		try{
			session = sessionFactory.openSession();
			Criteria crit = session.createCriteria(User.class);
			crit.add(Restrictions.eq("userName", userName));
			crit.add(Restrictions.eq("password", password));
			if(crit.list().size()>0){
				user = (User) crit.list().get(0);
				return user;
			}else{
				return null;
			}
		}catch(Exception ex){
			logger.warn(String.format("Exception occured in signIn", ex.getMessage()), ex);
			System.out.println("Exception occured in signIn"+ ex.getMessage());
			throw new Exception("Exception occured in signIn");
		}
	}
}


