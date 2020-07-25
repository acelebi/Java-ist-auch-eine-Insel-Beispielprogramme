package com.tutego.insel.fxbean;

import javafx.beans.InvalidationListener;
import javafx.beans.value.*;

public class PersonProperty {
  public static void main( String[] args ) {
    Person chris = new Person();
    chris.setName( "Chris" );
    chris.setAge( 102 );
    
    System.out.println( chris.nameProperty().getName() );
    System.out.println( chris.nameProperty().getBean() );
    
    InvalidationListener invalidationListener =
        observable -> System.out.println( "Änderung am " + observable );
    chris.nameProperty().addListener( invalidationListener );
    chris.ageProperty().addListener( invalidationListener );
    ChangeListener<String> changeListener =
        (observable, oldValue, newValue) -> System.out.printf( "%s -> %s%n", oldValue, newValue );
    chris.nameProperty().addListener( changeListener );
    
    chris.setName( "Cora" );
    chris.setAge( 52 );
  }
}