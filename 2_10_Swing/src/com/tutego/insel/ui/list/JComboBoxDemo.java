package com.tutego.insel.ui.list;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    String[] lang = {
      "Patronengurt", "Hausnummer", "Schmetterling", "Sphinx", "Anbetung",
      "Ende"
    };

    // Nicht editierbare JComboBox

    JComboBox<String> combo1 = new JComboBox<>();

    for ( String s : lang )
      combo1.addItem( s );

    combo1.addActionListener( new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        System.out.println( e );
        JComboBox<?> selectedChoice = (JComboBox<?>) e.getSource();
        if ( "Ende".equals( selectedChoice.getSelectedItem() ) )
          System.exit( 0 );
      }
    } );

    frame.add( combo1, BorderLayout.LINE_START );

    // Editable JComboBox

    JComboBox<String> combo2 = new JComboBox<>( lang );
    combo2.setEditable( true );
    combo2.setSelectedItem( "Sphinx" );
    combo2.setMaximumRowCount( 4 );

    frame.add( combo2, BorderLayout.LINE_END );

    frame.pack();
    frame.setVisible( true );
  }
}