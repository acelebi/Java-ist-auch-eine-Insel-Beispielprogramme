package com.tutego.insel.nongeneric;

public class PlayerPocketDemo {
  
  public static void main( String[] args ) {
    Player michael = new Player();
    michael.name = "Omar Arnold";
    Pocket pocket = new Pocket();
    Long aBigNumber = 11111111111111L;
    pocket.set( aBigNumber );
    michael.leftPocket  = pocket;
    michael.rightPocket = new Pocket( 2222222222222222222L );
    
    System.out.println( michael.name + " hat in den Taschen " +
                        michael.leftPocket.get() + " und " + michael.rightPocket.get() );
    
    Long val1 = (Long) michael.leftPocket.get();
    Long val2 = (Long) michael.rightPocket.get();
    
    System.out.println( val1.compareTo( val2 ) > 0 ? "Links" : "Rechts" );
  }
}