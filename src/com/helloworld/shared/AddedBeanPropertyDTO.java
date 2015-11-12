package com.helloworld.shared;

import java.io.Serializable;

public class AddedBeanPropertyDTO implements Serializable{
	
	public AddedBeanPropertyDTO(){}
	
	private String modifier;
	private String name;
	private String dataType;
	private String getterSetter;
	
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getGetterSetter() {
		return getterSetter;
	}
	public void setGetterSetter(String getterSetter) {
		this.getterSetter = getterSetter;
	}
	
}
