package com.tutego.insel.ui.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JScrollBarDemo {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    f.setLayout( new GridLayout( 2, 1 ) );

    final JScrollBar sb = new JScrollBar( Adjustable.HORIZONTAL, 50, 10, 0, 100 + 10 );
    final JTextField tf = new JTextField( "" + sb.getValue(), 20 );

    f.add( tf );
    f.add( sb );

    tf.addActionListener( new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        sb.setValue( Integer.parseInt( tf.getText() ) );
      }
    } );

    sb.addAdjustmentListener( new AdjustmentListener() {
      @Override public void adjustmentValueChanged( AdjustmentEvent e ) {
        tf.setText( "" + sb.getValue() );
      }
    } );

    f.pack();
    f.setVisible( true );
  }
}
