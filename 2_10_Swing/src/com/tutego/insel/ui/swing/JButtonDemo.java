package com.tutego.insel.ui.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setLayout( new FlowLayout() );
    
    // Button 1
    
    final Icon icon1 = new ImageIcon( JButtonDemo.class.getResource( "/images/user-trash-full.png" ) );
    final Icon icon2 = new ImageIcon( JButtonDemo.class.getResource( "/images/user-trash.png" ) );
    
    final JButton button1 = new JButton( icon1 );
    frame.add( button1 );
    
    ActionListener al = new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        button1.setIcon( icon2 );
      }
    };
    
    button1.addActionListener( al );
    
    // Button 2
    
    final JButton button2 = new JButton( "Ende" );
    frame.add( button2 );
    
    button2.addActionListener( new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        System.exit( 0 );
      }
    } );
    
    frame.pack();
    frame.setVisible( true );
  }
}