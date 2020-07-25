package com.tutego.insel.ui.g2d;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class DashWithBasicStroke extends JPanel {

  private static final long serialVersionUID = -3805850234254624464L;

  @Override
  protected void paintComponent( Graphics g ) {
    Graphics2D g2 = (Graphics2D) g;

    g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
                         RenderingHints.VALUE_ANTIALIAS_OFF);

    // Erstes Rechteck

    float[] dash1 = { 1 };

    BasicStroke stroke = new BasicStroke( 2,
      BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER,
      1,
      dash1, 10 );

    g2.setStroke( stroke );

    g2.draw( new Rectangle2D.Float( 50, 50, 50, 50 ) );

    // Zweites Rechteck

    stroke = new BasicStroke( 1,
      BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
      1, new float[]{ 1 }, 0 );

    g2.setStroke( stroke );

    g2.draw( new Rectangle2D.Float( 150, 50, 50, 50 ) );
  }

  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 250, 200 );
    f.add( new DashWithBasicStroke() );
    f.setVisible( true );
  }
}
