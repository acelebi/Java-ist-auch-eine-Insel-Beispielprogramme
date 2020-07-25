package com.tutego.insel.ui.layout;

import java.awt.*;
import java.text.*;
import javax.swing.*;

public class GridLayoutDemo {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    f.setLayout( new GridLayout( 3, 2, 6, 3 ) );

    f.add( new JLabel( " Wie heißt du denn, mein Kleiner?" ) );
    f.add( new JTextField() );
    f.add( new JLabel( " Na, wie alt bist du denn?" ) );
    f.add( new JFormattedTextField( NumberFormat.getIntegerInstance() ) );
    f.add( new JLabel( " Dann mal das Passwort eingeben:" ) );
    f.add( new JPasswordField() );

    f.pack();
    f.setVisible( true );
  }
}