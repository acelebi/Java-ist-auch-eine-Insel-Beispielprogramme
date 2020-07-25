import java.awt.Point;
import java.util.Arrays;

public class FivePlayers {

  public static void main( String[] args ) {
    Point[] players = new Point[ 5 ];

    for ( int i = 0; i < players.length; i++ )
      players[ i ] = new Point( (int)(Math.random() * 40),
                                (int)(Math.random() * 10) );

    for ( int y = 0; y < 10; y++ ) {
      for ( int x = 0; x < 40; x++ )
        if ( Arrays.asList( players ).contains( new Point(x,y) ) )
          System.out.print( "&" );
        else
          System.out.print( "." );
      System.out.println();
    }
  }
}