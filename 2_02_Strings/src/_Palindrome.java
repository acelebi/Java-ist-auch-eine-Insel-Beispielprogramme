import java.text.*;

class _Palindrome {
  
  public static void traverseBackward( CharacterIterator it ) {
    for ( char c = it.last();
          c != CharacterIterator.DONE;
          c = it.previous() )
      System.out.print( c );
  }
		
  public static void main( String[] args ) {
    StringCharacterIterator it;
  	
    it = new StringCharacterIterator( "Na, Fakir, Paprika-Fan?" );

    traverseBackward( it );
   
    System.out.println();

    it = new StringCharacterIterator(
      "Die Liebe ist Sieger, rege ist sie bei Leid." );

    traverseBackward( it );

    System.out.println();
  }
}