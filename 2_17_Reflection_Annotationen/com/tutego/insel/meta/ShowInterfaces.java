package com.tutego.insel.meta;

public class ShowInterfaces {
  public static void main( String[] args ) {
    for ( Class<?> theInterface : java.io.RandomAccessFile.class.getInterfaces() )
      System.out.println( theInterface.getName() );
  }
}
