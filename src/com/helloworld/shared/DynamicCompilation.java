package com.helloworld.shared;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Date;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import org.codehaus.jackson.map.util.ClassUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.util.ClassUtils;

import com.google.gwt.dev.asm.Type;

public class DynamicCompilation {

	public DynamicCompilation(String className, String reflectedClassName) throws Exception {
		// create the source
		File sourceFile   = new File("C:\\Users\\Junaid\\git\\gwtapp\\HelloWorldGWT\\src\\com\\helloworld\\shared\\beans\\"+reflectedClassName+".java");
		FileWriter writer = new FileWriter(sourceFile);

		//		Class myClass = MyFirstBean.class;
		Class myClass = Class.forName(className);
		Class[] listofImplements = myClass.getInterfaces();
		myClass.getSimpleName();
		Method[] method = myClass.getDeclaredMethods();
		Field[] field = myClass.getDeclaredFields();
		myClass.getModifiers();

		//////////////Crate Package and class/////////////////
		StringBuffer sb = new StringBuffer("");
		sb.append("package com.helloworld.shared.beans; \n \n");
		sb.append("import java.util.*; \n");
		sb.append("public class "+reflectedClassName );
		if(listofImplements.length>0){
			sb.append(" implements ");
		}
		//Add implements...and their imports.
		for(int i=0;i< listofImplements.length; i++){
			sb.append(listofImplements[i].getSimpleName()+"");
			int ind = sb.indexOf("public");
			sb.insert(ind, "\n");
			sb.insert(ind, "import "+ listofImplements[i].getName()+";");
			sb.append("\n");
		}
		sb.append("{ \n");
		sb.append("\n");

		//////////////Create Constructor//////////////////////
		Constructor[] constructors = myClass.getConstructors();
		for(int i=0; i< constructors.length; i++){
			sb.append(getModifer(constructors[i].getModifiers())+" ");
			sb.append(reflectedClassName+"(");

			/////////////Create Constructor Parameters////////////////////////
			Class[] parameters = constructors[i].getParameterTypes();
			for(int j=0; j<parameters.length; j++){
				if(j>0){
					sb.append(", "+parameters[j].getSimpleName()+" x"+j);
				}else{
					sb.append(parameters[j].getSimpleName()+" x"+j);

				}
			}
			sb.append(") {");
			sb.append("\n");
			sb.append("\n");
			sb.append("}");
			sb.append("\n");

		}

		sb.append("\n");
		////////////////Create Fields/////////////////////
		for(int i=0; i< field.length; i++){
			sb.append(getModifer(field[i].getModifiers())+" ");
			sb.append(field[i].getType().getSimpleName()+" ");
			sb.append(field[i].getName()+"");
			if(ClassUtils.isPrimitiveOrWrapper(field[i].getType())){
				field[i].setAccessible(true);
				try{
					if(field[i].get(null)!=null){
						sb.append("= "+ field[i].get(null));
					}
				}catch(Exception ex){

				}

			}

			sb.append(";");
			sb.append("\n");

			////////////////CHECK if its a Declared bean and then add its imports and create childs///////

			if(! field[i].getType().getName().startsWith("java.") && implementsSerializable( field[i].getType().getInterfaces())
					&& allFieldsPrivate(field[i].getType())){//Check if its a custom bean.
				int ind = sb.indexOf("public");
				sb.insert(ind, "\n");
				sb.insert(ind, "import "+ field[i].getType().getName()+";");
				sb.append("\n");
				reflectedClassName = reflectedClassName+"Child"+i;
				new DynamicCompilation(field[i].getType().getName(), reflectedClassName);
			}
		}

		sb.append("\n");
		////////////////Create methods////////////////////
		for(int i=0; i< method.length; i++){


			Class<?>[] parametersType = method[i].getParameterTypes();

			sb.append(getModifer(method[i].getModifiers())+"  "+ 
					method[i].getReturnType().getSimpleName() +" "+ method[i].getName()+"(");
			for(int j=0; j<parametersType.length; j++){
				if(j>0){
					sb.append(", "+parametersType[j].getSimpleName()+" "+method[i].getParameters()[j].getName());
				}else{
					sb.append(parametersType[j].getSimpleName()+" "+method[i].getParameters()[j].getName());


				}
			}
			sb.append(")"+   "{ \n" );
			/////////Writing method bodies ONLY FOR GETTERS/SETTERS.///////////////
			if(isGetter(method[i]) || isSetter(method[i])){
				int indexUCL =firstIndexOfUCL(method[i].getName());
				String fieldName =method[i].getName().substring(indexUCL);
				fieldName = Character.toLowerCase(fieldName.charAt(0)) + fieldName.substring(1); 

				if(method[i].getReturnType().getSimpleName().equals("void")){
					sb.append("this."+fieldName +" = "+ method[i].getParameters()[0].getName()+";");
				}else{
					sb.append("return "+ fieldName+";");
				}
			}
			sb.append("\n" + " }\n");
		}
		sb.append("}");

		writer.write(sb+"");
		writer.close();

		JavaCompiler compiler    = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager =
				compiler.getStandardFileManager(null, null, null);

		fileManager.setLocation(StandardLocation.CLASS_OUTPUT,
				Arrays.asList(new File("/temp")));
		// Compile the file
		compiler.getTask(null,
				fileManager,
				null,
				null,
				null,
				fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sourceFile)))
		.call();
		fileManager.close();

	}

	private boolean implementsSerializable(Class<?>[] listofImplements){
		for(int i=0;i< listofImplements.length; i++){
			if(listofImplements[i].getSimpleName().equals("Serializable")){
				return true;
			}
		}
		return false;

	}

	private boolean allFieldsPrivate(Class<?> fieldClass) {
		for(int i=0; i<fieldClass.getDeclaredFields().length; i++){
			if(! Modifier.isPrivate(fieldClass.getDeclaredFields()[i].getModifiers())){
				return false;
			}
		}
		return true;
	}

	public String getModifer(int modifier){
		if(Modifier.isAbstract(modifier)){
			return "abstract";
		}
		if( Modifier.isFinal(modifier)){
			return "final";
		}
		if(Modifier.isInterface(modifier)){
			return "interface";
		}
		if(Modifier.isNative(modifier)){
			return "native";
		}
		if( Modifier.isPrivate(modifier)){
			return "private";
		}
		if( Modifier.isProtected(modifier)){
			return "protected";
		}
		if( Modifier.isPublic(modifier)){
			return "public";
		}
		if(Modifier.isStatic(modifier)){
			return "static";
		}
		if(Modifier.isStrict(modifier)){
			return "strict"; 
		}
		if(Modifier.isSynchronized(modifier)){
			return "synchronized";
		}
		if(Modifier.isTransient(modifier)){
			return "transient";
		}
		if(Modifier.isVolatile(modifier)){
			return "volatile";
		}
		else return "public";
	}

	public static boolean isGetter(Method method){
		if(!method.getName().startsWith("get")&&!method.getName().startsWith("is"))      return false;
		if(method.getParameterTypes().length != 0)   return false;  
		if(void.class.equals(method.getReturnType())) return false;
		return true;
	}

	public static boolean isSetter(Method method){
		if(!method.getName().startsWith("set")) return false;
		if(method.getParameterTypes().length != 1) return false;
		return true;
	}

	public int firstIndexOfUCL(String str) {        
		for(int i=0; i<str.length()-1; i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				return i;
			}
		}
		return -1;
	}


	//	@SuppressWarnings("unchecked")
	//	public static void runIt() {
	//		try {
	//			Class params[] = {};
	//			Object paramsObj[] = {};
	//			//      Class thisClass = Class.forName("Hello");
	//			Class thisClass = MyFirstBean.class;
	//			Object iClass = thisClass.newInstance();
	//			Method thisMethod = thisClass.getDeclaredMethod("getAddress", params);
	//			thisMethod.invoke(iClass, paramsObj);
	//		}
	//		catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//	}
}
