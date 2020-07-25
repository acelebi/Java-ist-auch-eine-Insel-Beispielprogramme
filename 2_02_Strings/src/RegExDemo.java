import java.util.regex.Pattern;

public class RegExDemo {

  public static void main( String[] args ) {
    System.out.println( Pattern.matches( "0", "0" ) );               // true
    System.out.println( Pattern.matches( "0", "1" ) );               // false
    System.out.println( Pattern.matches( "0", "00" ) );              // false
    System.out.println( Pattern.matches( "0*", "0000" ) );           // true
    System.out.println( Pattern.matches( "0*", "01" ) );             // false
    System.out.println( Pattern.matches( "0\\*", "01" ) );           // false
    System.out.println( Pattern.matches( "0\\*", "0*" ) );           // true
    System.out.println( Pattern.matches( "[01]*", "0" ) );           // true
    System.out.println( Pattern.matches( "[01]*", "01001" ) );       // true
    System.out.println( Pattern.matches( "[0123456789]*", "112" ) ); // true
    System.out.println( Pattern.matches( "\\d*", "112" ) );          // true
    System.out.println( Pattern.matches( "\\d*", "112a" ) );         // false
    System.out.println( Pattern.matches( "\\d*.", "112a" ) );        // true
    System.out.println( Pattern.matches( ".\\d*.", "x112a" ) );      // true
  }
}