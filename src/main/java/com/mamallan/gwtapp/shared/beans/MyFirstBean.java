package com.mamallan.gwtapp.shared.beans; 
 
import java.util.*; 
import java.io.Serializable;

import com.mamallan.gwtapp.shared.entity.MyAccountEntity;
import com.mamallan.gwtapp.shared.entity.UserEntity;
public class MyFirstBean implements Serializable
{ 

public MyFirstBean() {

}

private int id;
private String name;
private String address;
private UserEntity user;

private MyAccountEntity myAccount;


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
public  void setId(int arg0){ 
this.id = arg0;
 }
public  void setAddress(String arg0){ 
this.address = arg0;
 }
public  void setMyAccount(MyAccountEntity arg0){ 
this.myAccount = arg0;
 }
public  UserEntity getUser(){ 
return user;
 }
public  void setUser(UserEntity arg0){ 
this.user = arg0;
 }
public  MyAccountEntity getMyAccount(){ 
return myAccount;
 }
}