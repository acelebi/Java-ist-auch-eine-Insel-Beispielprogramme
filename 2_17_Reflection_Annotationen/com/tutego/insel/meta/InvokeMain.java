package com.tutego.insel.meta;

import java.lang.reflect.*;
import java.util.Arrays;

public class InvokeMain {
  public static void main( String[] args ) throws Exception {
    String[] argv = { "-option", "Parameter" };

    Method method = Class.forName( "com.tutego.insel.meta.HasMain" ).
                       getMethod( "main", argv.getClass() );

    method.invoke( null, new Object[]{ argv } );
  }
}

class HasMain {
  public static void main( String[] args ) {
    System.out.println( "Got: " + Arrays.toString( args ) );
  }
}