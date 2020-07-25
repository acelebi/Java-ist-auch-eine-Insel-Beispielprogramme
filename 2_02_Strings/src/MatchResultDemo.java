import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchResultDemo {

  static Iterable<MatchResult> findMatches( String pattern, CharSequence s ) {
    Collection<MatchResult> results = new ArrayList<>();

    for ( Matcher m = Pattern.compile(pattern).matcher(s); m.find(); )
      results.add( m.toMatchResult() );

    return results;
  }

  public static void main( String[] args ) {
    String pattern = "\\d{9,10}[\\dxX]";
    String s = "Insel: 3836228734, Reguläre Ausdrücke: 3897213494";

    for ( MatchResult r : findMatches( pattern, s ) )
      System.out.println( r.group() + " von " + r.start() + " bis " + r.end() );
  }
}