public class FormatPosition {

  public static void main( String[] args ) {
    Object[] formatArgs = { "Christian", "Ullenboom" };
    
    String germanFormat = "Hallo %1$s %2$s";
    System.out.printf( germanFormat, formatArgs );
    System.out.println();
    
    String bwatutiFormat = "Jambo %2$s %1$s";
    System.out.printf( bwatutiFormat, formatArgs );
    System.out.println();
    
//    Calendar c1 = new GregorianCalendar( 1973, 2, 12 );
//    Calendar c2 = new GregorianCalendar( 1985, 8, 2 );
//
//    System.out.printf( "%te. %<tb %<ty, %2$te. %<tb %<ty%n",
//                       c1,              c2 );     // 12. Mrz 73, 2. Sep 85
  }
}