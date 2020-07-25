public class TypecastPrimRef {

  @SuppressWarnings("unused")
  public static void main( String[] args ) {
    //  String s = (String) 1;    // Cannot cast from int to String
    //  int i = (int) "1";        // Cannot cast from String to int
    Long lông = (Long) 2L;        // Or: Long lông = 2L;
    System.out.println( (Boolean) true );
    ((Integer)2).toString();
  }
}
