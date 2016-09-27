package com.mamallan.gwtapp.shared.entity; 
 
import java.util.*; 
import java.io.Serializable;
import com.mamallan.gwtapp.shared.entity.MyAccountEntity;
public class BeanSetChild3 implements Serializable
{ 

public BeanSetChild3() {

}

final long serialVersionUID = 1;
private int userId;
private String userName;
private String password;
private String name;
private String email;
private int status;
private Date tokenGeneratedDate;
private MyAccountEntity myAccountId;

private boolean admin;
private String token;
private String userFetchStatus;

public  String getName(){ 
return name;
 }
public  void setName(String name){ 
this.name = name;
 }
public  String getEmail(){ 
return email;
 }
public  int getUserId(){ 
return userId;
 }
public  void setStatus(int status){ 
this.status = status;
 }
public  int getStatus(){ 
return status;
 }
public  void setPassword(String password){ 
this.password = password;
 }
public  Date getTokenGeneratedDate(){ 
return tokenGeneratedDate;
 }
public  void setTokenGeneratedDate(Date tokenGeneratedDate){ 
this.tokenGeneratedDate = tokenGeneratedDate;
 }
public  MyAccountEntity getMyAccountId(){ 
return myAccountId;
 }
public  void setMyAccountId(MyAccountEntity myAccountId){ 
this.myAccountId = myAccountId;
 }
public  String getUserFetchStatus(){ 
return userFetchStatus;
 }
public  void setUserFetchStatus(String userFetchStatus){ 
this.userFetchStatus = userFetchStatus;
 }
public  String getToken(){ 
return token;
 }
public  boolean isAdmin(){ 
return admin;
 }
public  void setUserId(int userId){ 
this.userId = userId;
 }
public  void setUserName(String userName){ 
this.userName = userName;
 }
public  void setEmail(String email){ 
this.email = email;
 }
public  void setAdmin(boolean admin){ 
this.admin = admin;
 }
public  void setToken(String token){ 
this.token = token;
 }
public  String getPassword(){ 
return password;
 }
public  String getUserName(){ 
return userName;
 }
}