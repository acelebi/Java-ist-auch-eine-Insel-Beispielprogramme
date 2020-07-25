package com.tutego.insel.ui.g2d;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class LineJoins extends JPanel {
  
  private static final long serialVersionUID = -7867436326685211603L;

  @Override
  protected void paintComponent( Graphics g ) {
    Graphics2D g2 = (Graphics2D) g;
    
    g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
                         RenderingHints.VALUE_ANTIALIAS_ON);
  
    BasicStroke stroke = new BasicStroke( 20, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL );
    g2.setStroke( stroke );
  
    Path2D shape = new GeneralPath();
    shape.moveTo( 25, 25 ); shape.lineTo( 50, 100 ); shape.lineTo( 75, 25 );
    g2.draw( shape );
  
    //
  
    stroke = new BasicStroke( 20, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER );
    g2.setStroke( stroke );
  
    shape = new GeneralPath();
    shape.moveTo( 25+100, 25 ); shape.lineTo( 50+100, 100 ); shape.lineTo( 75+100, 25 );
    g2.draw( shape );
  
    //
  
    stroke = new BasicStroke( 20, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND );
    g2.setStroke( stroke );
  
    shape = new GeneralPath();
    shape.moveTo( 25+200, 25 ); shape.lineTo( 50+200, 100 ); shape.lineTo( 75+200, 25 );
    g2.draw( shape );
  }

  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 320, 200 );
    f.add( new LineJoins() );
    f.setVisible( true );
  }
}
