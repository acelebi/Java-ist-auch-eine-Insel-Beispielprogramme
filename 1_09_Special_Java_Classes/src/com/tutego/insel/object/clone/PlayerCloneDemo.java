package com.tutego.insel.object.clone;

public class PlayerCloneDemo {
  
  public static void main( String[] args ) {
    Player susi = new Player();
    susi.age  = 29;
    susi.name = "Susi";
    
    Player dolly = susi.clone();
    
    System.out.println( dolly.name + " ist " + dolly.age ); // Susi ist 29
  }
}