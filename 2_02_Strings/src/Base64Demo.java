import java.security.SecureRandom;
import java.util.*;

public class Base64Demo {

  public static void main( String[] args ) {
    byte[] bytes1 = SecureRandom.getSeed( 20 );
    
    // byte[] -> String
    String s = Base64.getEncoder().encodeToString( bytes1 );
    System.out.println( s );  // z.B. TVST9v+JMk/vVUOSENmIcriXFLo=
    
    // String -> byte[]
    byte[] bytes2 = Base64.getDecoder().decode( s );
    System.out.println( Arrays.equals(bytes1, bytes2) );    // true
  }
}