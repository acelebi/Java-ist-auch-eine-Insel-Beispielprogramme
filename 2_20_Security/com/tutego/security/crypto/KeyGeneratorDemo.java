package com.tutego.security.crypto;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.KeyPairGenerator;
import java.security.KeyPair;

public class KeyGeneratorDemo {

  public static void main( String[] args ) throws NoSuchAlgorithmException {
    KeyGenerator kg = KeyGenerator.getInstance( "DES" );
    KeyPairGenerator kpg = KeyPairGenerator.getInstance( "RSA" );

    kg.init( 56 );
    kpg.initialize( 1024 );

    SecretKey secKey = kg.generateKey();
    KeyPair keyPair = kpg.genKeyPair();

    System.out.println( secKey ); // com.sun.crypto.provider.DESKey@185da
    System.out.println( keyPair.getPublic() );
    System.out.println( "----" );
    System.out.println( keyPair.getPrivate() );
  }
}
