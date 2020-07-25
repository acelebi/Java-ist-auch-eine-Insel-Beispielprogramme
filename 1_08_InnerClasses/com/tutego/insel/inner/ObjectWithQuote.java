package com.tutego.insel.inner;

public class ObjectWithQuote {
  public static void main( String[] args ) {
    String s = new Object() {
      String quote( String s ) {
        return String.format( "'%s'", s );
      }
    }.quote( "Cora" );
    System.out.println( s );  // 'Cora'
  }
}

