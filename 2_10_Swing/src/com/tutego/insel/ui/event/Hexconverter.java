package com.tutego.insel.ui.event;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Hexconverter {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setLayout( new FlowLayout() );

    final JTextField decTextField = new JTextField();
    decTextField.setColumns( 5 );
    frame.add( decTextField );
    frame.add( new JLabel( " ist hexadezimal " ) );
    final JTextField hexTextField = new JTextField();
    hexTextField.setColumns( 5 );
    frame.add( hexTextField );
    JButton okButton = new JButton( "Konvertiere" );
    frame.add( okButton );

    okButton.addActionListener( new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        int dec = Integer.parseInt( decTextField.getText() );
        String hex = Integer.toHexString( dec );
        hexTextField.setText( hex );
      }
    } );

    frame.pack();
    frame.setVisible( true );
  }
}