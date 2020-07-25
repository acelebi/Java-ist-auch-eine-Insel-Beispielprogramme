package com.tutego.insel.io.stream;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import java.io.*;
import java.math.BigInteger;
import java.nio.file.*;
import java.security.*;
import java.util.Scanner;

public class ChainedReader {
  public static void main( String[] args ) {
    try ( InputStream       fis = Files.newInputStream( Paths.get( "lyrics.txt" ) );
          InputStream       bis = new BufferedInputStream( fis );
          DigestInputStream dis = new DigestInputStream( bis,
                                                         MessageDigest.getInstance("SHA-256") );
          Reader            isr = new InputStreamReader( dis, ISO_8859_1 );
          Scanner scanner = new Scanner( isr ) ) {
      while ( scanner.hasNextLine() )
        System.out.println( scanner.nextLine() );
      System.out.printf( "%X", new BigInteger( 1, dis.getMessageDigest().digest() ) );
    }
    catch ( IOException e ) {
      System.err.println( "Konnte Datei nicht einlesen!" );
      e.printStackTrace();
    }
    catch ( NoSuchAlgorithmException e ) {
      System.err.println( "SHA-256 ist unbekannt!" );
    }
  }
}