import java.io.IOException;
import java.net.*;

public class NestedException {

  public static boolean isAvailable( String url ) {
    try {
      HttpURLConnection.setFollowRedirects( false );
      HttpURLConnection con = (HttpURLConnection)(new URL( url ).openConnection());
      return con.getResponseCode() == HttpURLConnection.HTTP_OK;
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
//      RuntimeException e2 = new RuntimeException();
//      e2.initCause( e );
//      throw e2;
    }
  }
  
  public static void main( String[] args ) {
    System.out.println( isAvailable( "http://laber.rabar.ber/" ) ); // false
    System.out.println( isAvailable( "http://www.tutego.de/" ) );   // true
    System.out.println( isAvailable( "taube://sonsbeck/schlosstrasse/5/" ) );
  }
}
