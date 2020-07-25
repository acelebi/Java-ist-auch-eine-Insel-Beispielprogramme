import java.util.Properties;

public class SystemPropertyReaderDemo implements PropertyReader {

  @Override public Properties getProperties() {
    return System.getProperties();
  }
  
  public static void main( String[] args ) {
    System.out.println( PropertyReader.DEFAULT_PROPERTIES ); // {date=Sat Apr 24 11:40:05 CEST 2010}
  }
}
