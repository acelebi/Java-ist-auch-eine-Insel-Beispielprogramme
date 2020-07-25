package com.tutego.insel.jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.swing.JOptionPane;

public class RegisterMazeMBean {
  public static void main( String[] args ) throws Exception {
    MBeanServer server = ManagementFactory.getPlatformMBeanServer();
    ObjectName  name   = new ObjectName( "com.tutego.insel.jmx:type=Maze" ); 
    MazeMBean   maze   = new Maze();
    server.registerMBean( maze, name );

    JOptionPane.showMessageDialog( null, "Ende" );
    System.exit( 0 );
  }
}
