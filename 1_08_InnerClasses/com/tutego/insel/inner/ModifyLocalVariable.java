package com.tutego.insel.inner;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ModifyLocalVariable {

  public static void main( String[] args ) {
    final int[] result1 = { 0 };
    final String[] result2 = { null };
    final AtomicInteger result3 = new AtomicInteger();
    final AtomicReference<String> result4 = new AtomicReference<>();

    System.out.println( result1[0] );     // 0
    System.out.println( result2[0] );     // null
    System.out.println( result3.get() );  // 0
    System.out.println( result4.get() );  // null

    new Object() {{
        result1[0] = 1;
        result2[0] = "Der Herr der Felder";
        result3.set( 1 );
        result4.set( "Wurstwasser-Wette" );
    }};
  
    System.out.println( result1[0] );     // 1
    System.out.println( result2[0] );     // Der Herr der Felder
    System.out.println( result3.get() );  // 1
    System.out.println( result4.get() );  // Wurstwasser-Wette
  }
}