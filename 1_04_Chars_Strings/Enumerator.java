public class Enumerator {
  
  public static String enumerate( String... lines ) {
    if ( lines == null || lines.length == 0 )
      return "";

    StringBuilder sb = new StringBuilder();

    for ( int i = 0; i < lines.length; i++ ) {
      sb.append( i + 1 );
      sb.append( ". " );
      sb.append( lines[i] );
      sb.append( System.lineSeparator() );
    }

    return sb.toString().trim();
  }

  public static void main( String[] args ) {
    System.out.println( enumerate( "Aufstehen", "Frühstücken" ) );
  }
}