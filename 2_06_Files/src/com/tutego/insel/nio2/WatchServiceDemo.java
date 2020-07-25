package com.tutego.insel.nio2;

import java.nio.file.*;

public class WatchServiceDemo {
  public static void main( String[] args ) throws Exception {
    WatchService watcher = FileSystems.getDefault().newWatchService();

    Paths.get( "C:/" ).register( watcher, StandardWatchEventKinds.ENTRY_CREATE,
                                          StandardWatchEventKinds.ENTRY_DELETE,
                                          StandardWatchEventKinds.ENTRY_MODIFY );

    while ( true ) {
      WatchKey key = watcher.take();
      System.out.println( "Änderung" );

      for ( WatchEvent<?> event : key.pollEvents() )
        System.out.println( "Kind: " + event.kind() + ", Path: " +  event.context() );

      key.reset();
    }
  }
}