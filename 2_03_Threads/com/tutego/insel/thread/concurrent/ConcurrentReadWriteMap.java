package com.tutego.insel.thread.concurrent;

import java.util.*;
import java.util.concurrent.locks.*;

public class ConcurrentReadWriteMap<K, V> {

  private final HashMap<K, V> map = new HashMap<>();
  private final ReadWriteLock lock = new ReentrantReadWriteLock();
  private final Lock readLock = lock.readLock(), writeLock = lock.writeLock();

  public V get( K key ) {
    readLock.lock();
    try {
      return map.get( key );
    }
    finally {
      readLock.unlock();
    }
  }

  public V put( K key, V value ) {
    writeLock.lock();
    try {
      return map.put( key, value );
    }
    finally {
      writeLock.unlock();
    }
  }

  public void clear() {
    writeLock.lock();
    try {
      map.clear();
    }
    finally {
      writeLock.unlock();
    }
  }
}