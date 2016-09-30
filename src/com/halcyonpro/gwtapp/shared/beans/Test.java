package com.halcyonpro.gwtapp.shared.beans; 
 
import java.io.Serializable; 
 import java.util.*; 
 

//This is a Bean which gets generated at run time from javaBean Editor
public class Test implements Serializable { 
 
public Test() { 
} 
 
private int id;

private String name;


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

 }