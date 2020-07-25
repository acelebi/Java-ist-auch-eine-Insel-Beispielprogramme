public class MissNumberFormatException {      /* 1 */
  public static int getVatRate() {            /* 2 */
    return Integer.parseInt( "19%" );         /* 3 */
  }                                           /* 4 */
  public static void main( String[] args ) {  /* 5 */
    System.out.println( getVatRate() );       /* 6 */
  }                                           /* 7 */
}                                             /* 8 */