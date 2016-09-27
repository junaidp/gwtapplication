package com.mamallan.gwtapp.shared.beans; 
 
import java.util.*; 
import java.io.Serializable;
import com.mamallan.gwtapp.shared.entity.UserEntity;
import com.mamallan.gwtapp.shared.entity.MyAccountEntity;
public class BeanSet implements Serializable
{ 

public BeanSet() {

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
public  void setName(String name){ 
this.name = name;
 }
public  void setAddress(String address){ 
this.address = address;
 }
public  void setUser(UserEntity user){ 
this.user = user;
 }
public  UserEntity getUser(){ 
return user;
 }
public  MyAccountEntity getMyAccount(){ 
return myAccount;
 }
public  void setId(int id){ 
this.id = id;
 }
public  void setMyAccount(MyAccountEntity myAccount){ 
this.myAccount = myAccount;
 }
}