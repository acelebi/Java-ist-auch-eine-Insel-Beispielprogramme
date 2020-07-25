import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearchAndReplace {

  public static void main( String[] args ) {
    String  text    = "Hi, schau mal bei http://stackoverflow.com/ oder http://www.tutego.de/ vorbei.";
    String  regex   = "http://[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,3}(\\S*)?";
    Matcher matcher = Pattern.compile(  regex ).matcher( text );
    StringBuffer sb = new StringBuffer( text.length() );
    
    while ( matcher.find() )
      matcher.appendReplacement( sb, "<a href=\"$0\">$0</a>" );
    
    matcher.appendTail( sb );
    
    System.out.println( sb );
  }
}