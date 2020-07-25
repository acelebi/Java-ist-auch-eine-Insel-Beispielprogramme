package com.tutego.insel.thread;

public class DateThreadUser {
  public static void main( String[] args ) {
    Thread t = new DateThread();
    t.start();
    new DateThread().start();
  }
}