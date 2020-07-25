import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAllEmailAddresses2 {

  public static void main( String[] args ) {
    try {
      printAllEMailAddresses( "http://www.galileocomputing.de/hilfe/Impressum" );
    } catch ( MalformedURLException e ) {
      System.err.println( "URL ist falsch aufgebaut!" );
    } catch ( IOException e ) {
      System.err.println( "URL konnte nicht geöffnet werden!" );
    }
  }

  static void printAllEMailAddresses( String urlString ) throws MalformedURLException, IOException {
    Scanner scanner = new Scanner( new URL( urlString ).openStream() );
    Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );

    while ( scanner.hasNextLine() ) {
      String line = scanner.nextLine();
      for ( Matcher m = pattern.matcher( line ); m.find(); )
        System.out.println( line.substring( m.start(), m.end() ) );
    }
    scanner.close(); // Später mehr zu diesem speziellen Punkt
  }
}