import java.text.*;

public class DecimalFormatDemo {

  public static void main( String[] args ) {
    double d = 12345.67890;
    
    DecimalFormat df = new DecimalFormat( "###,##0.00" );
    System.out.println( df.format(d) );           // 12.345,68
  }
}
