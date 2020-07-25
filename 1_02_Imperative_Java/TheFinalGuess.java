public class TheFinalGuess {

  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    int number = (int) (Math.random() * 5 + 1);
    int guess;

    do {
      System.out.println( "Welche Zahl denke ich mir zwischen 1 und 5?" );
      guess = new java.util.Scanner( System.in ).nextInt();

      if ( number == guess )
        System.out.println( "Super getippt!" );
      else if ( number > guess )
        System.out.println( "Nee, meine Zahl ist größer als deine!" );
      else // number < guess
        System.out.println( "Nee, meine Zahl ist kleiner als deine!" );
    }
    while ( number != guess );
  }
}