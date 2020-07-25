import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExAllNumbers {

  public static void main( String args[] ) {
    String s = "'Demnach, welcher verheiratet, der tut wohl; welcher aber nicht verheiratet, der tut besser.'" +
    		       " 1. Korinther 7, 38";
    Matcher matcher = Pattern.compile( "\\d+" ).matcher( s );

    while ( matcher.find() )
      System.out.printf( "%s an Position [%d,%d]%n", matcher.group(), matcher.start(), matcher.end() );
  }
}
