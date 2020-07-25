package com.tutego.insel.io.zip;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.zip.*;

public class InflaterDeflaterDemo {

  public static void main( String[] args ) throws DataFormatException {
    byte[] input = "aaaaaaaaaaaaaaaa".getBytes();
    
    System.out.printf( "%X%n", new BigInteger( 1, input ) );
    
    // Komprimieren
    
    byte[] output = new byte[100];
    Deflater compresser = new Deflater( Deflater.BEST_COMPRESSION );
    compresser.setInput( input );
    compresser.finish();
    int compressedBytes = compresser.deflate( output );
    
    System.out.printf( "%X%n", new BigInteger( 1, Arrays.copyOf( output, compressedBytes ) ) );
    
    // Dekomprimieren
    
    Inflater decompresser = new Inflater();
    decompresser.setInput( output, 0, compressedBytes );
    byte[] result = new byte[100];
    int uncompressedBytes = decompresser.inflate( result );
    decompresser.end();
    
    System.out.printf( "%X%n", new BigInteger( 1, Arrays.copyOf( result, uncompressedBytes ) ) );
  }
}