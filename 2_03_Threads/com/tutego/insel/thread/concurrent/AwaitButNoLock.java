package com.tutego.insel.thread.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AwaitButNoLock {
  public static void main( String[] args ) throws InterruptedException {
    Condition condition = new ReentrantLock().newCondition();
    condition.await(); // java.lang.IllegalMonitorStateException
  }
}
