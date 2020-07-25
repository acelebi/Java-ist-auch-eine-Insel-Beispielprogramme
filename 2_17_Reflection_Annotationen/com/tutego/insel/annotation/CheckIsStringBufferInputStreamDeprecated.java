package com.tutego.insel.annotation;

import java.io.StringBufferInputStream;

@SuppressWarnings("deprecation")
public class CheckIsStringBufferInputStreamDeprecated
{
  public static void main( String[] args )
  {
    System.out.println( String.class.isAnnotationPresent( Deprecated.class ) );                  // false
    System.out.println( StringBufferInputStream.class.isAnnotationPresent( Deprecated.class ) ); // true
  }
}
