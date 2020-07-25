import java.util.Scanner;

public class ScannerDemo {

  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    Scanner scanner = new Scanner( "tutego 12 1973 12,03 True 123456789000" );
    System.out.println( scanner.hasNext() );        // true
    System.out.println( scanner.next() );           // tutego
    System.out.println( scanner.hasNextByte() );    // true
    System.out.println( scanner.nextByte() );       // 12
    System.out.println( scanner.hasNextInt() );     // true
    System.out.println( scanner.nextInt() );        // 1973
    System.out.println( scanner.hasNextDouble() );  // true
    System.out.println( scanner.nextDouble() );     // 12.03
    System.out.println( scanner.hasNextBoolean() ); // true
    System.out.println( scanner.nextBoolean() );    // true
    System.out.println( scanner.hasNextLong() );    // true
    System.out.println( scanner.nextLong() );       // 123456789000
    System.out.println( scanner.hasNext() );        // false
  }
}