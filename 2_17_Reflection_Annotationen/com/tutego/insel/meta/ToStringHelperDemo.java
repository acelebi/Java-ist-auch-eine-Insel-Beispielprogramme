package com.tutego.insel.meta;

class Ober {
  int i = 123;
  /* private */double d = 3.1415;
}

public class ToStringHelperDemo extends Ober {
  String hello = "world";
  int    i     = 42;

  public static void main( String[] args ) {
    ToStringHelperDemo t = new ToStringHelperDemo();

    System.out.println( ToStringHelper.toString( t ) );
    // com.tutego.insel.meta.ToStringHelperDemo[hello=world, i=42, i=123, d=3.1415]
  }
}