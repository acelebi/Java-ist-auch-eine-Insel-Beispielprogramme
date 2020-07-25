package com.tutego.insel.util.map;

import java.util.Properties;

class PropertiesDemo {
  public static void main( String[] args ) {
    Properties defaultProperties = new Properties(),
               userProperties = new Properties( defaultProperties );

    defaultProperties.setProperty( "User", "C.Ullenboom" );
    defaultProperties.setProperty( "Password", "(nicht gesetzt)" );
    userProperties.setProperty( "Password", "SagIchNet" );

    System.out.println( "Default Properties:" );
    defaultProperties.list( System.out );

    System.out.printf( "%nUser Properties:%n" );
    userProperties.list( System.out );

    System.out.printf( "Property 'User' is '%s'%n",
                        userProperties.getProperty( "User" ) );
  }
}