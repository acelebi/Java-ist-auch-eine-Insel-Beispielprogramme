package com.tutego.insel.thread.concurrent;

import java.util.Arrays;
import java.util.concurrent.Callable;

class SorterCallable implements Callable<byte[]> {
  
  private final byte[] b;

  SorterCallable( byte[] b ) {
    this.b = b;
  }

  @Override
  public byte[] call() {
    Arrays.sort( b );
    return b;
  }
}
