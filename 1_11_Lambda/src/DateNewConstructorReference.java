import java.util.*;

public class DateNewConstructorReference {

  public static void main( String[] args ) {
    Long[] timestamps = { 2432558632L, 1455872986345L };
    Date date = new GregorianCalendar( 2012, Calendar.JANUARY, 1 ).getTime();
    Arrays.stream( timestamps )
          .map( Date::new )
          .filter( date::before )
          .forEach( System.out::println );  // Fri Feb 19 10:09:46 CET 2016
  }
}
