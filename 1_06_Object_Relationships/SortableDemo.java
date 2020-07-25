import java.util.*;

interface Sortable<T extends Comparable<?>> {

  T[] getValues();

  void setValues( T[] values );

  default void sort() {
    T[] values = getValues();
    Arrays.sort( values );
    setValues( values );
  };
}

class RandomValues implements Sortable<Integer> {

  private List<Integer> values = new ArrayList<>();

  public RandomValues() {
    Random r = new Random();
    for ( int i = r.nextInt( 20 ) + 1; i > 0; i-- )
      values.add( r.nextInt( 10000 ) );
  }

  @Override
  public Integer[] getValues() {
    return values.toArray( new Integer[values.size()] );
  }

  @Override
  public void setValues( Integer[] values ) {
    this.values.clear();
    Collections.addAll( this.values, values );
  }
}

public class SortableDemo {

  public static void main( String[] args ) {
    RandomValues r = new RandomValues();
    System.out.println( Arrays.toString( r.getValues() ) );
    r.sort();
    System.out.println( Arrays.toString( r.getValues() ) );
  }
}
