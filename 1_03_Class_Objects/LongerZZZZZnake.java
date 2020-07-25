import java.awt.Point;
import java.util.Arrays;

public class LongerZZZZZnake {

  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    Point playerPosition   = new Point( 10, 9 );
    Point goldPosition     = new Point( 6, 6 );
    Point doorPosition     = new Point( 0, 5 );
    Point[] snakePositions = new Point[5];
    int snakeIdx = 0;
    snakePositions[ snakeIdx ] = new Point( 30, 2 );
    boolean rich = false;

    while ( true ) {
      if ( rich && playerPosition.equals( doorPosition ) ) {
        System.out.println( "Gewonnen!" );
        break;
      }
      if ( Arrays.asList( snakePositions ).contains( playerPosition ) ) {
        System.out.println( "ZZZZZZZ. Die Schlange hat dich!" );
        break;
      }
      if ( playerPosition.equals( goldPosition ) ) {
        rich = true;
        goldPosition.setLocation( -1, -1 );
      }

      // Raster mit Figuren zeichnen

      for ( int y = 0; y < 10; y++ ) {
        for ( int x = 0; x < 40; x++ ) {
          Point p = new Point( x, y );
          if ( playerPosition.equals( p ) )
            System.out.print( '&' );
          else if ( Arrays.asList( snakePositions ).contains( p ) )
            System.out.print( 'S' );
          else if ( goldPosition.equals( p ) )
            System.out.print( '$' );
          else if ( doorPosition.equals( p ) )
            System.out.print( '#' );
          else
            System.out.print( '.' );
        }
        System.out.println();
      }

      // Konsoleneingabe und Spielerposition verändern

      switch ( new java.util.Scanner( System.in ).next() ) {
        case "h" : playerPosition.y = Math.max(  0, playerPosition.y - 1 ); break; 
        case "t" : playerPosition.y = Math.min(  9, playerPosition.y + 1 ); break; 
        case "l" : playerPosition.x = Math.max(  0, playerPosition.x - 1 ); break; 
        case "r" : playerPosition.x = Math.min( 39, playerPosition.x + 1 ); break; 
      }

      // Schlange bewegt sich Richtung Spieler

      Point snakeHead = new Point( snakePositions[snakeIdx].x,
                                   snakePositions[snakeIdx].y );

      if ( playerPosition.x < snakeHead.x )
        snakeHead.x--;
      else if ( playerPosition.x > snakeHead.x )
        snakeHead.x++;
      if ( playerPosition.y < snakeHead.y )
        snakeHead.y--;
      else if ( playerPosition.y > snakeHead.y )
        snakeHead.y++;

      snakeIdx = (snakeIdx + 1) % snakePositions.length;
      snakePositions[snakeIdx] = snakeHead;
    } // end while
  }
}