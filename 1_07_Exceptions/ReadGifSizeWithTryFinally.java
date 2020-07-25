import java.io.*;

public class ReadGifSizeWithTryFinally {

  public static void printGifSize( String filename )
                       throws FileNotFoundException, IOException {
    RandomAccessFile f = new RandomAccessFile( filename, "r" );

    try {
      f.seek( 6 );

      System.out.printf( "%s x %s Pixel%n", f.read() + f.read() * 256,
                                            f.read() + f.read() * 256 );
    } finally {
      f.close();
    }
  }

  public static void main( String[] args ) throws FileNotFoundException, IOException {
    printGifSize( "duke.gif" );
  }
}