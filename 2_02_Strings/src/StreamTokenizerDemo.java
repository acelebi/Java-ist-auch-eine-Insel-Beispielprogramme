import java.io.*;
import java.net.URL;

class StreamTokenizerDemo {
  public static void main( String[] args ) throws IOException {
    URL url = new URL( "http://www.tutego.com/index.html" );
    Reader reader = new InputStreamReader( url.openStream() );
    StreamTokenizer st = new StreamTokenizer( reader );

//     st.slashSlashComments( true ); */
    st.slashStarComments( true );
    st.ordinaryChar( '/' );
    st.parseNumbers();
    st.eolIsSignificant( true );

    for ( int tval; (tval = st.nextToken()) != StreamTokenizer.TT_EOF; ) {
      if ( tval == StreamTokenizer.TT_NUMBER )
        System.out.println( "Nummer: " + st.nval );
      else if ( tval == StreamTokenizer.TT_WORD )
        System.out.println( "Wort: " + st.sval );
      else if ( tval == StreamTokenizer.TT_EOL )
        System.out.println( "Ende der Zeile" );

      else
        System.out.println( "Zeichen: " + (char) st.ttype );
    }
  }
}