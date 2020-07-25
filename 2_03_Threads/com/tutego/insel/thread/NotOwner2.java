package com.tutego.insel.thread;

class IsOwner {

  public static void main( String[] args ) throws InterruptedException {
    IsOwner o = new IsOwner();

    synchronized ( o ) {
      o.wait();
    }
  }
}
