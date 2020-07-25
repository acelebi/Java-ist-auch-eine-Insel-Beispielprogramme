package com.tutego.insel.ui.g2d;

import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

class First2D extends JPanel {

  private static final long serialVersionUID = -4072572916176001357L;

  @Override
  protected void paintComponent( Graphics g ) {
    Graphics2D g2 = (Graphics2D) g; 

    g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
                         RenderingHints.VALUE_ANTIALIAS_ON);

    g2.draw( new Line2D.Double( 10, 10, getWidth() - 10, getHeight() - 10 ) );
  }

  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 600, 100 );
    f.add( new First2D() );
    f.setVisible( true );
  }
}