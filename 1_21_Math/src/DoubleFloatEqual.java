public class DoubleFloatEqual {
  public static void main( String[] args ) {
    double d1 = 0.02d;
    float  f1 = 0.02f;
    System.out.println( d1 == f1 );         // false
    System.out.println( (float) d1 == f1 ); // true
    
    double d2 = 0.02f;
    float  f2 = 0.02f;
    System.out.println( d2 == f2 );        // true
  }
}
