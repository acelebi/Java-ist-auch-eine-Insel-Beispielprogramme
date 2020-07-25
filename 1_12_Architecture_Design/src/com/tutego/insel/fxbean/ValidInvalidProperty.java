package com.tutego.insel.fxbean;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.*;

public class ValidInvalidProperty {

  public static void main( String[] args ) {
    StringProperty input  = new SimpleStringProperty( "Wings" );
    BooleanBinding isMale = input.isEqualToIgnoreCase( "m" );
    isMale.addListener( Observable -> System.out.println( "Invalid" ) );
    input.set( "male" );
    input.set( "m" );
    System.out.println( isMale.get() );   // true
    input.set( "f" );
  }
}
