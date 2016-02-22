package com.helloworld.shared.dto;

import java.io.Serializable;

public class BeanExceptionDTO implements Serializable {
	
	private String bean;
	private String field;
	private String expecting;
	private String receiving;
	
	public BeanExceptionDTO(){
			
	}

	public String getBean() {
		return bean;
	}

	public void setBean(String bean) {
		this.bean = bean;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getExpecting() {
		return expecting;
	}

	public void setExpecting(String expecting) {
		this.expecting = expecting;
	}

	public String getReceiving() {
		return receiving;
	}

	public void setReceiving(String receiving) {
		this.receiving = receiving;
	}

}
