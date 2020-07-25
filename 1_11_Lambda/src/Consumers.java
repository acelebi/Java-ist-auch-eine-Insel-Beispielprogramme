import java.util.function.*;
import java.util.logging.Logger;

class Consumers {
  public static <T> Consumer<T> measuringConsumer( Consumer<T> block ) {
    return t -> {
      long start = System.nanoTime();
      block.accept( t );
      long duration = System.nanoTime() - start;
      Logger.getAnonymousLogger().info( "Ausführungszeit (ns): " + duration );
    };
  }
}