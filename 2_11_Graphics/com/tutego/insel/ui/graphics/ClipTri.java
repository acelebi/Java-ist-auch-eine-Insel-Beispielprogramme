package com.tutego.insel.ui.graphics;

import java.awt.*;
import javax.swing.*;

public class ClipTri extends JPanel {

  private static final long serialVersionUID = 4984632756244747274L;

  @Override protected void paintComponent( Graphics g ) {
    super.paintComponent( g );
  
    Rectangle r = g.getClipBounds();
  
    System.out.println( r );
  
    Polygon p = new Polygon(
        new int[] { 200, 100, 300 },
        new int[] { 100, 300, 300},
        3 );
  
    g.setClip( p );
  
    g.setColor( Color.ORANGE );
    g.fillRect( 0, 0, 500, 500 );
  }

  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 400, 400 );
    f.add( new ClipTri() );
    f.setVisible( true );
  }
}