import java.io.*;

public class ReadGifSize {

  public static void main( String[] args ) {
    RandomAccessFile f = null;
    
    try {
      f = new RandomAccessFile( "duke.gif", "r" );
      f.seek( 6 );
    
      System.out.printf( "%s x %s Pixel%n", f.read() + f.read() * 256,
                         f.read() + f.read() * 256 );
    } catch ( FileNotFoundException e ) {
      System.err.println( "Datei ist nicht vorhanden!" );
    } catch ( IOException e ) {
      System.err.println( "Allgemeiner Ein-/Ausgabefehler!" );
    } finally {
      if ( f != null )
        try { f.close(); } catch ( IOException e ) { }
    }
  }
}