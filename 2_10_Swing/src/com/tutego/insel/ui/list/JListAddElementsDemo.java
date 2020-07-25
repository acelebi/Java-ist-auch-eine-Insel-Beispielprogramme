package com.tutego.insel.ui.list;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class JListAddElementsDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame( "Levels of Happiness" );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setLayout( new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS) );

    final DefaultListModel<String> listModel = new DefaultListModel<>();

    final JList<String> list = new JList<>( listModel );
    JButton     btn  = new JButton( "Remove" );
    JTextField  tf   = new JTextField();

    frame.add( btn );
    frame.add( new JScrollPane(list) );
    frame.add( tf );

    btn.addActionListener( new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        int index = list.getSelectedIndex();
        if ( index == -1 )
          return;
    
        listModel.remove( index );
      }
    } );

    tf.addActionListener( new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        String text = ((JTextField)e.getSource()).getText();
        listModel.addElement( text );
        ((JTextField)e.getSource()).setText( "" );
      }
    } );
    
    frame.pack();
    frame.setVisible( true );
  }
}