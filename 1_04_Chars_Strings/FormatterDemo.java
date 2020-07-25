import java.util.Formatter;

public class FormatterDemo {

  public static void main( String[] args ) {
//    StringBuilder sb = new StringBuilder();
//    
//    for ( double d = 0; d <= 1; d += 0.1 )
//      sb.append( String.format("%.1f%n", d) );
//     
//    System.out.println( sb );   // 0,1 0,2 ... 1,0

    StringBuilder sb = new StringBuilder();
    Formatter formatter = new Formatter( sb );

    for ( double d = 0; d <= 1; d += 0.1 )
      formatter.format( "%.1f%n", d );
    
    System.out.println( formatter );   // 0,1 0,2 ... 1,0
  }
}