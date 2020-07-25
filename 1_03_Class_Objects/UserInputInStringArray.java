import java.util.Scanner;

public class UserInputInStringArray {

  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    String[] validInputs = { "Banane", "Apfel", "Kirsche" };

    userInputLoop:
    while ( true ) {
      String input = new Scanner( System.in ).nextLine();

      for ( String s : validInputs )
        if ( s.equals( input ) )
          break userInputLoop;
    }

    System.out.println( "Gültiges Früchtchen eingegeben" );
  }
}