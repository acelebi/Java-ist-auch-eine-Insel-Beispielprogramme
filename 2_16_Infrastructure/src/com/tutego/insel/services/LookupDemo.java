package com.tutego.insel.services;

public class LookupDemo {
  public static void main( String[] args ) {
    System.out.println( Lookup.lookup( Greeter.class ).greet( "Chris" ) );// Moin Chris!
    System.out.println( Lookup.lookupAll( Greeter.class ).size() );       // 1
    System.out.println( Lookup.lookupAll( Greeter.class ) );              // [com.tutego.insel.services.FrisianGreeter@42e816]
  }
}
