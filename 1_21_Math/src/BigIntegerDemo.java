import java.math.BigInteger;

public class BigIntegerDemo {
  public static void main( String[] args ) {
    BigInteger ones = BigInteger.ONE;
    for ( int i = 0; i < 20; i++ ) {
      System.out.println( ones + "^2 = " + ones.pow( 2 ) );
      ones = ones.multiply( BigInteger.TEN ).add( BigInteger.ONE );
    }
  }
}
