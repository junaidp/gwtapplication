package com.helloworld.server;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import com.helloworld.shared.AddedBeanDTO;

public class FilesCreationHelper {

	public String generateBean(AddedBeanDTO addedBeanDTO) throws Exception{
		try{

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
			sb.append("public class "+addedBeanDTO.getBeanName()+" { \n");
			sb.append("public "+ addedBeanDTO.getBeanName()+"() { \n");
			sb.append("} \n");
			for(int i=0; i< addedBeanDTO.getListProperties().size(); i++){
				sb.append(addedBeanDTO.getListProperties().get(i).getModifier()+" "+addedBeanDTO.getListProperties().get(i).getDataType()+" "+ addedBeanDTO.getListProperties().get(i).getName()+";");
				sb.append("\n");
			}
			sb.append("\n");

			for(int i=0; i< addedBeanDTO.getListProperties().size(); i++){
				String fieldName =addedBeanDTO.getListProperties().get(i).getName();
				fieldName = Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);	
				if(addedBeanDTO.getListProperties().get(i).getGetterSetter().equals("Both")){
					sb.append(addedBeanDTO.getListProperties().get(i).getModifier()+" "+ addedBeanDTO.getListProperties().get(i).getDataType()+" ");
					sb.append("get"+ fieldName+"() {\n");
					sb.append("return "+ addedBeanDTO.getListProperties().get(i).getName()+"; \n");
					sb.append("} \n");
					sb.append(addedBeanDTO.getListProperties().get(i).getModifier()+" void ");
					sb.append("set"+ fieldName+"("+ addedBeanDTO.getListProperties().get(i).getDataType()+" "+addedBeanDTO.getListProperties().get(i).getName()+") { ");
					sb.append("\n");
					sb.append("this."+addedBeanDTO.getListProperties().get(i).getName()+" = "+ addedBeanDTO.getListProperties().get(i).getName()+";");
					sb.append("\n }");
				}
				else if(addedBeanDTO.getListProperties().get(i).getGetterSetter().equals("Getters")){
					sb.append(addedBeanDTO.getListProperties().get(i).getModifier()+" "+ addedBeanDTO.getListProperties().get(i).getDataType()+" ");
					sb.append("get"+ fieldName+"() {\n");
					sb.append("return "+ addedBeanDTO.getListProperties().get(i).getName()+"; \n");
					sb.append("} \n");
				}
				else if(addedBeanDTO.getListProperties().get(i).getGetterSetter().equals("Setters")){
					sb.append(addedBeanDTO.getListProperties().get(i).getModifier()+" void ");
					sb.append("set"+ fieldName+"("+ addedBeanDTO.getListProperties().get(i).getDataType()+" "+addedBeanDTO.getListProperties().get(i).getName()+") { ");
					sb.append("\n");
					sb.append("this."+addedBeanDTO.getListProperties().get(i).getName()+" = "+ addedBeanDTO.getListProperties().get(i).getName()+";");
					sb.append("\n }");
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



}
