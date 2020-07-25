import java.math.BigDecimal;

public class RoundWithSetScale {
  public static void main( String[] args ) {
    BigDecimal petrol = new BigDecimal( "1.399" ).multiply( new BigDecimal( 45 ) );
    System.out.println( petrol.setScale( 3, BigDecimal.ROUND_HALF_UP ) );
    System.out.println( petrol.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }
}
