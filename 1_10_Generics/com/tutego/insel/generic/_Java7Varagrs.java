package com.tutego.insel.generic;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class _Java7Varagrs
{
//  @SafeVarargs
//  public static <T> List<T> asList( T... a )
//  {
//    ArrayList<T> result = new ArrayList<>();
//    for ( T t : a )
//      result.add( t );
//    return result;
//  }

  @SafeVarargs
  public static <T> void asList( T... a ) {
  }

  /**
   * @param args the command line arguments
   */
  public static void main( String[] args )
  {
    AtomicReference<StringBuilder> ar1 = new AtomicReference<>();
    AtomicReference<StringBuilder> ar2 = new AtomicReference<>();
    List<AtomicReference<StringBuilder>> asList = Arrays.asList( ar1, ar2 );
    System.out.print( asList );
  }
}
