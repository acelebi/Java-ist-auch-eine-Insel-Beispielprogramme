public class SwitchBreak {

  public static void main( String[] args ) {
    String dnaBases = "CGCAGTTCTTCGGXAC";
    int a = 0, g = 0, c = 0, t = 0;

    loop:
    for ( int i = 0; i < dnaBases.length(); i++ ) {
      switch ( dnaBases.charAt( i ) ) {
        case 'A': case 'a':
          a++;
          break;
        case 'G': case 'g':
          g++;
          break;
        case 'C': case 'c':
          c++;
          break;
        case 'T': case 't':
          t++;
          break;
        default:
          System.err.println( "Unbekannte Nukleinbasen " + dnaBases.charAt( i ) );
          break loop;
      }
    }
    
    System.out.printf( "Anzahl: A=%d, G=%d, C=%d, T=%d%n", a, g, c, t );
  }
}