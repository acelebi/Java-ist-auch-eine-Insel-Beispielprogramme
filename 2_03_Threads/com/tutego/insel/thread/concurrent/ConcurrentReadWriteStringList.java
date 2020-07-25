package com.tutego.insel.thread.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ConcurrentReadWriteStringList {

  private final List<String> list = new ArrayList<>();
  private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
  private final Lock readLock = lock.readLock();
  private final Lock writeLock = lock.writeLock();

  public String get( int index ) {
    readLock.lock();
    try {
      return list.get( index );
    }
    finally {
      readLock.unlock();
    }
  }

  public void add( int index, String element ) {
    writeLock.lock();
    try {
      list.add( index, element );
    }
    finally {
      writeLock.unlock();
    }
  }
}