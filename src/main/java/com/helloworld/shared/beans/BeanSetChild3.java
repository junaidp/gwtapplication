package com.helloworld.shared.beans; 
 
import java.util.*; 
import java.io.Serializable;
import com.helloworld.shared.entity.MyAccountEntity;
public class BeanSetChild3 implements Serializable
{ 

public BeanSetChild3() {

}

final long serialVersionUID= 1;
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
public  void setName(String arg0){ 
this.name = arg0;
 }
public  String getPassword(){ 
return password;
 }
public  String getUserName(){ 
return userName;
 }
public  void setPassword(String arg0){ 
this.password = arg0;
 }
public  int getStatus(){ 
return status;
 }
public  String getEmail(){ 
return email;
 }
public  int getUserId(){ 
return userId;
 }
public  void setStatus(int arg0){ 
this.status = arg0;
 }
public  String getToken(){ 
return token;
 }
public  void setMyAccountId(MyAccountEntity arg0){ 
this.myAccountId = arg0;
 }
public  void setUserId(int arg0){ 
this.userId = arg0;
 }
public  void setUserName(String arg0){ 
this.userName = arg0;
 }
public  void setEmail(String arg0){ 
this.email = arg0;
 }
public  void setAdmin(boolean arg0){ 
this.admin = arg0;
 }
public  void setToken(String arg0){ 
this.token = arg0;
 }
public  MyAccountEntity getMyAccountId(){ 
return myAccountId;
 }
public  String getUserFetchStatus(){ 
return userFetchStatus;
 }
public  boolean isAdmin(){ 
return admin;
 }
public  void setTokenGeneratedDate(Date arg0){ 
this.tokenGeneratedDate = arg0;
 }
public  void setUserFetchStatus(String arg0){ 
this.userFetchStatus = arg0;
 }
public  Date getTokenGeneratedDate(){ 
return tokenGeneratedDate;
 }
}