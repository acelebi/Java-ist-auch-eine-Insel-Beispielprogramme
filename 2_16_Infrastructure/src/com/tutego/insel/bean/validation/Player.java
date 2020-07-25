package com.tutego.insel.bean.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Player {

  private String name;

  @Min(10)
  @Max(110)
  private int    age;
  
  public void setName( String name ) {
    this.name = name;
  }

  @NotNull
  public String getName() {
    return name;
  }

  public void setAge( int age ) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}
