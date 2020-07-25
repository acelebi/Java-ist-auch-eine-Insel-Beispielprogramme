package com.tutego.insel.ui.awt;

import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;

public class TranslucentNonRectFrame {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setSize( 100, 100 );
    f.setOpacity( 0.5F );
    f.setShape( new Ellipse2D.Float( 0.0F, 0.0F, 100.0F, 100.0F ) );
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setVisible( true );
  }
}
