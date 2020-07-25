package com.tutego.insel.object.tostring;

public class Player {
  
  String name;
  int    age;

  @Override
  public String toString() {
    return getClass().getName() +
           "[name=" + name +
           ",age=" + age + "]";
  }
}
