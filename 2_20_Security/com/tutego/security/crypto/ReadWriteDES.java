package com.tutego.security.crypto;

import java.io.*;
import java.math.BigInteger;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class ReadWriteDES {

  static void encode( byte[] bytes, OutputStream out, String pass )
      throws GeneralSecurityException, IOException {
    Cipher c = Cipher.getInstance( "DES" );
    Key k = new SecretKeySpec( pass.getBytes(), "DES" );
    c.init( Cipher.ENCRYPT_MODE, k );

    try ( OutputStream cos = new CipherOutputStream( out, c ) ) {
      cos.write( bytes );
    }
  }

  static byte[] decode( InputStream is, String pass )
      throws GeneralSecurityException, IOException {
    Cipher c = Cipher.getInstance( "DES" );
    Key k = new SecretKeySpec( pass.getBytes(), "DES" );
    c.init( Cipher.DECRYPT_MODE, k );

    ByteArrayOutputStream bos = new ByteArrayOutputStream( 1024 );

    try ( CipherInputStream cis = new CipherInputStream( is, c ) ) {
      for ( int b; (b = cis.read()) != -1; )
        bos.write( b );
    }

    return bos.toByteArray();
  }

  public static void main( String[] args ) throws Exception {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    encode( "Das wird anders werden".getBytes(), out, "01234567" );

    byte[] encoded = out.toByteArray();
    String s = new BigInteger( encoded ).toString( 16 );
    System.out.println( s );

    byte[] decoded = new BigInteger( s, 16 ).toByteArray();
    InputStream is = new ByteArrayInputStream( decoded );
    System.out.println( new String( decode( is, "01234567" ) ) );
  }
}