import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class FormatClassesDemo {

  public static void main( String[] args ) {
    String s;
    
    s = DateFormat.getDateInstance().format( new Date() );       // 02.06.2005
    System.out.println( s );
   
    s = DateFormat.getTimeInstance().format( new Date() );       // 15:25:16
    System.out.println( s );

    s = DateFormat.getDateTimeInstance().format( new Date() );   // 02.06.2005 15:25:16
    System.out.println( s );

    s = NumberFormat.getInstance().format( 12345.6789 );         // 12.345,679
    System.out.println( s );

    s = NumberFormat.getIntegerInstance().format( 12345.6789 );  // 12.346
    System.out.println( s );

    s = NumberFormat.getCurrencyInstance().format( 12345.6789 ); // 12.345,68 �
    System.out.println( s );

    s = NumberFormat.getPercentInstance().format( 0.12333 );       // 12%
    System.out.println( s );
  }
}