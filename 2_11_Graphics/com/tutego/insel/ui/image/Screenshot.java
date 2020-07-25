package com.tutego.insel.ui.image;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Screenshot {
  public static void main( String[] args ) throws Exception {
    Thread.sleep( 2000 );

    BufferedImage bi = new Robot().createScreenCapture( new Rectangle( Toolkit.getDefaultToolkit().getScreenSize() ) );

    ImageIO.write( bi, "jpg", new File( "c:/screenshot.jpg" ) );

    System.exit( 0 );
  }
}