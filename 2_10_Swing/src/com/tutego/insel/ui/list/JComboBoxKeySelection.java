package com.tutego.insel.ui.list;

import javax.swing.*;

class JComboBoxKeySelection {

  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    JComboBox<String> cb = new JComboBox<>( "A,B,C".split( "," ) );

    cb.setKeySelectionManager( new JComboBox.KeySelectionManager() {
      @SuppressWarnings( "rawtypes" )
      @Override
      public int selectionForKey( char aKey, ComboBoxModel aModel ) {
        int pos = Math.abs( aKey - 1 - '0' );
        return pos >= aModel.getSize() ? aModel.getSize() - 1 : pos;
      }
    } );

    frame.add( cb );
    frame.pack();
    frame.setVisible( true );
  }
}
