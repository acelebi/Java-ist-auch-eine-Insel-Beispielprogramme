package com.tutego.insel.ui.list;

import javax.swing.*;
import javax.swing.event.*;

public class JListDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame( "Levels of Happiness" );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    
    final DefaultListModel<String> lykkeligModel = new DefaultListModel<>();
    
    for ( String s : ("1. Denmark,2. Switzerland,3. Austria," +
                      "4. Iceland,5. Bahamas,35. Germany," +
                      "174. Ukraine,178. Burundi,Ende").split(",") )
      lykkeligModel.addElement( s );
    
    JList<String> list = new JList<>( lykkeligModel );
    
    list.addListSelectionListener( new ListSelectionListener() {
      @Override public void valueChanged( ListSelectionEvent e ) {
        if ( e.getValueIsAdjusting() )
          return;
    
        System.out.println( e );
    
        if ( "Ende".equals( lykkeligModel.get( e.getLastIndex() ) ) )
          System.exit( 0 );
      }
    } );
    
    frame.add( new JScrollPane(list) );
    frame.pack();
    frame.setVisible( true );
  }
}