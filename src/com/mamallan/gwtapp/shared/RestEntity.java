package com.mamallan.gwtapp.shared;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

public class RestEntity {
  private final String id;
  private final String name;
  
  @JsonCreator
  public RestEntity(@JsonProperty("id") String id, @JsonProperty("name") String name) {
    this.id = id;
    this.name = name;
    
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
