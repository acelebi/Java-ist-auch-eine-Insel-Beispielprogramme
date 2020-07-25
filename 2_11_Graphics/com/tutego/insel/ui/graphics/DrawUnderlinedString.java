package com.tutego.insel.ui.graphics;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.font.LineMetrics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawUnderlinedPanel extends JPanel {
  
  private static final long serialVersionUID = -213175183131217509L;

  @Override protected void paintComponent( Graphics g ) {
    super.paintComponent( g );

    g.setFont( new Font("Verdana", Font.PLAIN, 30) );
    drawUnderlinedString( g, 10, 50, "Hallo Welt." );
  }

  public static void drawUnderlinedString( Graphics g, int x, int y, String s ) {
    g.drawString( s, x, y );
  
    FontMetrics fm = g.getFontMetrics();
    LineMetrics lm = fm.getLineMetrics( s, g );
  
    g.fillRect( x, y + (int) lm.getUnderlineOffset(),
                fm.stringWidth(s), (int) lm.getUnderlineThickness() );
  }
}

public class DrawUnderlinedString {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 200, 100 );
    f.add( new DrawUnderlinedPanel() );
    f.setVisible( true );
  }
}