package com.tutego.insel.ui.swing;

import java.awt.BorderLayout;
import javax.swing.*;

public class JRadioButtonDemo {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    JRadioButton rb1 = new JRadioButton( "schwarz " );
    f.add( rb1, BorderLayout.PAGE_START );
    JRadioButton rb2 = new JRadioButton( "weiß" );
    f.add( rb2, BorderLayout.PAGE_END );

    rb1.setSelected( true );

    // Setze die Radio-Buttons auf die ButtonGroup

    ButtonGroup g = new ButtonGroup();
    g.add( rb1 );
    g.add( rb2 );

    f.pack();
    f.setVisible( true );
  }
}