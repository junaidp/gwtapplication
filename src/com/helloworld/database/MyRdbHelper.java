package com.helloworld.database;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
			session.saveOrUpdate(user);
			session.flush();
				return "User Added";
			
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

}
