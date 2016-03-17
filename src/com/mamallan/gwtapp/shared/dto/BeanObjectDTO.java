package com.mamallan.gwtapp.shared.dto;

import java.io.Serializable;

public class BeanObjectDTO implements Serializable{
	
	private int beanId;
	private String beanName;
	private String beanJson;
	
	public BeanObjectDTO(){
		
	}

	public int getBeanId() {
		return beanId;
	}

	public void setBeanId(int beanId) {
		this.beanId = beanId;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanJson() {
		return beanJson;
	}

	public void setBeanJson(String beanJson) {
		this.beanJson = beanJson;
	}

}
