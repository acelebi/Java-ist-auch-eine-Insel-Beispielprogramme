package com.tutego.insel.game.vi;

class Playground {

  public static void main( String[] args ) {
    Door door = new Door();
    door.id = 12;

    Key  key1 = new Key();
    key1.id = 99;

    Key  key2 = new Key();
    key2.id = 12;

    System.out.printf( "erfolgreich=%b%n", key1.useOn(door) );
    System.out.printf( "erfolgreich=%b, isOpen=%b%n", key2.useOn(door), door.isOpen );
    System.out.printf( "erfolgreich=%b%n", door.useOn(key1) );
  }
}