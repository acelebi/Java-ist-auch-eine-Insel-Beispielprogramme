package com.tutego.insel.ui.layout;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    // f.applyComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );

    f.setLayout( new BorderLayout( 5, 5 ) );

    f.add( new JButton( "Nie" ), BorderLayout.PAGE_START );
    f.add( new JButton( "ohne" ), BorderLayout.LINE_END );
    f.add( new JButton( "Seife" ), BorderLayout.PAGE_END );
    f.add( new JButton( "waschen" ), BorderLayout.LINE_START );
    f.add( new JButton( "Center" ) );

    f.setSize( 400, 150 );
    f.setVisible( true );
  }
}
