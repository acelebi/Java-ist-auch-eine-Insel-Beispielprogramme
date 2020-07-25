package com.tutego.insel.ui.image;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Locale;
import javax.imageio.*;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.ImageOutputStream;

class ImageWriterDemo {
  public static void main( String[] args ) throws Exception {
    BufferedImage img = new Robot().createScreenCapture(
          new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );

    int size = 0;

    for ( float quality = 1f; quality >= 0; quality -= 0.25 ) {
      ByteArrayOutputStream out = new ByteArrayOutputStream( 0xfff );

      writeImage( img, out, quality );

      if ( size == 0 ) size = out.size();

      System.out.printf( "Qualität: %.1f – Größe: %,.0f k – Verhältnis: %.2f%n",
                         quality, (double) out.size() / 1024,
                         (double) out.size() / size );
    }
  }

  private static void writeImage( BufferedImage img,
                                  ByteArrayOutputStream out,
                                  float quality ) throws IOException {
    ImageWriter writer = ImageIO.getImageWritersByFormatName( "jpg" ).next();
    try ( ImageOutputStream ios = ImageIO.createImageOutputStream( out ) ) {
      writer.setOutput( ios );
      ImageWriteParam iwparam = new JPEGImageWriteParam( Locale.getDefault() );
      iwparam.setCompressionMode( ImageWriteParam.MODE_EXPLICIT ) ;
      iwparam.setCompressionQuality( quality );
      writer.write( null, new IIOImage(img, null, null), iwparam );
      ios.flush();
      writer.dispose();
    }
  }
}