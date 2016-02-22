package com.mamallan.gwtapp.shared.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class AddedBeanDTO implements Serializable {
	
	public AddedBeanDTO(){}

	private String beanName;
	private String packageName;
	private ArrayList<AddedBeanPropertyDTO> listProperties = new ArrayList<AddedBeanPropertyDTO>();
	private ArrayList<String> listImports = new ArrayList<String>();
	private ArrayList<AnnotationsDTO> listAnnotationsDTO = new ArrayList<AnnotationsDTO>();
	
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
	public ArrayList<String> getListImports() {
		return listImports;
	}
	public void setListImports(ArrayList<String> listImports) {
		this.listImports = listImports;
	}
	public ArrayList<AnnotationsDTO> getListAnnotationsDTO() {
		return listAnnotationsDTO;
	}
	public void setListAnnotationsDTO(ArrayList<AnnotationsDTO> listAnnotationsDTO) {
		this.listAnnotationsDTO = listAnnotationsDTO;
	}
	
}
