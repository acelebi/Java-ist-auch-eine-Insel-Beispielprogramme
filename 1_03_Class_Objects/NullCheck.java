public class NullCheck {

  public static void main( String[] args ) {
    String s = javax.swing.JOptionPane.showInputDialog( "Eingabe" );
    if ( s != null && ! s.isEmpty() )
      System.out.println( "Eingabe: " + s );
    else
      System.out.println( "Abbruch oder keine Eingabe" );
  }
}
