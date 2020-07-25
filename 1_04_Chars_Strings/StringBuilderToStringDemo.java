import java.util.Objects;

public class StringBuilderToStringDemo {

  public static String join( Object... strings ) {
    Objects.requireNonNull( strings, "Actual parameter is not allowed to be null" );

    StringBuilder result = new StringBuilder();

    for ( Object string : strings )
      result.append( string );
    
    return result.toString();
  }
  
  public static void main( String[] args ) {
    System.out.println( join("Aus", ' ', "die Maus" ) );
  }
}