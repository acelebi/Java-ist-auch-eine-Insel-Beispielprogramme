public class ContinueInput {

  public static void main( String[] args ) {
    int number = 0;
    
    while ( true ) {
      try {
        String s = javax.swing.JOptionPane.showInputDialog( "Bitte Zahl eingeben" );
        number = Integer.parseInt( s );
        
        break;
      }
      catch ( NumberFormatException e ) {
        System.err.println( "Das war keine Zahl!" );
      }
    }

    System.out.println( "Danke f�r die Zahl " + number );
    System.exit( 0 );
  }
}