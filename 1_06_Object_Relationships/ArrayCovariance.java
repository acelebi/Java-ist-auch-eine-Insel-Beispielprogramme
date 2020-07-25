public class ArrayCovariance {

  public static void set( Object[] array, Object element ) {
    array[ 0 ] = element;
  }

  public static void main( String[] args ) {
    Object[] objectArray = new Object[ 1 ];
    String[] stringArray = new String[ 1 ];
    System.out.println( "It's time for change" instanceof Object );  // true
    System.out.println( stringArray instanceof String[] );           // true

    set( stringArray, "It's time for change" );
    set( objectArray, "It's time for change" );

    set( stringArray, new StringBuilder("It's time for change") );  // BUM! ArrayStoreException
    set( stringArray, new Object() );
  }
}