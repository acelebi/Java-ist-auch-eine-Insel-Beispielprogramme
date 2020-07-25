package com.tutego.insel.pattern.singleton;

public class ConfigurationDemo {

  public static void main( String[] args ) {
    System.out.println( Configuration.INSTANCE.getVersion() );  // 1.2
    System.out.println( Configuration.INSTANCE.getUserDir() );  // C:\Users\Christian\...
  }
}
