public class ShareData {

  private static int data;
  
  public void memorize( int data ) {
    ShareData.data = data;
  }

  public int retrieve() {
    return data;
  }
  
  public static void main( String[] args ) {
    ShareData s1 = new ShareData();
    ShareData s2 = new ShareData();
    
    s1.memorize( 2 );
    
    System.out.println( s2.retrieve() );    // ist 2
  }
}