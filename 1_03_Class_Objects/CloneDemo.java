import java.awt.Point;

public class CloneDemo {

  public static void main( String[] args ) {
    int[] sourceArray = new int[ 6 ];
    sourceArray[ 0 ]  = 4711;
    int[] targetArray = sourceArray.clone();
    System.out.println( targetArray.length );  // 6
    System.out.println( targetArray[ 0 ] );    // 4711
    
    Point[] pointArray1 = { new Point(1, 2), new Point(2, 3) };
    Point[] pointArray2 = pointArray1.clone();
    
    System.out.println( pointArray1[ 0 ] == pointArray2[ 0 ] );  // true
  }
}
