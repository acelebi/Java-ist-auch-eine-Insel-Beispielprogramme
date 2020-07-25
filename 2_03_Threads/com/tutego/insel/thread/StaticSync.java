package com.tutego.insel.thread;

class StaticSync {
  private static final Object o = new Object();

  static void staticFoo() {
    synchronized ( o ) {
      // ...
    }
  }
}

class StaticSync2 {
  static void staticFoo() {
    synchronized ( StaticSync.class ) {
      // ...
    }
  }
}
