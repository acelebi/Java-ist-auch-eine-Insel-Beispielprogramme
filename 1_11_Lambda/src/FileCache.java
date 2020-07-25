import java.io.*;
import java.nio.file.*;
import java.util.*;

class FileCache {
  private Map<String, byte[]> map = new HashMap<>();

  public byte[] getContent( String filename ) {
    return map.computeIfAbsent( filename, file -> {
      try {
        return Files.readAllBytes( Paths.get( file ) );
      }
      catch ( IOException e ) {
        throw new UncheckedIOException( e );
      }
    } );
  }
}