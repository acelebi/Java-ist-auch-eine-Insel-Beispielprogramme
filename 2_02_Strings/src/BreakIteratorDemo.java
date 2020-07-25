import java.text.BreakIterator;

class BreakIteratorDemo {

  static void out( String s, BreakIterator iter ) {
    iter.setText( s );
  
    for ( int last = iter.first(),next = iter.next();
          next != BreakIterator.DONE;
          last = next, next = iter.next() ) {
      CharSequence part = s.subSequence( last, next );
  
      if ( Character.isLetterOrDigit( part.charAt( 0 ) ) )
        System.out.println( part );
    }
  }

  public static void main( String[] args ) {
    String helmutKohl1 = "Ich weiß, dass ich 1945 fünfzehn war und 1953 achtzehn.",
           helmutKohl2 = "Das ist eine klassische journalistische Behauptung. " +
           		           "Sie ist zwar richtig, aber sie ist nicht die Wahrheit.";
  
    BreakIterator sentenceIter = BreakIterator.getSentenceInstance();
    BreakIterator wordIter     = BreakIterator.getWordInstance();
    BreakIterator lineIter     = BreakIterator.getLineInstance();
  
    out( helmutKohl1, sentenceIter );
    out( helmutKohl2, sentenceIter );
  
    System.out.println( "-----------------" );
    
    out( helmutKohl1, wordIter );
    out( helmutKohl2, wordIter );
    
    System.out.println( "-----------------" );
  
    out( helmutKohl1, lineIter );
    out( helmutKohl2, lineIter );
  }
}
