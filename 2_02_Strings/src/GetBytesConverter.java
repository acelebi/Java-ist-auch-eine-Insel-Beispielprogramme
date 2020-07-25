import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GetBytesConverter {

  public static void main( String[] args ) {
    try {
      System.out.println( "Ich kann Ä Ü Ö und ß" );

      PrintWriter out = new PrintWriter(
        new OutputStreamWriter( System.out, "Cp850") );
      
      out.println( "Ich kann Ä Ü Ö und ß" );
      out.flush();
    }
    catch ( UnsupportedEncodingException e ) { e.printStackTrace(); }
  }
}
