package com.tutego.insel.jmx;

import java.lang.management.ManagementFactory;
import java.rmi.registry.LocateRegistry;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;
import javax.swing.JOptionPane;

public class RmiJMXConnectorServerDemo {
  public static void main( String[] args ) throws Exception {
    LocateRegistry.createRegistry( 1099 );

    MBeanServer server = ManagementFactory.getPlatformMBeanServer();
    String url = "service:jmx:rmi:///jndi/rmi://localhost/maze";
    JMXConnectorServer connectorServer = JMXConnectorServerFactory
        .newJMXConnectorServer( new JMXServiceURL( url ), null, server );
    connectorServer.start();

    ObjectName name = new ObjectName( "com.tutego.insel.jmx:type=Maze" );
    MazeMBean maze = new Maze();
    server.registerMBean( maze, name );

    JOptionPane.showMessageDialog( null, "Ende" );
    System.exit( 0 );
  }
}
