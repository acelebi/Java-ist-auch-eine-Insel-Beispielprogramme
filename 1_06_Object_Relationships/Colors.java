interface BaseColors {
  int WHITE   = 0;
  int BLACK   = 1;
  int GREY    = 2;
}

interface CarColors extends BaseColors {
  int WHITE   = 1;
  int BLACK   = 0;
}

interface PlaneColors extends BaseColors {
  int WHITE   = 0;
  int GREY    = 2;
}

interface FlyingCarColors extends CarColors, PlaneColors { }

public class Colors {
  public static void main( String[] args ) {
    System.out.println( BaseColors.GREY );      // 2
    System.out.println( CarColors.GREY );       // 2
    System.out.println( BaseColors.BLACK );     // 1
    System.out.println( CarColors.BLACK );      // 0
    System.out.println( PlaneColors.BLACK );    // 1

//    System.out.println( FlyingCarColors.WHITE );// The field FlyingCarColors.WHITE is ambiguous
//    System.out.println( FlyingCarColors.GREY ); // The field FlyingCarColors.GREY is ambiguous
 }
}