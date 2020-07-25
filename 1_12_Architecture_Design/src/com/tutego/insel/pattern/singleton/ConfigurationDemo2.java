package com.tutego.insel.pattern.singleton;

public class ConfigurationDemo2 {

  public static void main( String[] args ) {
    System.out.println( Configuration2.getInstance().getVersion() );  // 1.2
    System.out.println( Configuration2.getInstance().getUserDir() );  // C:\Users\Christian\...
  }
}
