import java.awt.Point;
import java.awt.Polygon;

class AwtWithImport {

  public static void main( String[] args ) {
    Point p = new Point();
    Polygon poly = new Polygon();
    poly.addPoint( 10, 10 );
    poly.addPoint( 10, 20 );
    poly.addPoint( 20, 10 );

    System.out.println( p );                          // java.awt.Point[x=0,y=0]
    System.out.println( poly.contains( 15, 15 ) );    // false
  }
}
