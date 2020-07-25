public class Rounding2Demo {
  public static void main( String[] args ) {
    System.out.println( Math.round(1.01) );     //  1
    System.out.println( Math.round(1.4) );      //  1
    System.out.println( Math.round(1.5) );      //  2
    System.out.println( Math.round(1.6) );      //  2
    System.out.println( (int) 1.6 );            //  1
    System.out.println( Math.round(30) );       // 30
    System.out.println( Math.round(-2.1) );     // -2
    System.out.println( Math.round(-2.9) );     // -3
    System.out.println( (int) -2.9 );           // -2
  }
}
