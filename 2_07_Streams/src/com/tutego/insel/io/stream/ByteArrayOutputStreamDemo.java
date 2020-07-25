package com.tutego.insel.io.stream;

import java.io.*;

public class ByteArrayOutputStreamDemo {
  public static void main( String[] args ) throws IOException {
    try ( ByteArrayOutputStream baos = new ByteArrayOutputStream();
          DataOutputStream out = new DataOutputStream( baos ) ) {
      // Header
      out.write( 'G' ); out.write( 'I' ); out.write( 'F' );
      out.write( '8' ); out.write( '9' ); out.write( 'a' );
      // Logical Screen Descriptor
      out.writeChar( 128 );   // Logical Screen Width  (Unsigned)
      out.writeChar( 37 );    // Logical Screen Height (Unsigned)
      // <Packed Fields>, Background Color Index, Pixel Aspect Ratio
      // and so on.
      out.flush();
      
      byte[] result = baos.toByteArray();
      System.out.println( new String(result) );  // GIF89a ...
    }
  }
}