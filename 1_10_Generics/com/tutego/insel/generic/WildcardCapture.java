package com.tutego.insel.generic;

import java.util.List;

public class WildcardCapture {
  
  private static <T> void reverse_( List<T> list ) {
    for ( int i = 0; i < list.size() / 2; i++ ) {
      int j = list.size() - i - 1;
      T tmp = list.get( i );
      list.set( i, list.get( j ) );
      list.set( j, tmp );
    }
  }

  public static void reverse( List<?> list ) {
    reverse_( list );
  }
}
