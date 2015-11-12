package com.helloworld.server;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class FilesCreationHelper {
	
	public void generateBean(){
		Package[] packages = Package.getPackages();
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
		writer.write(sb+"");
		writer.close();
	}
	
	

}
