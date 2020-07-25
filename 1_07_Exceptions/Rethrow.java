import java.net.*;

public class Rethrow {

  public static URI createUriFromHost( String host ) throws URISyntaxException {
    try {
      return new URI( "http://" + host );
    }
    catch ( URISyntaxException e ) {
      System.err.println( "Hilfe! " + e.getMessage() );
      throw e;
    }
  }

  public static void main( String[] args ) {
    try {
      createUriFromHost( "tutego.de" );
      createUriFromHost( "%" );
    }
    catch ( URISyntaxException e ) {
      e.printStackTrace();
    }
  }
}