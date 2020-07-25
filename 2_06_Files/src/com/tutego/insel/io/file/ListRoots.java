package com.tutego.insel.io.file;

import java.io.File;

public class ListRoots {
  public static void main( String[] args ) {
    for ( File root : File.listRoots() )
      System.out.println( root.getPath() + " ist " +
                          (root.exists() ? "" : "nicht ") + "bereit" );
  }
}
