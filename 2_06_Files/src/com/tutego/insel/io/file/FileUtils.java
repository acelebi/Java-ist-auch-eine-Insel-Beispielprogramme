package com.tutego.insel.io.file;

import java.io.*;
import java.nio.channels.FileLock;

public class FileUtils {
  public static boolean isLocked( String filename ) {
    try ( RandomAccessFile raf = new RandomAccessFile( filename, "rw" );
          FileLock lock = raf.getChannel().tryLock() ) {
      // Nothing to do here
    }
    catch ( IOException e ) {
      return false;
    }
    return true;
  }
}