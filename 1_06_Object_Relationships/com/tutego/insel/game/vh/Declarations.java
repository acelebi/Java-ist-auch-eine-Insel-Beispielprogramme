package com.tutego.insel.game.vh;

public class Declarations {

  @SuppressWarnings("unused")
  public static void main( String[] args ) {
    GameObject   go1 = new Room();
    GameObject   go2 = new Player();
    GameObject[] gos = { new Player(), new Room() };
  }
}
