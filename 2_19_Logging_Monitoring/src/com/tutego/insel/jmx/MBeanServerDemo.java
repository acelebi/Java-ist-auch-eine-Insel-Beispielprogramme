package com.tutego.insel.jmx;

import java.lang.management.ManagementFactory;
import javax.management.*;

public class MBeanServerDemo {

  public static void main( String[] args ) throws MalformedObjectNameException {
    MBeanServer server = ManagementFactory.getPlatformMBeanServer();
    System.out.println( server.getMBeanCount() );

    for ( Object object : server.queryMBeans( new ObjectName( "*:*" ), null ) )
      System.out.println( ((ObjectInstance) object).getObjectName() );
  }
}
