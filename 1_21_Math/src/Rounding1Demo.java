public class Rounding1Demo {
  public static void main( String[] args ) {
    System.out.println( Math.ceil(-99.1) );    //  -99.0
    System.out.println( Math.floor(-99.1) );   // -100.0
    System.out.println( Math.ceil(-99) );      //  -99.0
    System.out.println( Math.floor(-99) );     //  -99.0
    System.out.println( Math.ceil(-.5) );      //   -0.0
    System.out.println( Math.floor(-.5) );     //   -1.0
    System.out.println( Math.ceil(-.01) );     //   -0.0
    System.out.println( Math.floor(-.01) );    //   -1.0
    System.out.println( Math.ceil(0.1) );      //    1.0
    System.out.println( Math.floor(0.1) );     //    0.0
    System.out.println( Math.ceil(.5) );       //    1.0
    System.out.println( Math.floor(.5) );      //    0.0
    System.out.println( Math.ceil(99) );       //   99.0
    System.out.println( Math.floor(99) );      //   99.0
  }
}