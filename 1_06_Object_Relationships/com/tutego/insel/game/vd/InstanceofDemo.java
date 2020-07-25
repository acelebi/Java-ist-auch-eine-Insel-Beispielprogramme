package com.tutego.insel.game.vd;

public class InstanceofDemo {

  public static void main( String[] args ) {
    System.out.println( "Toll" instanceof String );       // true
    System.out.println( "Toll" instanceof Object );       // true
    System.out.println( new Player() instanceof Object ); // true
    
    Room       go1 = new Room();
    System.out.println( go1 instanceof Room );       // true
    System.out.println( go1 instanceof GameObject ); // true
    System.out.println( go1 instanceof Object );     // true
    
    GameObject go2 = new Room();
    System.out.println( go2 instanceof Room );       // true
    System.out.println( go2 instanceof GameObject ); // true
    System.out.println( go2 instanceof Object );     // true
    System.out.println( go2 instanceof Player );     // false
    
    Object     go3 = new Room();
    System.out.println( go3 instanceof Room );       // true
    System.out.println( go3 instanceof GameObject ); // true
    System.out.println( go3 instanceof Object );     // true
    System.out.println( go3 instanceof Player );     // false
    System.out.println( go3 instanceof String );     // false

//    System.out.println( "Toll" instanceof StringBuilder );       // Incompatible conditional operand types String and StringBuilder
    
    Object ref1 = new int[ 100 ];
    System.out.println( ref1 instanceof String );        // für den Compiler O.K.
//    System.out.println( new int[100] instanceof String );// mag der Compiler nicht
  }
}