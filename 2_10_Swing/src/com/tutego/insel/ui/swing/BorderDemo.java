package com.tutego.insel.ui.swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setLayout( new GridLayout( 0, 2, 10, 10 ) );

    JButton b1 = new JButton( "Schamlis" );
    b1.setBorder( new BevelBorder( BevelBorder.RAISED ) );
    frame.add( b1 );

    JButton b2 = new JButton( "Borfluq" );
    b2.setBorder( new BevelBorder( BevelBorder.LOWERED ) );
    frame.add( b2 );

    JButton b3 = new JButton( "Tüm Tüm de Lüm" );
    b3.setBorder( BorderFactory.createEtchedBorder() );
    frame.add( b3 );

    JButton b4 = new JButton( "Skromm" );
    b4.setBorder( new EtchedBorder( Color.BLUE, Color.YELLOW ) );
    frame.add( b4 );

    frame.setSize( 500, 200 );
    frame.setVisible( true );
  }
}