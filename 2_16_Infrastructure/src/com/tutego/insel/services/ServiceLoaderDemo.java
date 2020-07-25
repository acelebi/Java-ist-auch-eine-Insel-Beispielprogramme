package com.tutego.insel.services;

import java.util.ServiceLoader;

public class ServiceLoaderDemo {
  public static void main( String[] args ) {
    ServiceLoader<Greeter> greeterServices = ServiceLoader.load( Greeter.class );

    for ( Greeter greeter : greeterServices )
      System.out.println( greeter.getClass() + " : " + greeter.greet( "Chris" ) );
  }
}
