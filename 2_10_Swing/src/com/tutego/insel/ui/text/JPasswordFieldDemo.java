package com.tutego.insel.ui.text;

import javax.swing.*;

public class JPasswordFieldDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    JPasswordField pass = new JPasswordField( 15 );
    // pass.setEchoChar( '#' );
    frame.add( pass );

    frame.pack();
    frame.setVisible( true );
  }
}