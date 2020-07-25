public class DaysOfMonth {

  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    
    int month = new java.util.Scanner( System.in ).nextInt();
    int year = new java.util.Scanner( System.in ).nextInt();
    // Schaltjahr oder nicht?
    boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    
    switch ( month ) {
      case 4: // Fall-through
      case 6:
      case 9:
      case 11:
        System.out.println( "30 Tage" );
        break;
      case 1: // Fall-through
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println( "31 Tage" );
        break;
      case 2:
        if ( isLeapYear )
          System.out.println( "29 Tage" );
        else
          System.out.println( "28 Tage" );
        break;
      default:
        System.err.println( "Ungültiger Monat!" );
    }
  }
}