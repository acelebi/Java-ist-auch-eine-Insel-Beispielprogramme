public class _MathSpecials {
  public static void main( String[] args ) {
    // Overflow results in positive infinity
    System.out.println( 1E300 * 1E20 );     //  Infinity
    
    // Overflow results in negative infinity
    System.out.println( -1E300 * 1E20 );    // -Infinity
    
    // Underflow results in positive 0 
    System.out.println( 1E-322 * 0.0001 );  //   0.0
    
    // Underflow results in positive 0
    System.out.println( 1E-322 * -0.0001 );  // -0.0
    
    System.out.println( Math.sqrt(-4) );     // NaN
    System.out.println( 0.0 / 0.0);          // NaN

    System.out.println( Double.NaN == Double.NaN ); // false
    System.out.println( Double.NaN != Double.NaN ); // true

    System.out.println( (long) Double.NaN );  // 0

    System.out.println( Math.abs(-2147483648) );  // -2147483648
  }
}