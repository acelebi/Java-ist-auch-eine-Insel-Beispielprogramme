package com.tutego.insel.java.lang;

import java.util.*;

class Person {
  private Person spouse;

  public void setSpouse( Person spouse ) {
    this.spouse = Objects.requireNonNull( spouse );
  }

  public void removeSpouse() {
    spouse = null;
  }

  public Optional<Person> getSpouse() {
    return Optional.ofNullable( spouse );
  }
}