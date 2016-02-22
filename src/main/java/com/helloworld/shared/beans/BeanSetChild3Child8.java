package com.helloworld.shared.beans; 
 
import java.util.*; 
import java.io.Serializable;
public class BeanSetChild3Child8 implements Serializable
{ 

public BeanSetChild3Child8() {

}

private int myAccountId;
private boolean monthlyPaymentPlan;
private boolean quarterlyPaymentPlan;
private boolean yearlyPaymentPlan;
private String registeredTo;
private Date lastEdited;

public  void setMyAccountId(int arg0){ 
this.myAccountId = arg0;
 }
public  void setRegisteredTo(String arg0){ 
this.registeredTo = arg0;
 }
public  Date getLastEdited(){ 
return lastEdited;
 }
public  String getRegisteredTo(){ 
return registeredTo;
 }
public  int getMyAccountId(){ 
return myAccountId;
 }
public  void setLastEdited(Date arg0){ 
this.lastEdited = arg0;
 }
public  boolean isMonthlyPaymentPlan(){ 
return monthlyPaymentPlan;
 }
public  void setMonthlyPaymentPlan(boolean arg0){ 
this.monthlyPaymentPlan = arg0;
 }
public  boolean isQuarterlyPaymentPlan(){ 
return quarterlyPaymentPlan;
 }
public  void setQuarterlyPaymentPlan(boolean arg0){ 
this.quarterlyPaymentPlan = arg0;
 }
public  boolean isYearlyPaymentPlan(){ 
return yearlyPaymentPlan;
 }
public  void setYearlyPaymentPlan(boolean arg0){ 
this.yearlyPaymentPlan = arg0;
 }
}