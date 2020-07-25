public class MultipleReturnValues {

  static int[] productAndSum( int a, int b ) {
    return new int[]{ a * b, a + b };
  }

  public static void main( String[] args ) {
    System.out.println( productAndSum(9, 3)[ 1 ] );
  }
}
