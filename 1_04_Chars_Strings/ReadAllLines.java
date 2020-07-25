import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadAllLines {

  public static void main( String[] args ) throws IOException {
    try ( Scanner scanner = new Scanner( Paths.get( "EastOfJava.txt" ),
                                         StandardCharsets.ISO_8859_1.name() ) ) {
      while ( scanner.hasNextLine() )
        System.out.println( scanner.nextLine() );
    }
  }
}