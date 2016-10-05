package com.halcyonpro.gwtapp.shared.entity; 
 
import java.util.*; 
import java.io.Serializable;
public class BeanSetChild3Child4 implements Serializable
{ 

public BeanSetChild3Child4() {

}

final long serialVersionUID = 1;
private int myAccountId;
private boolean monthlyPaymentPlan;
private boolean quarterlyPaymentPlan;
private boolean yearlyPaymentPlan;
private String registeredTo;
private Date lastEdited;

public  void setRegisteredTo(String registeredTo){ 
this.registeredTo = registeredTo;
 }
public  int getMyAccountId(){ 
return myAccountId;
 }
public  void setMyAccountId(int myAccountId){ 
this.myAccountId = myAccountId;
 }
public  Date getLastEdited(){ 
return lastEdited;
 }
public  void setLastEdited(Date lastEdited){ 
this.lastEdited = lastEdited;
 }
public  boolean isMonthlyPaymentPlan(){ 
return monthlyPaymentPlan;
 }
public  void setMonthlyPaymentPlan(boolean monthlyPaymentPlan){ 
this.monthlyPaymentPlan = monthlyPaymentPlan;
 }
public  boolean isQuarterlyPaymentPlan(){ 
return quarterlyPaymentPlan;
 }
public  void setQuarterlyPaymentPlan(boolean quarterlyPaymentPlan){ 
this.quarterlyPaymentPlan = quarterlyPaymentPlan;
 }
public  boolean isYearlyPaymentPlan(){ 
return yearlyPaymentPlan;
 }
public  void setYearlyPaymentPlan(boolean yearlyPaymentPlan){ 
this.yearlyPaymentPlan = yearlyPaymentPlan;
 }
public  String getRegisteredTo(){ 
return registeredTo;
 }
}