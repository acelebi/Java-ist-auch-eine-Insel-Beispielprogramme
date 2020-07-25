import java.util.*;

public class Hangman2 {
  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    String[] hangmanWords = { "samoa", "tonga", "fiji", "vanuatu" };
    String hangmanWord = hangmanWords[ new Random().nextInt( hangmanWords.length ) ];

    String usedChars = "";
    String guessedWord = hangmanWord.replaceAll( ".", "_" );

    for ( int guesses = 0; ; guesses++ ) {
      if ( guesses == 10 ) {
        System.out.printf( "Nach 10 Versuchen ist jetzt Schluss. Sorry! Apropos, das Wort war '%s'.",
                           hangmanWord );
        break;
      }

      System.out.printf( "Runde %d. Bisher geraten: %s. Was wählst du für ein Zeichen?%n",
                         guesses, guessedWord );
      char guessedChar = new java.util.Scanner( System.in ).next().charAt( 0 );

      if ( usedChars.indexOf( guessedChar ) >= 0 )
        System.out.printf( "%c hast du schon mal getippt!%n", guessedChar );
      else {  // Zeichen wurde noch nicht benutzt 
        usedChars += guessedChar;
        if ( hangmanWord.indexOf( guessedChar ) >= 0 ) {
          guessedWord = hangmanWord.replaceAll( "[^"+usedChars+"]", "_" );
          if ( guessedWord.contains( "_" ) )
            System.out.printf( "Gut geraten, '%s' gibt es im Wort. Aber es fehlt noch was!%n",
                               guessedChar );
          else {
            System.out.printf( "Gratulation, du hast das Wort '%s' erraten!", hangmanWord );
            break;
          }
        }
        else { // hangmanWord.indexOf( c ) == -1 
          System.out.printf( "Pech gehabt, %c kommt im Wort nicht vor!%n", guessedChar );
        }
      }
    }
  }
}