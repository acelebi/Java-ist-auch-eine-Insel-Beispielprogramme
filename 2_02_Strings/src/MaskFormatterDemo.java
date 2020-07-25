import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class MaskFormatterDemo {

  public static void main( String[] args ) {
    try {
      MaskFormatter mf = new MaskFormatter( "**-**-****" );
      mf.setValueContainsLiteralCharacters( false );
      String valueToString = mf.valueToString( "12031973" );
      System.out.println( valueToString );       // 12-03-1973
      Object stringToValue = mf.stringToValue( valueToString );
      System.out.println( stringToValue );       // 12031973
    }
    catch ( ParseException e ) {
      e.printStackTrace();
    }
  }
}
