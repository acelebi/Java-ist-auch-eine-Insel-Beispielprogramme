package com.tutego.insel.io.zip;

import java.io.IOException;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipListDemo {

  public static void main( String[] args ) throws IOException {
    try ( ZipFile zipFile = new ZipFile( "c:/a/b.zip" ) ) {
      for ( ZipEntry entry : Collections.list( zipFile.entries() ) )
        System.out.printf( "%s%-54s   Größe: %6d   Gepackt: %6d   %tc%n",
                           entry.isDirectory() ? "+" : " ",
                           entry.getName(),
                           entry.getSize(),
                           entry.getCompressedSize(),
                           entry.getTime() );
      }
  }
}