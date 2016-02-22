package com.mamallan.gwtapp.org.hibernate;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 




import java.util.Map;
import java.util.HashMap;
 




// EclipseLink imports
import org.eclipse.persistence.logging.SessionLog;
import org.eclipse.persistence.sessions.DatabaseLogin;
import org.eclipse.persistence.sessions.DatabaseSession;
import org.eclipse.persistence.sessions.Project;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.jpa.dynamic.JPADynamicTypeBuilder;
import org.eclipse.persistence.jpa.dynamic.JPADynamicHelper;
import org.eclipse.persistence.jpa.JpaEntityManager;
import org.eclipse.persistence.dynamic.DynamicClassLoader;
import org.eclipse.persistence.dynamic.DynamicEntity;
import org.eclipse.persistence.dynamic.DynamicType;
import org.hibernate.SessionFactory;

import com.mamallan.gwtapp.shared.dto.AddedBeanDTO;
import com.mamallan.gwtapp.shared.dto.DummyBean;


public class DynHelperBk {

	@PersistenceContext(unitName = "data5PU")
	static EntityManager em;

 	public static String DATABASE_USERNAME = "root";
        public static String DATABASE_PASSWORD = "";
        public static String DATABASE_URL = "jdbc:mysql://localhost/gwtapp";
        public static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
 
      
    public static void main(String[] args) {
 
 	}

	public static void createDynamicBean(String beanName) {
		Project project = new Project();
        DatabaseLogin login = new DatabaseLogin();
        login.setUserName(DATABASE_USERNAME);
        login.setPassword(DATABASE_PASSWORD);
        login.setConnectionString(DATABASE_URL);
        login.setDriverClassName(DATABASE_DRIVER);
		//      login.setDatasourcePlatform(new Oracle10Platform());
        project.setDatasourceLogin(login);
  
		DatabaseSession session = project.createDatabaseSession();
 
		session.setLogLevel(SessionLog.FINE);

		session.setProperty(PersistenceUnitProperties.WEAVING, "true");
		// session.setProperty(PersistenceUnitProperties.WEAVING_FETCHGROUPS,
		// "true");
		session.login();

		DynamicClassLoader dcl = DynamicClassLoader.lookup(session);

		Map<String, Object> properties = new HashMap<String, Object>();
 
		properties.put(PersistenceUnitProperties.CLASSLOADER, dcl);
		properties.put(PersistenceUnitProperties.WEAVING, "dynamic");
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("data5PU", properties);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("data5PU");
        em = emf.createEntityManager();
    
//		JpaEntityManager jpaEntityManager = (JpaEntityManager) em.getDelegate();
//		AbstractSession session = (AbstractSession) jpaEntityManager.getActiveSession();
//		ClientSession session = jpaEntityManager.getServerSession().acquireClientSession();

	    
	Class<?> aziendaClass = dcl.createDynamicClass(beanName);

	JPADynamicTypeBuilder builder = new JPADynamicTypeBuilder(aziendaClass,
				null, "Test");

	builder.addDirectMapping("id", int.class, "A_ID");
	builder.addDirectMapping("nome", String.class, "A_NAME");
	builder.setPrimaryKeyFields("A_ID");

	DynamicType empType = builder.getType();
	
	DynamicType [] types = new DynamicType [1];
	types[0] = empType;
	
	JPADynamicHelper helper = new JPADynamicHelper(emf);
	helper.addTypes(true, true, types);

	
	DynamicEntity emp = empType.newDynamicEntity();
	emp.set("id", 11);
	emp.set("nome", "nomer");

	
	em.getTransaction().begin();
	em.persist(emp);
	em.getTransaction().commit();
	
//	session.beginTransaction();
	
//	session.writeObject(emp);
	
//	session.commitTransaction();
	
	
	DynamicEntity l = null;
	l = (DynamicEntity) em.find(empType.getJavaClass(), 1);

	System.out.println(" name = "+ l.get("nome"));
	}

}