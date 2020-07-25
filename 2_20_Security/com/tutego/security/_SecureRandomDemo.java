package com.tutego.security;

import java.security.*;

public class _SecureRandomDemo {
  /**
   * Generieren eines 160-bit Zufallswertes
   */
  public static void main( String[] args ) throws Exception {
    SecureRandom random = SecureRandom.getInstance( "SHA1PRNG" );

    byte[] seed = random.generateSeed( 20 );
    random.setSeed( seed );

    byte[] bytes = new byte[20];
    random.nextBytes( bytes );

    for ( byte b : bytes )
      System.out.printf( "%02x", b );
  }
}