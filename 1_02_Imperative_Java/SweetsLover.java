public class SweetsLover {

  public static void main( String[] args ) {
    String input = javax.swing.JOptionPane.showInputDialog( "Eingabe" );

    switch ( input.toLowerCase() ) {
      case "kekse":
        System.out.println( "Ich mag Keeeekse" );
        break;
      case "kuchen":
        System.out.println( "Ich mag Kuchen" );
        break;
      case "schokolade":
      case "lakritze":
        System.out.println( "Hm. Lecker" );
        break;
      default:
        System.out.printf( "Kann man %s essen?", input );
        break;
    }
  }
}