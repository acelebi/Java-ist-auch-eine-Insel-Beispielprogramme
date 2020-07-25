import java.util.Arrays;

public class DogArrayToString {

  public static void main( String[] args ) {
    String[] dogs = {
        "Flocky Fluke", "Frizzi Faro", "Fanny Favorit", "Frosty Filius",
        "Face Flash", "Fame Friscco"};
    
    System.out.println( dogs );                  // [Ljava.lang.String;@10b62c9
    
    System.out.println( Arrays.toString(dogs) ); // [Flocky Fluke, ...]
  }
}
