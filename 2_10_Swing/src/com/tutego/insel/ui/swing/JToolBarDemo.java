package com.tutego.insel.ui.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import javax.swing.*;

public class JToolBarDemo {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 300, 200 );

    final JTextArea textArea = new JTextArea();
    f.add( new JScrollPane( textArea ) );

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu( "Datei" );
    menuBar.add( fileMenu );
    JMenu helpMenu = new JMenu( "Hilfe" );
    menuBar.add( helpMenu );
    f.setJMenuBar( menuBar );
    helpMenu.add( new JMenuItem( "Über das Programm" ) );

    final Icon smallIcon = new ImageIcon(
                JToolBarDemo.class.getResource("/images/fileopen16x16.png") );
    final Icon largeIcon = new ImageIcon(
                JToolBarDemo.class.getResource("/images/fileopen22x22.png") );

    Action openAction = new AbstractAction() {
      {
        putValue( Action.NAME, "Öffnen" );
        putValue( Action.DISPLAYED_MNEMONIC_INDEX_KEY, 1 );
        putValue( Action.SMALL_ICON, smallIcon );
        putValue( Action.LARGE_ICON_KEY, largeIcon );
      }

      @Override public void actionPerformed( ActionEvent e ) {
        JFileChooser fileChooser = new JFileChooser();
        if ( fileChooser.showOpenDialog( null ) == JFileChooser.APPROVE_OPTION ) {
          Path path = fileChooser.getSelectedFile().toPath();
          try ( Reader in = Files.newBufferedReader( path, StandardCharsets.ISO_8859_1 ) ) {
            textArea.read( in, null );
          }
          catch ( IOException ex ) {
            textArea.setText( ex.getMessage() );
          }
        }
      }
    };

    fileMenu.add( openAction );
    fileMenu.addSeparator();

    fileMenu.add( new AbstractAction() {
      { putValue( Action.NAME, "Beenden" );
        putValue( Action.DISPLAYED_MNEMONIC_INDEX_KEY, 0 );
      }
      @Override public void actionPerformed( ActionEvent e ) {
        System.exit( 0 );
      }
    } );

    JToolBar toolbar = new JToolBar();
    toolbar.add( openAction );
    f.add( toolbar, BorderLayout.PAGE_START );
    f.setVisible( true );
  }
}