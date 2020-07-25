package com.tutego.insel.ui.event;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class DialogWindowClosingListener2 extends WindowAdapter {
  @Override public void windowClosing( WindowEvent event ) {
    int option = JOptionPane.showConfirmDialog( null, "Applikation beenden?" );
    if ( option == JOptionPane.OK_OPTION )
      System.exit( 0 );
  }
}