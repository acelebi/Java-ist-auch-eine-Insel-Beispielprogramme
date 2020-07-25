package com.tutego.insel.jmx;

import javax.swing.*;

public class Exhibitionism {
  public static void main( String[] args ) {
    new Thread() {
      @Override public void run() { while ( true ) { new JTree(); } }
    }.start();
    JOptionPane.showMessageDialog( null, "OK bei Ende" );
    System.exit( 0 );
  }
}
