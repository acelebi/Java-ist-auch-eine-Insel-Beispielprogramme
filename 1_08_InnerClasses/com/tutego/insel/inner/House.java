package com.tutego.insel.inner;

@SuppressWarnings("unused")
class House {

  private String owner = "Ich";
  private int    size;

  class Room {
    void ok() {
      System.out.println( owner );
      System.out.println( size );
    }
//    static void error() { }   // The method error cannot be declared static; static methods can only be declared in a static or top level type
  }

  public static void main( String[] args ) {
    House h = new House();
    Room  r = h.new Room();
//    Room  r = new House().new Room();
  }
}
