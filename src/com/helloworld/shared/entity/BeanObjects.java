package com.helloworld.shared.entity;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Table(name="beanobjects")

@Entity
public class BeanObjects   implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="beanId")
	private int beanId;
	
	@Column(name="beanName")
	private String beanName;
	
	@Column(name="beanObject")
	@Lob
	private Blob beanObject;

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

	public Blob getBeanObject() {
		return beanObject;
	}

	public void setBeanObject(Blob beanObject) {
		this.beanObject = beanObject;
	}

	


}
