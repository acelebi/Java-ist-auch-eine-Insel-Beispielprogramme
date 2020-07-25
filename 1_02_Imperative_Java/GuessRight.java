public class GuessRight {

  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    int number = (int) (Math.random() * 5 + 1);

    while ( true ) {
      System.out.println( "Welche Zahl denke ich mir zwischen 1 und 5?" );
      int guess = new java.util.Scanner( System.in ).nextInt();

      if ( guess < 1 || guess > 5 ) {
        System.out.println( "Nur Zahlen zwischen 1 und 5!" );
        continue;
      }

      if ( number == guess ) {
        System.out.println( "Super getippt!" );
        break;                   // Ende der Schleife
      }
      else if ( number > guess )
        System.out.println( "Nee, meine Zahl ist größer als deine!" );
      else if ( number < guess )
        System.out.println( "Nee, meine Zahl ist kleiner als deine!" );
    }
  }
}