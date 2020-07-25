import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Netstat
{
  public static void main( String[] args ) throws IOException
  {
    ProcessBuilder builder = new ProcessBuilder( "netstat", "-n" );
    Process p = builder.start();
    try ( Scanner scanner = new Scanner( p.getInputStream() ) ) {
      Pattern pattern = Pattern.compile( "(TCP|UDP)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)" );
      while ( scanner.findWithinHorizon( pattern, 0 ) != null )
        System.out.printf( "%-6s %-22s %-22s %s%n", scanner.match().group( 1 ), scanner.match().group( 2 ),
                   scanner.match().group( 3 ), scanner.match().group( 4 ) );
    }
  }
}