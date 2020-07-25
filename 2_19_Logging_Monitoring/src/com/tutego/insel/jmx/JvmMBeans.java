package com.tutego.insel.jmx;

import java.lang.management.*;

public class JvmMBeans {
  public static void main( String[] args ) {
    MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();

    // init = 0(0K) used = 169568(165K) committed = 2031616(1984K) max = 66650112(65088K)
    System.out.println( memoryMXBean.getHeapMemoryUsage() );

    // init = 29556736(28864K) used = 12026264(11744K) committed = 29851648(29152K) max = 121634816(118784K)
    System.out.println( memoryMXBean.getNonHeapMemoryUsage() );

    ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();
    System.out.println( classLoadingMXBean.getLoadedClassCount() );      // 301
    System.out.println( classLoadingMXBean.getTotalLoadedClassCount() ); // 301
    System.out.println( classLoadingMXBean.getUnloadedClassCount() );    // 0
  }
}
