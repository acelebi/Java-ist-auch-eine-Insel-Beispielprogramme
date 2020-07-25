package com.tutego.insel.thread;

class NotOwner {
  public static void main( String[] args ) throws InterruptedException {
     new NotOwner().wait();
  }
}
