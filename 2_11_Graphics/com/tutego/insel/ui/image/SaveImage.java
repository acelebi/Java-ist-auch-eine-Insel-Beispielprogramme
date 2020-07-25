package com.tutego.insel.ui.image;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SaveImage {
  public static void main( String[] args ) throws IOException {
    GraphicsConfiguration gfxConf = GraphicsEnvironment.getLocalGraphicsEnvironment()
        .getDefaultScreenDevice().getDefaultConfiguration();

    BufferedImage image = gfxConf.createCompatibleImage( 100, 100 );
    image.createGraphics().fillOval( 0, 0, 100, 100 );

    ImageIO.write( image, "png", new File( "c:/circle.png" ) );
  }
}