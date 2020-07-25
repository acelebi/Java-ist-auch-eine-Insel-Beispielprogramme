import java.math.BigInteger;

public class Overflow {
  private final static BigInteger MAX = BigInteger.valueOf( Long.MAX_VALUE );

  public static boolean canMulLong( long a, long b ) {
    BigInteger bigA = BigInteger.valueOf( a );
    BigInteger bigB = BigInteger.valueOf( b );

    return bigB.multiply( bigA ).compareTo( MAX ) <= 0;
  }

  public static void main( String[] args ) {
    System.out.println( canMulLong(Long.MAX_VALUE/2, 2) );            // true
    System.out.println( Long.MAX_VALUE/2 * 2 );        // 9223372036854775806
    System.out.println( canMulLong(Long.MAX_VALUE/2 + 1, 2) );       // false
    System.out.println( (Long.MAX_VALUE/2 + 1) * 2 );  //-9223372036854775808
  }
}