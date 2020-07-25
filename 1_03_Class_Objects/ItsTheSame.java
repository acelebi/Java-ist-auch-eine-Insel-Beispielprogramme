import java.awt.Point;

public class ItsTheSame {

  public static void main( String[] args ) {
    Point p = new Point();
    Point q = p;
    p.x = 10;
    System.out.println( q.x ); // 10
    q.y = 5;
    System.out.println( p.y ); // 5
  }
}