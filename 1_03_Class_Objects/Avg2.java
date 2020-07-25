public class Avg2 {

  static double avg( double[] array ) {
    if ( array == null || array.length == 0 )
      throw new IllegalArgumentException( "Array null oder leer" );
  
    double sum = 0;
  
    for ( double n : array )
      sum += n;
  
    return sum / array.length;
  }

  public static void main( String[] args ) {
    double avg = avg( new double[]{ 2, 3, 4} );
    System.out.println( avg );
  }
}