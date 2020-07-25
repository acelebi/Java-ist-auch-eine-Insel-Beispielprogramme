package com.tutego.insel.nio.channels;

import java.io.IOException;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.charset.*;
import java.nio.file.*;

public class FileChannelDemo {
  public static void main( String[] args ) throws IOException {
    Path p = Paths.get( "Kurt Cobain.txt" );
    try ( FileChannel fileChannel =
           (FileChannel) Files.newByteChannel( p, StandardOpenOption.READ ) ) {
      ByteBuffer byteBuffer = fileChannel.map( FileChannel.MapMode.READ_ONLY, 0,
                                               fileChannel.size() );
    
      CharsetDecoder decoder = StandardCharsets.ISO_8859_1.newDecoder();
      CharBuffer charBuffer = decoder.decode( byteBuffer );        
      
      while ( charBuffer.hasRemaining() )
        System.out.print( charBuffer.get() );
    }
  }
}