package com.helloworld.shared.beans;

import java.io.Serializable;

import com.helloworld.shared.entity.UserEntity;

public class MyFirstBean implements Serializable {
	
	public MyFirstBean(){
		
	}
	
	private int id;
	private String name;
	private String address;
	private UserEntity user;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}

}
