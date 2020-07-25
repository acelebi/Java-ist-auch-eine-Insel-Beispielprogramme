package com.tutego.insel.generic;

public class PocketPlayer {
  
  @SuppressWarnings("unused")
  public static void main( String[] args ) {
    Pocket<Integer>  intPocket     = new Pocket<Integer>();
    Pocket<String>   stringPocket  = new Pocket<String>();
    
    intPocket.set( 1 );
    int x = intPocket.get();
    
    stringPocket.set( "Selbstzerstörungsauslösungsschalterhintergrundbeleuchtungsglühlampensicherungshalterschraube" );
    String s = stringPocket.get();

    Pocket<Pocket<String>> pocketOfPockets = new Pocket<Pocket<String>>();
    pocketOfPockets.set( new Pocket<String>() );
    pocketOfPockets.get().set( "Inner Pocket<String>" );
    System.out.println( pocketOfPockets.get().get() ); // Inner Pocket<String>
  }    
}