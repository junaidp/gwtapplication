package com.mamallan.gwtapp.shared.dto; 

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.eclipse.persistence.internal.dynamic.DynamicEntityImpl;
import org.eclipse.persistence.internal.dynamic.DynamicPropertiesManager;




public class DummyBean /*extends DynamicEntityImpl*/ implements Serializable 
{ 

	public DummyBean() {

	}
	public static DynamicPropertiesManager DPM = new DynamicPropertiesManager();
	@Id 
	private int id;
	private String name;
	private String address;
//	private UserEntity user;
	private String gender;
	private boolean notifications;


	public  String getAddress(){ 
		return address;
	}
	public  String getName(){ 
		return name;
	}
	public  int getId(){ 
		return id;
	}
	public  void setName(String arg0){ 
		this.name = arg0;
	}
	public  void setAddress(String arg0){ 
		this.address = arg0;
	}
//	public  UserEntity getUser(){ 
//		return user;
//	}
//	public  void setUser(UserEntity arg0){ 
//		this.user = arg0;
//	}
	public  void setId(int arg0){ 
		this.id = arg0;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isNotifications() {
		return notifications;
	}
	public void setNotifications(boolean notifications) {
		this.notifications = notifications;
	}
//	@Override
//	public DynamicPropertiesManager fetchPropertiesManager() {
//		return DPM;
//	}
}