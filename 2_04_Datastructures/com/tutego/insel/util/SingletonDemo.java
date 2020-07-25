package com.tutego.insel.util;

import java.util.Collection;
import java.util.Collections;

public class SingletonDemo {
  public static void removeAll( Collection<?> c, Object o ) {
    c.removeAll( Collections.singleton( o ) );
  }
}
