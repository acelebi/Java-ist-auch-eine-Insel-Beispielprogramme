package com.tutego.insel.game.vf;

class Playground {

  public static void main( String[] args ) {
    Room rr = new Room();
    rr.name = "Affenhausen";
    rr.size = 7349944;
    System.out.println( rr.toString() );
    
    GameObject rg = new Room();
    rg.name = "Affenhausen";
    System.out.println( rg.toString() );
    
    Object ro = new Room();
    System.out.println( ro.toString() );
  }
}