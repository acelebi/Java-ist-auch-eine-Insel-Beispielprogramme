package com.tutego.insel.nio2;

import java.io.IOException;
import java.nio.file.*;

public class FileStoreDemo {
  public static void main( String[] args ) throws IOException {
    for ( FileStore store : FileSystems.getDefault().getFileStores() ) {
      long total     = store.getTotalSpace() >> 30;
      long available = store.getUsableSpace() >> 30;
      System.out.println( store + " " + store.name() + " " +
                          available + " GiB frei von " + total + " GiB" +
                          ", Typ " + store.type() );
    }
  }
}