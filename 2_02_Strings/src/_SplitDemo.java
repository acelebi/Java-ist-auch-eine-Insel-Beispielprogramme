import java.util.regex.Pattern;

public class _SplitDemo {

  public static void main( String[] args ) {
    Pattern p = Pattern.compile( "[/.-]" );

    String[] date1 = p.split( "12-3-1973" );
    System.out.printf( "%s.%s.%s%n", date1[0], date1[1], date1[2] );
    
    String[] date2 = p.split( "12.3.1973" );
    System.out.printf( "%s.%s.%s%n", date2[0], date2[1], date2[2] );
    
    String[] date3 = p.split( "12/3/1973" );
    System.out.printf( "%s.%s.%s%n", date3[0], date3[1], date3[2] );
  }
}