import com.tutego.weekday.Weekday;

public class WeekdayDemo {

  @SuppressWarnings("incomplete-switch")
  public static void main( String[] args ) {
    Weekday day = Weekday.MONDAY;

    switch ( day ) {
      case SATURDAY:
      case SUNDAY: System.out.println( "Wochenende. Party!" );
    }

    //

    for ( Weekday d : Weekday.values() )       // oder Weekday.class.getEnumConstants() 
      System.out.println( "Name=" + d.name() );

    //

    System.out.println( Weekday.FRIDAY );                 // FRIDAY
  }
}