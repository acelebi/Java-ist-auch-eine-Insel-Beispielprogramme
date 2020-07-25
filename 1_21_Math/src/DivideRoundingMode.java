import java.math.*;

public class DivideRoundingMode {
  public static void main( String[] args ) {
    BigDecimal one = new BigDecimal( "1" );
    BigDecimal three = new BigDecimal( "3" );

    System.out.println( one.divide( three, BigDecimal.ROUND_UP ) ); // 1
    System.out.println( one.divide( three, BigDecimal.ROUND_DOWN ) ); // 0

    System.out.println( one.divide( three, 6, BigDecimal.ROUND_UP ) ); // 0.333334
    System.out.println( one.divide( three, 6, BigDecimal.ROUND_DOWN ) ); // 0.333333
  }
}