public class GameUtils {

  public static final int MAX_ID_LEN = 20 /* chars */;

  public static boolean isGameIdentifier( String name ) {
    if ( name == null )
      return false;

    return name.length() <= MAX_ID_LEN && name.matches( "\\w+" );
  }
}