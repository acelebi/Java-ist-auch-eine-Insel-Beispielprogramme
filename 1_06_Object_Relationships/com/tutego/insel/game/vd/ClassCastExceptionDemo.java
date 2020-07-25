package com.tutego.insel.game.vd;

public class ClassCastExceptionDemo {

  public static void main( String[] args ) {
    GameObject go        = new Player();
    Room       cubbyhole = (Room) go;
    System.out.println( cubbyhole.size );
  }
}
