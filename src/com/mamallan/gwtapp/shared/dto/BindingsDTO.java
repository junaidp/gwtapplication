package com.mamallan.gwtapp.shared.dto;

import java.io.Serializable;

import com.mamallan.gwtapp.shared.entity.NameSpaceEntity;

public class BindingsDTO implements Serializable{

	
    private int bindingId;
	private String bindingName;
	private String bindingType;
	private String bindingValue;
	private NameSpaceEntity nameSpaceId;
	private String bindingValue_ext;
	private char type;
	private int beanId;
	
	public int getBindingId() {
		return bindingId;
	}
	public void setBindingId(int bindingId) {
		this.bindingId = bindingId;
	}
	public String getBindingName() {
		return bindingName;
	}
	public void setBindingName(String bindingName) {
		this.bindingName = bindingName;
	}
	public String getBindingType() {
		return bindingType;
	}
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	public String getBindingValue() {
		return bindingValue;
	}
	public void setBindingValue(String bindingValue) {
		this.bindingValue = bindingValue;
	}
	public NameSpaceEntity getNameSpaceId() {
		return nameSpaceId;
	}
	public void setNameSpaceId(NameSpaceEntity nameSpaceId) {
		this.nameSpaceId = nameSpaceId;
	}
	public String getBindingValue_ext() {
		return bindingValue_ext;
	}
	public void setBindingValue_ext(String bindingValue_ext) {
		this.bindingValue_ext = bindingValue_ext;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public int getBeanId() {
		return beanId;
	}
	public void setBeanId(int beanId) {
		this.beanId = beanId;
	}
	
}
