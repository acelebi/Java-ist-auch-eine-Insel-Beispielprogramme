public class AvgVarArgs {

  static double avg( double... array ) {
    if ( array == null || array.length == 0 )
      throw new IllegalArgumentException( "Array null oder leer" );

    double sum = 0;

    for ( double n : array )
      sum += n;

    return sum / array.length;
  }

  public static void main( String[] args ) {
    System.out.println( avg( 1, 2, 9, 3 ) ); // 3.75
  }
}