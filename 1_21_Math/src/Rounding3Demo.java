public class Rounding3Demo {
  public static void main( String[] args ) {
    System.out.println( Math.round(-1.5) );     //   -1
    System.out.println( Math.rint( -1.5) );     // -2.0
    System.out.println( Math.round(-2.5) );     //   -2
    System.out.println( Math.rint( -2.5) );     // -2.0
    System.out.println( Math.round( 1.5) );     //    2
    System.out.println( Math.rint(  1.5) );     //  2.0
    System.out.println( Math.round( 2.5) );     //    3
    System.out.println( Math.rint(  2.5) );     //  2.0
  }
}
