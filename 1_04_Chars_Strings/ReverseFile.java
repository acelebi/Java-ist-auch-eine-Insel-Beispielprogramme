import java.io.InputStream;
import java.util.Scanner;

public class ReverseFile {

  public static void main( String[] args ) {
    InputStream resource = ReverseFile.class.getResourceAsStream( "EastOfJava.txt" );
    try ( Scanner input = new Scanner( resource ) ) {
      StringBuilder result = new StringBuilder();
      
      while ( input.hasNextLine() )
        result.insert( 0, input.nextLine() + System.lineSeparator() );
    
      System.out.println( result.toString().trim() );
    }
  }
}