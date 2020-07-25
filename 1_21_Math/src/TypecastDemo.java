public class TypecastDemo {
  public static void main( String[] args ) {
    //           decimal         binary

    int   ii = 123456789;     // 00000111010110111100110100010101
    int   ij =   -123456;     // 11111111111111100001110111000000
    
    short si = (short) ii;    //                 1100110100010101
    short sj = (short) ij;    //                 0001110111000000

    System.out.println( si ); // -13035
    System.out.println( sj ); // 7616
  }
}
