package com.tutego.insel.util;

import java.util.BitSet;

public class BitSetDemo {
  public static void main( String[] args ) {
    BitSet bs = new BitSet();
    bs.set( 0 );
    bs.set( 2 );
    System.out.println( bs.get( 0 ) ); // true
    System.out.println( bs.get( 1 ) ); // false
    System.out.println( bs.nextSetBit( 1 ) ); // 2
  }
}
