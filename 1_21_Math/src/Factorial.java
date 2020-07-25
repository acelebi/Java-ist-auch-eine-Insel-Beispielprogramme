import java.math.*;

public class Factorial {
  static BigInteger factorial( int n ) {
    BigInteger result = BigInteger.ONE;

    if ( n == 0 || n == 1 )
      return result;

    if ( n > 1 )
      for ( int i = 1; i <= n; i++ )
        result = result.multiply( BigInteger.valueOf( i ) );

    return result;
  }

  public static BigInteger factorial2( int i ) {
    if ( i <= 1 )
      return BigInteger.ONE;

    return BigInteger.valueOf( i ).multiply( factorial2( i - 1 ) );
  }

  public static void main( String[] args ) {
    System.out.println( factorial( 100 ) );
    System.out.println( factorial2( 100 ) );
  }
}