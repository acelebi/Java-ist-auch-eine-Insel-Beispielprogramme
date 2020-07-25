import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExFindBold {

  public static void main( String args[] ) {
    Pattern pattern = Pattern.compile( "<b>.*?</b>" );
    Matcher matcher = pattern.matcher( "Echt <b>fett</b>. <b>Cool</b>!" );
    
    while ( matcher.find() )
      System.out.println( matcher.group() );
  }
}
