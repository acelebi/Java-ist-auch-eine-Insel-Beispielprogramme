package com.tutego.insel.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

public class SeekableByteChannelDemo {
  public static void main( String[] args ) throws IOException {
    try ( SeekableByteChannel raf = Files.newByteChannel( Paths.get( "Kurt Cobain.txt" ),
                                                          StandardOpenOption.CREATE,
                                                          StandardOpenOption.WRITE ) ) {
      String s = "Drugs are bad for you. ";
      ByteBuffer byteBuffer = ByteBuffer.wrap( s.getBytes() );
      raf.write( byteBuffer );
      raf.write( ByteBuffer.wrap( "They will f*ck you up.".getBytes() ) );
      raf.position( 34 );
      raf.write( ByteBuffer.wrap( new byte[]{'u'} ) );
    }
  }
}
