public class AutoConvert {

  @SuppressWarnings( "unused" )
  public static void main( String[] args ) {
    int   i1 = 1, i2 = 2;
    int   i3 = i1 + i2;
    long  l1 = 1, l2 = 2;
    long  l3 = l1 + l2;

    short s1 = 1, s2 = 2;
    byte  b1 = 1, b2 = 2;

//    short s3 = s1 + s2;  // Type mismatch: cannot convert from int to short
//    byte  b3 = b1 + b2;  // Type mismatch: cannot convert from int to byte

    short s3 = (short)( s1 + s2 );
    byte  b3 =  (byte)( b1 + b2 );
  }
}