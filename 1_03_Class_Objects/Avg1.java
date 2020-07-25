public class Avg1 {

  static double avg( double[] array ) {
    double sum = 0;
    
    for ( int i = 0; i < array.length; i++ )
      sum += array[ i ];

    return sum / array.length;
  }

  public static void main( String[] args ) {
    double[] numbers = { 2, 3, 4 };
    System.out.println( avg( numbers ) );            // 3.0
  }
}
