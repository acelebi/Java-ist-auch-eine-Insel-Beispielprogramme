public class Calculator {

  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    double x = new java.util.Scanner( System.in ).nextDouble();
    char operator = new java.util.Scanner( System.in ).nextLine().charAt( 0 );
    double y = new java.util.Scanner( System.in ).nextDouble();

    switch ( operator ) {
      case '+':
        System.out.println( x + y );
        break;
      case '-':
        System.out.println( x - y );
        break;
      case '*':
        System.out.println( x * y );
        break;
      case '/':
        System.out.println( x / y );
        break;
      default:
        System.err.println( "Unbekannter Operator " + operator );
    }
  }
}