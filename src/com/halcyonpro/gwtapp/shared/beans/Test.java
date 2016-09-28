package com.halcyonpro.gwtapp.shared.beans; 
 
import java.io.Serializable; 
 import java.util.*; 
 


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