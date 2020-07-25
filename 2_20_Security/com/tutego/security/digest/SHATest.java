package com.tutego.security.digest;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;

class SHATest {
  public static void main( String[] args ) throws Exception {
    MessageDigest md = MessageDigest.getInstance( "SHA" );
    byte[] digest1 = md.digest( "abc".getBytes( StandardCharsets.UTF_8 ) );
    System.out.printf( "%032X%n", new BigInteger( 1, digest1 ) );
    byte[] digest2 = md.digest( "Abc".getBytes( StandardCharsets.UTF_8 ) );
    System.out.printf( "%032X%n", new BigInteger( 1, digest2 ) );
    byte[] digest3 = md.digest( "abd".getBytes( StandardCharsets.UTF_8 ) );
    System.out.printf( "%032X%n", new BigInteger( 1, digest3 ) );
  }
}