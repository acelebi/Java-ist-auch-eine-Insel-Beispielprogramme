package com.tutego.insel.object.tostring;

public class PlayerToStringDemo {
  
  public static void main( String[] args ) {
    Player tinkerbelle = new Player();
    tinkerbelle.name   = "Tinkerbelle";
    tinkerbelle.age    = 32;
    
    System.out.println( tinkerbelle.toString() );
    System.out.println( tinkerbelle );
  }
}