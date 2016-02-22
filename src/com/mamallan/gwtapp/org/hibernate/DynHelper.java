package com.mamallan.gwtapp.org.hibernate;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;



























// EclipseLink imports
import org.eclipse.persistence.logging.SessionLog;
import org.eclipse.persistence.sequencing.NativeSequence;
import org.eclipse.persistence.sessions.DatabaseLogin;
import org.eclipse.persistence.sessions.DatabaseSession;
import org.eclipse.persistence.sessions.Project;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.jpa.dynamic.JPADynamicTypeBuilder;
import org.eclipse.persistence.jpa.dynamic.JPADynamicHelper;
import org.eclipse.persistence.dynamic.DynamicClassLoader;
import org.eclipse.persistence.dynamic.DynamicEntity;
import org.eclipse.persistence.dynamic.DynamicType;
import org.json.JSONObject;
import com.mamallan.gwtapp.client.view.ApplicationConstants;
import com.mamallan.gwtapp.shared.dto.AddedBeanDTO;



public class DynHelper {

	@PersistenceContext(unitName = "data5PU")
	static EntityManager em;

	public static String DATABASE_USERNAME = "root";
	public static String DATABASE_PASSWORD = "";
	public static String DATABASE_URL = "jdbc:mysql://localhost/gwtapp";
	public static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
	private String beanName = "";

	public DynHelper() {

	}


	public  String createDynamicBeanWithoutData(AddedBeanDTO addedBeanDTO) throws Exception {
		Project project = new Project();
		DatabaseLogin login = new DatabaseLogin();
		login.setUserName(DATABASE_USERNAME);
		login.setPassword(DATABASE_PASSWORD);
		login.setConnectionString(DATABASE_URL);
		login.setDriverClassName(DATABASE_DRIVER);
		project.setDatasourceLogin(login);

		DatabaseSession session = project.createDatabaseSession();

		session.setLogLevel(SessionLog.FINE);

		session.setProperty(PersistenceUnitProperties.WEAVING, "true");
		session.login();

		DynamicClassLoader dcl = DynamicClassLoader.lookup(session);

		Map<String, Object> properties = new HashMap<String, Object>();

		properties.put(PersistenceUnitProperties.CLASSLOADER, dcl);
		properties.put(PersistenceUnitProperties.WEAVING, "dynamic");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("data5PU");
		em = emf.createEntityManager();
		String selectedBeanName = addedBeanDTO.getBeanName();
		int ind = selectedBeanName.toString().lastIndexOf(".");
		if(ind==-1){

		}else{
			selectedBeanName = selectedBeanName.toString().substring(ind+1);
		}

		Class<?> beanClass = dcl.createDynamicClass(selectedBeanName);


		JPADynamicTypeBuilder builder = new JPADynamicTypeBuilder(beanClass,
				null, selectedBeanName);


		JSONObject obj = new JSONObject();

		for(int i=0; i< addedBeanDTO.getListProperties().size(); i++){


			builder.addDirectMapping(addedBeanDTO.getListProperties().get(i).getName(),getType(addedBeanDTO.getListProperties().get(i).getDataType()), addedBeanDTO.getListProperties().get(i).getName());

			//Creating Json
			obj.put(addedBeanDTO.getListProperties().get(i).getName(), addedBeanDTO.getListProperties().get(i).getDataType());

		}

		DynamicType empType = builder.getType();
		DynamicType [] types = new DynamicType [1];
		types[0] = empType;
		//		saveJson(obj); only for beans with data are saving in db , hence json for beans with data only , As in onModule , system read jsons and then fetch tables as per that.
		DynamicEntity l = null;
		l = (DynamicEntity) em.find(empType.getJavaClass(), 10);

		return "Dynamic bean created";
	}


	public  String createDynamicBeanWithData(TreeMap beanPropertiesMap, String selectedBeanName) throws Exception {
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
		session.login();

		DynamicClassLoader dcl = DynamicClassLoader.lookup(session);

		Map<String, Object> properties = new HashMap<String, Object>();

		properties.put(PersistenceUnitProperties.CLASSLOADER, dcl);
		properties.put(PersistenceUnitProperties.WEAVING, "dynamic");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("data5PU");
		em = emf.createEntityManager();

		int ind = selectedBeanName.toString().lastIndexOf(".");
		if(ind==-1){
			beanName = selectedBeanName;
		}else{
			beanName = selectedBeanName.toString().substring(ind+1);
		}

		Class<?> beanClass = dcl.createDynamicClass(beanName);


		JPADynamicTypeBuilder builder = new JPADynamicTypeBuilder(beanClass,
				null, beanName);

		// Using Bean Class to get the types of fields. As when we calling this method from JavaBeanEditor when user selecting GWT ui fiels , there user is only sending field name and its value , but not type.
		Class bean = Class.forName(selectedBeanName);
		Field[] beanFields = bean.getDeclaredFields();

		DynamicType empType = builder.getType();
		DynamicType [] types = new DynamicType [1];
		types[0] = empType;
		DynamicEntity emp = empType.newDynamicEntity();
		JSONObject obj = new JSONObject();



		for(int i=0; i< beanFields.length; i++){
			Set set = beanPropertiesMap.entrySet();
			Iterator it = set.iterator();
			Map.Entry me = null;

			while(it.hasNext()) {
				me = (Map.Entry)it.next();
				if(beanFields[i].getName().equals(me.getKey())){
					//					PrimaryKey annotation = beanFields[i].getAnnotations().getAnnotation(PrimaryKey.class);
					builder.addDirectMapping(beanFields[i].getName(),beanFields[i].getType(), beanFields[i].getName() );
					emp.set(me.getKey().toString(), me.getValue());
					//Creating Json
					obj.put(me.getKey().toString(), beanFields[i].getType().getSimpleName());

				}
			}
		}
		builder.addDirectMapping("beanId", int.class, "beanId");

		builder.addDirectMapping("beanType", char.class, "beanType");
		emp.set("beanType", 'D');  //D: Dynamic,   S: Static
		emp.set("beanId", 0);
		obj.put("beanId", int.class.getSimpleName());
		obj.put("beanType", char.class.getSimpleName());
		builder.setPrimaryKeyFields("beanId");
		NativeSequence sequence = new NativeSequence("SEQ_GEN_IDENTITY", true);//new NativeSequence();
		sequence.setPreallocationSize(1);
		builder.configureSequencing(sequence, "SEQ_GEN_IDENTITY", "beanId");
		JPADynamicHelper helper = new JPADynamicHelper(emf);
		helper.addTypes(true, true, types);

		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		saveJson(obj);


		//		DynamicEntity dynamicObject = null;
		//		dynamicObject = (DynamicEntity) em.find(empType.getJavaClass(), 1);


		return "Dynamic bean created";

		///Save blob in db 
		//		Class<? extends Serializable> javaClass = (Class<? extends Serializable>) empType.getJavaClass();
		////		Class javaClass = Class.forName(selectedBeanName);
		//		Object javaObject = javaClass.newInstance();
		//		
		////		ObjectMapper om = new ObjectMapper();
		////		om.writeValueAsString(javaObject);
		//		
		//		ApplicationContext ctx = new ClassPathXmlApplicationContext(
		//				"applicationContext.xml");
		//		MyRdbHelper rdbHelper = (MyRdbHelper) ctx.getBean("ManagerApp");
		//
		//		rdbHelper.saveBeanObjectIntoDataBase(javaObject, beanName);
		///End blob


	}


	private void saveJson(JSONObject obj) throws Exception {
		StringWriter out = new StringWriter();
		obj.write(out);
		String jsonText = out.toString();
		String dir = System.getProperty("user.dir");
		File folder = new File(dir+File.separator+ApplicationConstants.DYNAMIC_BEANS_FOLDER+File.separator+"bean-"+beanName+".json");
		File fold = new File(dir+File.separator+ApplicationConstants.DYNAMIC_BEANS_FOLDER);
		fold.mkdir();
		FileWriter file = new FileWriter(folder);
		file.write(jsonText);
		file.flush();
		file.close();

	}


	public void createDynamicBeanFromOnModule(List dbData, org.json.simple.JSONObject jsonObject, String selectedBeanName) throws ClassNotFoundException {


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
		session.login();

		DynamicClassLoader dcl = DynamicClassLoader.lookup(session);

		Map<String, Object> properties = new HashMap<String, Object>();

		properties.put(PersistenceUnitProperties.CLASSLOADER, dcl);
		properties.put(PersistenceUnitProperties.WEAVING, "dynamic");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("data5PU");
		em = emf.createEntityManager();

		beanName = selectedBeanName;
		Class<?> beanClass = dcl.createDynamicClass(beanName);


		JPADynamicTypeBuilder builder = new JPADynamicTypeBuilder(beanClass,
				null, beanName);

		DynamicType empType = builder.getType();
		DynamicType [] types = new DynamicType [1];
		types[0] = empType;
		DynamicEntity emp = empType.newDynamicEntity();


		for(Iterator it = jsonObject.keySet().iterator(); it.hasNext();) {
			String key = (String) it.next();
			builder.addDirectMapping(key,getType(jsonObject.get(key).toString()), key);

		}

		if(dbData.size()>0){
			List dbDat = dbData;
			HashMap dbMap = (HashMap) dbData.get(0);
			Set set = dbMap.entrySet();
			Iterator it = set.iterator();
			Map.Entry me = null;
			int beanId = 0;
			while(it.hasNext()) {
				me = (Map.Entry)it.next();
				emp.set(me.getKey().toString(), me.getValue());
				if(me.getKey().toString().equalsIgnoreCase("beanId")){
					beanId = Integer.parseInt(me.getValue().toString());
				}
			}
			builder.setPrimaryKeyFields("beanId");
			JPADynamicHelper helper = new JPADynamicHelper(emf);
			helper.addTypes(true, true, types);

			DynamicEntity dynamicObject = null;
			dynamicObject = (DynamicEntity) em.find(empType.getJavaClass(), beanId);
		}
		//Test : setting one of your dynamic bean fields to another java bean object.
		//		String name = dynamicObject.get("name");
		//		DummyBean dummyBean = new DummyBean ();
		//		dummyBean.setName(name);
	}

	public Class<?> getType(String typeName){

		if(typeName.equalsIgnoreCase("short")){
			return short.class;
		}else if(typeName.equalsIgnoreCase("int")){
			return int.class;
		}else if(typeName.equalsIgnoreCase("long")){
			return long.class;
		}else if(typeName.equalsIgnoreCase("float")){
			return float.class;
		}else if(typeName.equalsIgnoreCase("double")){
			return double.class;
		}else if(typeName.equalsIgnoreCase("boolean")){
			return boolean.class;
		}else if(typeName.equalsIgnoreCase("char")){
			return char.class;
		}else if(typeName.equalsIgnoreCase("string")){
			return String.class;
		}else if(typeName.equalsIgnoreCase("byte")){
			return byte.class;
		}else if(typeName.equalsIgnoreCase("date")){
			return Date.class;
		}
		return int.class;
	}

}