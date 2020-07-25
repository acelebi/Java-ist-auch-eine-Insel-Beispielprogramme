import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Formatter;

public class WriteFormattedStringToFile {
  public static void main( String[] args ) {
    try ( Formatter out = new Formatter( "ausgabe.txt", StandardCharsets.ISO_8859_1.name() ) ) {
      for ( int i = 0; i < 10; i++ )
        out.format( "%02d%n", i );
    }
    catch ( FileNotFoundException | UnsupportedEncodingException e ) {
      e.printStackTrace();
    }
  }
}
