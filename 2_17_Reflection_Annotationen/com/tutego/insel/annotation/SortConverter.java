package com.tutego.insel.annotation;

import java.util.Arrays;

public class SortConverter implements ResourceConverter {
  @Override public String convert( String input ) {
    char[] chars = input.toCharArray();
    Arrays.sort( chars );
    return new String( chars );
  }
}
