package com.helloworld.server;

import java.io.File;
import java.io.FileWriter;
import org.codehaus.jackson.map.ObjectMapper;
import com.helloworld.shared.DynamicCompilation;
import com.helloworld.shared.dto.AddedBeanDTO;

public class FilesCreationHelper {
	
	private Class selectedBean = null;

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
//		Class myClass = Class.forName(reflectedClass);
		Object obj = myClass.newInstance();
		ObjectMapper mapper = new ObjectMapper();
		jsonInString = mapper.writeValueAsString(obj);
		}catch(Exception ex){
			throw new Exception( "Exception occured in Reflection"+ ex);
		}
		return jsonInString;
//		return "";
	}

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
