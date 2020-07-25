import java.time.LocalDate;
import java.util.*;

public interface PropertyReader {

  Properties DEFAULT_PROPERTIES = new Properties();

  $$ $ = new $$();

  static class $$ {
    static {
      DEFAULT_PROPERTIES.setProperty( "date", LocalDate.now().toString() );
    }
  }

  Properties getProperties();
}