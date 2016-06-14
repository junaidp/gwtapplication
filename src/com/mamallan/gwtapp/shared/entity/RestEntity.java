package com.mamallan.gwtapp.shared.entity;

import java.io.Serializable;

public class RestEntity implements Serializable{
  private final String id;
  private final String name;
  
  
  public RestEntity() {
    this.id = "222";
    this.name = "ddd";
    
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
