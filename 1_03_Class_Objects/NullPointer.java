public class NullPointer {                       // 1
  @SuppressWarnings( "null" ) public static void main( String[] args ) {     // 2
    java.awt.Point p = null;                     // 3
    String         s = null;                     // 4
    p.setLocation( 1, 2 );                       // 5
    s.length();                                  // 6
  }                                              // 7
}                                                // 8
