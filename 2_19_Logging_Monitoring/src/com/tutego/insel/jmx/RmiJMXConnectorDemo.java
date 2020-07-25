package com.tutego.insel.jmx;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

public class RmiJMXConnectorDemo {
  public static void main( String[] args ) throws Exception {
    String url = "service:jmx:rmi:///jndi/rmi://localhost/maze";
    JMXServiceURL u = new JMXServiceURL( url );
    try ( JMXConnector c = JMXConnectorFactory.connect( u ) ) {
      MBeanServerConnection mbsc = c.getMBeanServerConnection();
      ObjectName name = new ObjectName( "com.tutego.insel.jmx:type=Maze" );
      System.out.println( mbsc.getAttribute( name, "MaxNumberOfPlayers" ) );
    }
  }
}