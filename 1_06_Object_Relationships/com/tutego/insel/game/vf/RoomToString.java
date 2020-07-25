package com.tutego.insel.game.vf;

public class RoomToString {
  public static void main( String[] args ) {
    Room enterprise = new Room();
    enterprise.name = "Enterprise";
    enterprise.size = 725;
    System.out.println( enterprise ); // Room[name=Enterprise][size=725]
  }
}
