import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class TryWithResourcesReadsLine {

  static String readFirstLine( String file ) {
    try ( BufferedReader br = Files.newBufferedReader( Paths.get( file ),
                                                       StandardCharsets.ISO_8859_1 ) ) {
      return br.readLine();
    }
    catch ( IOException e ) { e.printStackTrace(); return null; }
  }
}