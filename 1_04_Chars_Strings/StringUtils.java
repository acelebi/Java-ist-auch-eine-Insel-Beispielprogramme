public class StringUtils {

  /**
   * Returns the substring before the first occurrence of a delimiter. The
   * delimiter is not part of the result.
   * 
   * @param string    String to get a substring from.
   * @param delimiter String to search for.
   * @return          Substring before the first occurrence of the delimiter.
   */
  public static String substringBefore( String string, String delimiter ) {
    int pos = string.indexOf( delimiter );

    return pos >= 0 ? string.substring( 0, pos ) : string;
  }

  /**
   * Returns the substring after the first occurrence of a delimiter. The
   * delimiter is not part of the result.
   * @param string    String to get a substring from.
   * @param delimiter String to search for.
   * @return          Substring after the last occurrence of the delimiter.
   */
  public static String substringAfter( String string, String delimiter ) {
    int pos = string.indexOf( delimiter );

    return pos >= 0 ? string.substring( pos + delimiter.length() ) : "";
  }
}