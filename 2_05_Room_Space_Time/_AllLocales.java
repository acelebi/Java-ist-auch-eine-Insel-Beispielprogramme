import java.util.Locale;
import static java.lang.System.out;

public class _AllLocales
{
  public static void main( String[] args )
  {
    System.out.println( Locale.getAvailableLocales().length );

    for ( Locale l : Locale.getAvailableLocales() )
    {                                            // Beispiel für Deutschland
      out.print( l.getCountry() + ", " );        // DE
      out.print( l.getLanguage() + ", " );       // de
      out.print( l.getVariant() + ", " );        //
    
      out.print( l.getDisplayName() + ", " );    // Deutsch (Deutschland)
      out.print( l.getDisplayCountry() + ", " ); // Deutschland
      out.print( l.getDisplayLanguage() + ", " );// Deutsch
      out.print( l.getDisplayName() + ", " );    // Deutsch (Deutschland)
      out.print( l.getDisplayVariant() + ", " ); //  
    
      out.print( l.getISO3Country() + ", " );    // DEU
      out.println( l.getISO3Language() );        // deu
    }
  }
}
