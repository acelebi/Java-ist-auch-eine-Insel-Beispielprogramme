package com.tutego.insel.meta;

public class DynamReflection {
  public static void main( String[] args ) throws Exception {
    Class<?> clazz = Class.forName( "com.tutego.insel.meta.DynamReflectionMethod" );

    Object o = clazz.newInstance();
    clazz.getMethod( "meth" ).invoke( o );
  }
}