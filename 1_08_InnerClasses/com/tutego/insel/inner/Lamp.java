package com.tutego.insel.inner;

public class Lamp {

  static String s = "Huhu";
  int i = 1;

  static class Bulb {
    void output() {
      System.out.println( s );
//      System.out.println( i );   // Compiler error because i is not static
    }
  }

  public static void main( String[] args ) {
    Bulb bulp = new Lamp.Bulb();  // or Lamp.Bulb bulp = ...
    bulp.output();
  }
}