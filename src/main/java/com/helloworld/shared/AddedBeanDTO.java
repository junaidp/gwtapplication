package com.helloworld.shared;

import java.io.Serializable;
import java.util.ArrayList;

public class AddedBeanDTO implements Serializable {
	
	public AddedBeanDTO(){}

	private String beanName;
	private String packageName;
	private ArrayList<AddedBeanPropertyDTO> listProperties = new ArrayList<AddedBeanPropertyDTO>();
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	public ArrayList<AddedBeanPropertyDTO> getListProperties() {
		return listProperties;
	}
	public void setListProperties(ArrayList<AddedBeanPropertyDTO> listProperties) {
		this.listProperties = listProperties;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
}
