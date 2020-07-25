package com.tutego.insel.ui.swing;

import javax.swing.*;

public class JSpinnerDemo {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    f.setLayout( new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS) );

    // Spinner für alle Zahlen zwischen 1 und 10 in Schritten von 0.2

    SpinnerNumberModel model1 = new SpinnerNumberModel( 5.0, 0.0, 10.0, 0.2 );
    JSpinner spin1 = new JSpinner( model1 );

    f.add( spin1 );

    // Spinner mit einem SpinnerListModel gefüllt mit Comedians

    String[] comedians = {
      "Joseph Hader", "Charlie Chaplin", "Vicco von Bülow",
      "Heinz Erhardt", "Michael Mittermeier" };

    SpinnerListModel model2 = new SpinnerListModel( comedians );
    JSpinner spin2 = new JSpinner( model2 );

    f.add( spin2 );

    f.pack();
    f.setVisible( true );
  }
}