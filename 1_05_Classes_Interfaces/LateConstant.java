public class LateConstant {

  public final static int  HUBBLE;
  public final String      ISBN;

  static {
    java.util.Scanner scanner = new java.util.Scanner(
      LateConstant.class.getResourceAsStream( "hubble-constant.txt") );
    HUBBLE = scanner.nextInt();
    scanner.close();
  }

  public LateConstant() {
    ISBN = "3572100100";
  }

  public static void main( String[] args ) {
    System.out.println( HUBBLE );                      // 77

    System.out.println( new LateConstant().ISBN );     // 3572100100
  }
}