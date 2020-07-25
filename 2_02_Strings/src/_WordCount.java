public class _WordCount {

  public static void main( String[] args ) {
    String string = "Es kann jeden treffen. Auch dich!";
    int nrOfWords = string.split( "(\\s|\\p{Punct})+" ).length;
    System.out.println( nrOfWords );  // 6
  }
}