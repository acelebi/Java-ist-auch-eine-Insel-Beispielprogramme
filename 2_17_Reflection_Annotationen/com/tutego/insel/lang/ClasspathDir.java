package com.tutego.insel.lang;

public class ClasspathDir {
  public static void main( String[] args ) {
    System.out.println( System.getProperty( "java.class.path" ) );

    System.out.println( System.getProperty( "java.ext.dirs" ) );

    System.out.println( System.getProperty( "sun.boot.class.path" ) );
  }
}
