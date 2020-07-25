package com.tutego.insel.ui.image;

import java.awt.*;
import java.awt.image.*;

public class ImageDiffs {
  public static void main( String args[] ) throws Exception {
    Rectangle screenSize = new Rectangle( Toolkit.getDefaultToolkit().getScreenSize() );

    BufferedImage image1 = new Robot().createScreenCapture( screenSize );

    while ( true ) {
      Thread.sleep( 1000 );

      BufferedImage image2 = new Robot().createScreenCapture( screenSize );

      DataBuffer dataBuffer1 = image1.getRaster().getDataBuffer();
      DataBuffer dataBuffer2 = image2.getRaster().getDataBuffer();

      int total = dataBuffer1.getSize(), diff = 0;

      for ( int i = 0; i < total; i++ )
        if ( dataBuffer1.getElem( i ) != dataBuffer2.getElem( i ) )
          diff++;

      System.out.printf( "Pixel total=%d, unterschiedliche Pixel=%d, Unterschied=%.2f%%%n", total,
                         diff, (double) 100 * diff / total );

      image1 = image2;
    }
  }
}
