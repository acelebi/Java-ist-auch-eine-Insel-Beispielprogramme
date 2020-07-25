import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HeapUser {

  String string = "Hallo Welt";
  LocalDate date = LocalDate.now();
  ArrayList<String> list = new ArrayList<>( Arrays.asList( string, date.toString() ) );
  HeapUser heapUser;

  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    HeapUser h = new HeapUser();
    h.heapUser = h;
    new Scanner( System.in ).next();
    System.out.println( h.string );
  }
}
