package com.mamallan.gwtapp.shared.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="bindings")

@Entity
public class BindingsEntity   implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bindingId")
	private int bindingId;
	
	@Column(name="bindingName")
	private String bindingName;
	
	@Column(name="bindingType")
	private String bindingType;
	
	@Column(name="bindingValue")
	private String bindingValue;
	
	@JoinColumn(name="nameSpaceId")
	@ManyToOne( fetch = FetchType.LAZY )
	private NameSpaceEntity nameSpaceId;
	
	

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
	

	
	

}
