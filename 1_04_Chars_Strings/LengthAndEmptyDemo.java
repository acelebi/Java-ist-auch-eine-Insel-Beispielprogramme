public class LengthAndEmptyDemo {
  
  /**
   * Checks if a String is {@code null} or empty ({@code ""}).
   *
   * <pre>
   * StringUtils.isNullOrEmpty(null) == true
   * StringUtils.isNullOrEmpty(&quot;&quot;) == true
   * StringUtils.isNullOrEmpty(&quot; &quot;) == false
   * StringUtils.isNullOrEmpty(&quot;bob&quot;) == false
   * StringUtils.isNullOrEmpty(&quot; bob &quot;) == false
   * </pre>
   *
   * @param str The String to check, may be {@code null}.
   * @return {@code true} if the String is empty or {@code null}, {@code false} otherwise.
   */
  public static boolean isNullOrEmpty( String str ) {
    return str == null || str.isEmpty();
  }

}
