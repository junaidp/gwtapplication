package com.helloworld.server;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gwt.core.client.GWT;
import com.helloworld.client.view.ApplicationConstants;
import com.helloworld.database.MyRdbHelper;
import com.helloworld.shared.DynamicCompilation;
import com.helloworld.shared.dto.AddedBeanDTO;

public class FilesCreationHelper {

	String baseBeanName= "";
	Object parentobject = null;
	Object baseObject = null;
	Method parentMethod = null;


	public String generateBean(AddedBeanDTO addedBeanDTO) throws Exception{
		try{

			//			if(addedBeanDTO.)

			String dir = System.getProperty("user.dir");
			int slashIndex = dir.lastIndexOf("\\");
			dir = dir.substring(0, slashIndex+1);
			String packageDir = addedBeanDTO.getPackageName().replace(".","\\");
			dir =dir +"src\\"+ packageDir;
			File myPackage    = new File(dir);
			myPackage.mkdir();
			File sourceFile   = new File(dir+"\\"+addedBeanDTO.getBeanName()+".java");
			FileWriter writer = new FileWriter(sourceFile);



			//////////////Crate Package and class/////////////////
			StringBuffer sb = new StringBuffer("");
			sb.append("package "+ addedBeanDTO.getPackageName()+"; \n \n");
			sb.append("import java.io.Serializable; \n ");
			sb.append("import java.util.*; \n \n");
			for(int i=0; i< addedBeanDTO.getListImports().size(); i++){
				sb.append("import "+ addedBeanDTO.getListImports().get(i)+"; \n");
			}

			sb.append("\n");
			//Annotaion....
			for(int i=0; i< addedBeanDTO.getListAnnotationsDTO().size(); i++){
				sb.append(addedBeanDTO.getListAnnotationsDTO().get(i).getName()+addedBeanDTO.getListAnnotationsDTO().get(i).getAnnotationText()+  "\n" );
			}
			sb.append("\n");
			//End Annotation...

			sb.append("public class "+addedBeanDTO.getBeanName()+" implements Serializable { \n \n");
			sb.append("public "+ addedBeanDTO.getBeanName()+"() { \n");
			sb.append("} \n \n");
			//////////ADD Fields///////////
			for(int i=0; i< addedBeanDTO.getListProperties().size(); i++){

				//Field Annotaion....
				for(int j=0; j< addedBeanDTO.getListProperties().get(i).getListAnnotationsDTO().size(); j++){
					sb.append(addedBeanDTO.getListProperties().get(i).getListAnnotationsDTO().get(j).getName()+ 
							addedBeanDTO.getListProperties().get(i).getListAnnotationsDTO().get(j).getAnnotationText()+ "\n" );
				}
				sb.append(addedBeanDTO.getListProperties().get(i).getModifier()+" "+addedBeanDTO.getListProperties().get(i).getDataType()+" "+ addedBeanDTO.getListProperties().get(i).getName()+";");
				sb.append("\n");
				sb.append("\n");
			}
			sb.append("\n");
			/////////ADD Getters/Setters //////////
			for(int i=0; i< addedBeanDTO.getListProperties().size(); i++){
				String fieldName =addedBeanDTO.getListProperties().get(i).getName();
				fieldName = Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);	
				if(addedBeanDTO.getListProperties().get(i).getGetterSetter().equalsIgnoreCase("Both")){
					sb.append(/*addedBeanDTO.getListProperties().get(i).getModifier()+*/"public "+ addedBeanDTO.getListProperties().get(i).getDataType()+" ");
					sb.append("get"+ fieldName+"() {\n");
					sb.append("return "+ addedBeanDTO.getListProperties().get(i).getName()+"; \n");
					sb.append("} \n");
					sb.append("public void ");
					sb.append("set"+ fieldName+"("+ addedBeanDTO.getListProperties().get(i).getDataType()+" "+addedBeanDTO.getListProperties().get(i).getName()+") { ");
					sb.append("\n");
					sb.append("this."+addedBeanDTO.getListProperties().get(i).getName()+" = "+ addedBeanDTO.getListProperties().get(i).getName()+";");
					sb.append("\n }");
					sb.append("\n");
				}
				else if(addedBeanDTO.getListProperties().get(i).getGetterSetter().equalsIgnoreCase("Getters")){
					sb.append("public "+ addedBeanDTO.getListProperties().get(i).getDataType()+" ");
					sb.append("get"+ fieldName+"() {\n");
					sb.append("return "+ addedBeanDTO.getListProperties().get(i).getName()+"; \n");
					sb.append("} \n");
					sb.append("\n");
				}
				else if(addedBeanDTO.getListProperties().get(i).getGetterSetter().equalsIgnoreCase("Setters")){
					sb.append("public void ");
					sb.append("set"+ fieldName+"("+ addedBeanDTO.getListProperties().get(i).getDataType()+" "+addedBeanDTO.getListProperties().get(i).getName()+") { ");
					sb.append("\n");
					sb.append("this."+addedBeanDTO.getListProperties().get(i).getName()+" = "+ addedBeanDTO.getListProperties().get(i).getName()+"; \n");
					sb.append("} \n");
					sb.append("\n");
				}

			}
			sb.append("\n }");
			writer.write(sb+"");
			writer.close();
			return "Bean Created";
		}catch(Exception ex){
			throw new Exception(ex.getCause());
		}
	}

	public int firstIndexOfUCL(String str) {        
		for(int i=0; i<str.length()-1; i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				return i;
			}
		}
		return -1;
	}

	public String fetchBeanJSON(String className, String reflectionName, String action) throws Exception {
		String jsonInString = "";
		try{
			//			Reflections reflections = new Reflections("org.hibernate");
			//
			//			Set<Class<? extends Annotation>> allClasses = 
			//			    reflections.getSubTypesOf(Annotation.class);
			//			

			new DynamicCompilation(className, reflectionName, action);


			int ind = className.lastIndexOf(".");
			String reflectedClass = className.substring(0, ind+1);
			reflectedClass = reflectedClass+reflectionName;

			Class myClass = Class.forName(className);
			Object obj = myClass.newInstance();
			ObjectMapper mapper = new ObjectMapper();
			jsonInString = mapper.writeValueAsString(obj);
		}catch(Exception ex){
			throw new Exception( "Exception occured in Reflection"+ ex);
		}
		return jsonInString;
		//		return "";
	}


	//	public String editBeanOnPropertyChange(String selectedBeanName,
	//			TreeMap beanPropertiesMap) throws Exception {
	//		
	//		Object beanObject = null;
	//		try{
	//			selectedBean = Class.forName(selectedBeanName);
	//			beanObject = selectedBean.newInstance();
	//		}catch(Exception ex){
	//			
	//		}
	//		
	//		
	//		Set set = beanPropertiesMap.entrySet();
	//		Iterator i = set.iterator();
	//		
	//		while(i.hasNext()) {
	//			Map.Entry me = (Map.Entry)i.next();
	//			
	//			editBean(beanObject, me.getKey(), me.getValue()); 
	//		}
	//		
	//		saveBeanObjectIntoDataBase(beanObject, selectedBeanName);
	//		return "pass";
	//	}

	public static boolean isSetter(Method method){
		if(!method.getName().startsWith("set")) return false;
		if(method.getParameterTypes().length != 1) return false;
		return true;
	}
	

	public String editBeanOnPropertyChange(String selectedBeanName,
			TreeMap beanPropertiesMap) throws Exception {
		
		try{
			Class bean = Class.forName(selectedBeanName);
			baseBeanName = selectedBeanName;
//			baseObject = bean.newInstance();
//			parentobject = baseObject;
			parentobject = bean.newInstance();
			
			return editBeanOnChange(selectedBeanName, beanPropertiesMap);
		}catch(Exception ex){
			throw ex;
		}
		
		
		
	}
	

	public String editBeanOnChange(String selectedBeanName,
			TreeMap beanPropertiesMap) throws Exception {


		try{
			Class bean = Class.forName(selectedBeanName);
			Object object = bean.newInstance();
			if(parentMethod!=null){
			parentMethod.invoke(parentobject, object);
			}
			parentobject = object;
			if(baseObject == null){
				baseObject = parentobject;
			}
			/////Setting parentObject into baseObject into 

			final Method[] methods = bean.getMethods();
			for(Method method : methods){
				if(isSetter(method)){
					Class<?>[] parameter = method.getParameterTypes();
					String propertyName = parameter[0].getName();
					if(!propertyName.startsWith(ApplicationConstants.DEFAULT_PACKAGE_START)){
						editBean(object, beanPropertiesMap, method);
					}
				}	
			}

			for(Method method : methods){
				if(isSetter(method)){
					Class<?>[] parameter = method.getParameterTypes();
					String propertyName = parameter[0].getName();
					String entityName = parameter[0].getSimpleName();

					if(propertyName.startsWith(ApplicationConstants.DEFAULT_PACKAGE_START)){


						Set set = beanPropertiesMap.entrySet();
						Iterator i = set.iterator();
						TreeMap beanPropertiesChildMap = new TreeMap();
						parentMethod = method;
						while(i.hasNext()) {
							Map.Entry me = (Map.Entry)i.next();
							String propertyName1 = me.getKey().toString();
							if(propertyName1.contains("_")){
								int ind_ = propertyName1.indexOf("_");
								String beanChildName = propertyName1.substring(0, ind_);

								if(entityName.equalsIgnoreCase(beanChildName)){
									
									beanPropertiesChildMap.put(propertyName1.substring(ind_+1), me.getValue());
								}


							}
						}
						if(beanPropertiesChildMap.size() > 0){
						editBeanOnChange(propertyName, beanPropertiesChildMap);
						}
						
					}




					//						Class childBean = Class.forName(propertyName);
					//						Object childObject = childBean.newInstance();
					//						final Method[] childMethods = childBean.getMethods();
					//						for(Method childMethod : childMethods){
					//							editChildBean(childObject, beanPropertiesMap, childMethod);
					//						}
					//						editBeanOnPropertyChange(propertyName, beanPropertiesMap);
					//					}else{
					//						editBean(baseObject, beanPropertiesMap, method);
					//					}
				}
			}
			saveBeanObjectIntoDataBase(baseObject, baseBeanName);
		}catch(Exception ex){
			System.out.println("ex: "+ ex);
		}





		return "pass";
	}

	private void editBean(Object beanObject, TreeMap beanPropertiesMap, Method method) {
		Map.Entry me = null;
		try {
			Set set = beanPropertiesMap.entrySet();
			Iterator i = set.iterator();

			while(i.hasNext()) {
				 me = (Map.Entry)i.next();
				if(method.getName().equalsIgnoreCase("set"+me.getKey())){
					method.invoke(beanObject, me.getValue());
					break;
				}
			}



		} catch (Exception e) {
			System.out.println("exception on "+me.getKey()+" "+ e.getLocalizedMessage()+":"+e.getCause());
		}
	}

	private void editChildBean(Object beanObject, TreeMap beanPropertiesMap, Method method) {
		try {
			Set set = beanPropertiesMap.entrySet();
			Iterator i = set.iterator();

			while(i.hasNext()) {
				Map.Entry me = (Map.Entry)i.next();
				String propertyName = me.getKey().toString();
				if(propertyName.contains("_")){
					int ind_ = propertyName.indexOf("_");
					String beanChildName = propertyName.substring(0, ind_);

					if(beanObject.getClass().getSimpleName().equalsIgnoreCase(beanChildName)){
						if(method.getName().equalsIgnoreCase("set"+me.getValue())){
							method.invoke(beanObject, me.getValue());
						}
					}


				}
			}



		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void saveBeanObjectIntoDataBase(Object beanObject, String selectedBeanName) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MyRdbHelper rdbHelper = (MyRdbHelper) ctx.getBean("ManagerApp");
		rdbHelper.saveBeanObjectIntoDataBase(beanObject, selectedBeanName);

	}

	//	private void editBean(Object beanObject, Object key, Object value) {
	//		try {
	//			boolean matchFound = false;
	//			final Method[] methods = selectedBean.getMethods();
	//			for(Method method : methods){
	//
	//				if(method.getName().equalsIgnoreCase("set"+key)){
	//					Class<?>[] parameter = method.getParameterTypes();
	//					String packageName = parameter[0].getPackage().getName();
	//					if(packageName.startsWith(ApplicationConstants.DEFAULT_PACKAGE)){
	//						selectedBean = Class.forName(packageName);
	////					beanObject = selectedBean.newInstance();
	//					}
	//					method.invoke(beanObject, value);
	//					matchFound = true;
	//					break;
	//				}
	//			}
	////			String propertyName = key.toString();
	////			if(!matchFound && propertyName.contains("_")){  // considering the BeanName it self does not contain any _
	////				int ind_ = propertyName.indexOf("_");
	////				String beanChildName = propertyName.substring(0, ind_);
	//////				selectedBean = Class.forName(beanChildName.toString());
	//////				beanObject = selectedBean.newInstance();
	////				
	////				editBean(beanObject, beanChildName, value);
	////			}
	//
	//
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//	}



	//	private <T> T getCastedValue(Entry me) throws NoSuchFieldException {
	//		Field field = selectedBean.getDeclaredField(me.getKey().toString());
	//		field.getType().getSimpleName();
	//		int x =0;
	//		boolean f = true;
	//		return f;
	//		
	//	}





	//	public String editBeanOnPropertyChange(String beanName,
	//			PropertyChangeSupport pcs)throws Exception {
	//		
	//		final Method[] methods = selectedBean.getMethods();
	//
	//		 try {
	//			 selectedBean = Class.forName(beanName);
	////			 Object obj = myClass.newInstance();
	////			
	//			
	//		} catch (Exception e) {
	//			
	//		}
	//		
	//		
	//		pcs.addPropertyChangeListener(new PropertyChangeListener() {
	//			
	//			@Override
	//			public void propertyChange(PropertyChangeEvent evt) {
	//				try {
	////					Field field = selectedBean.getField(evt.getPropertyName());
	//					
	//					 for(Method method : methods){
	//						 
	//						 if(method.getName().equalsIgnoreCase("set"+evt.getPropertyName())){
	//							 
	//							 	method.invoke(selectedBean, evt.getNewValue());
	//						 }
	//					 }
	//				
	//					
	//				} catch (Exception e) {
	//					// TODO Auto-generated catch block
	//					e.printStackTrace();
	//				} 
	//			}
	//		});
	//		
	//		return "";
	//		
	//	}

}
