package com.tutego.insel.meta;

import java.lang.reflect.*;

class ShowMethods {
  public static void main( String[] args ) {
    showMethods( java.awt.Color.BLACK );
  }

  static void showMethods( Object o ) {
    for ( Method method : o.getClass().getMethods() ) {
      String returnString = method.getReturnType().getName();
      System.out.print( returnString + " " + method.getName() + "(" );

      Class<?>[] parameterTypes = method.getParameterTypes();

      for ( int k = 0; k < parameterTypes.length; k++ ) {
        String parameterString = parameterTypes[k].getName();
        System.out.print( " " + parameterString );

        if ( k < parameterTypes.length - 1 )
          System.out.print( ", " );
      }
      System.out.print( " )" );

      Class<?>[] exceptions = method.getExceptionTypes();

      if ( exceptions.length > 0 ) {
        System.out.print( " throws " );
        for ( int k = 0; k < exceptions.length; k++ ) {
          System.out.print( exceptions[k].getName() );
          if ( k < exceptions.length - 1 )
            System.out.print( ", " );
        }
      }

      System.out.println();
    }
  }
}