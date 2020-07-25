package com.tutego.insel.fxbean;

import javafx.beans.property.*;

public class Person {

  private final StringProperty name = new SimpleStringProperty(); //( this, "name" );
  private final IntegerProperty age = new SimpleIntegerProperty();

  public StringProperty nameProperty() { return name; }
  public String getName() { return name.get(); }
  public void setName( String name ) { this.name.set( name ); }

  public IntegerProperty ageProperty() { return age; }
  public int getAge() { return age.get(); }
  public void setAge( int age ) { this.age.set( age ); }
}