package com.tutego.insel.ui.image;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class Magnifier {
  public static void main( String[] args ) {
    final ImageIcon icon = new ImageIcon();
    final JLabel label = new JLabel( icon );
    
    new Timer( 100, new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        try {
          Rectangle location = new Rectangle( MouseInfo.getPointerInfo().getLocation(), new Dimension( 40, 40 ) );
          location.translate( -20, -20 );
          BufferedImage image = new Robot().createScreenCapture( location );
          icon.setImage( image.getScaledInstance( image.getWidth() * 8, image.getHeight() * 8, Image.SCALE_FAST ) );
          label.repaint();
        }
        catch ( AWTException ae ) { }
      }
    } ).start();
    
    JOptionPane.showMessageDialog( null, label );
  }
}
