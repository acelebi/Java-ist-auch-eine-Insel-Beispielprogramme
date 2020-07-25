package com.tutego.insel.game.v4;

class Playground {

  public static void main( String[] args ) {
    Player parry = new Player().name( "Parry" ).item( "Helm" );
    System.out.println( parry.name() );                     // Parry
    System.out.println( parry.id() );                       // Parry hat Helm
  }
}
