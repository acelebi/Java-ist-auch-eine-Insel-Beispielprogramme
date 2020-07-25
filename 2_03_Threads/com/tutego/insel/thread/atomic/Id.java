package com.tutego.insel.thread.atomic;

import java.util.concurrent.atomic.AtomicLong;

public class Id {
  
  private static final AtomicLong id = new AtomicLong();

  private Id() { /* Empty */
  }

  public long next() {
    return id.getAndIncrement();
  }
}
