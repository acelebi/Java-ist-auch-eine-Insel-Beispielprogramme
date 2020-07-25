import java.awt.Point;

public class DrawPlayerAndSnake {

  static void initializeToken( Point p ) {
    int randomX = (int)(Math.random() * 40); // 0 <= x < 40
    int randomY = (int)(Math.random() * 10); // 0 <= y < 10
    p.setLocation( randomX, randomY );
  }

  static void printScreen( Point playerPosition,
                           Point snakePosition ) {
    for ( int y = 0; y < 10; y++ ) {
      for ( int x = 0; x < 40; x++ ) {
        if ( playerPosition.distanceSq( x, y ) == 0 )     System.out.print( '&' );
        else if ( snakePosition.distanceSq( x, y ) == 0 ) System.out.print( 'S' );
        else System.out.print( '.' );
      }
      System.out.println();
    }
  }

  public static void main( String[] args ) {
    Point playerPosition = new Point();
    Point snakePosition = new Point();
    System.out.println( playerPosition );
    System.out.println( snakePosition );
    initializeToken( playerPosition );
    initializeToken( snakePosition );
    System.out.println( playerPosition );
    System.out.println( snakePosition );
    printScreen( playerPosition, snakePosition );
  }
}