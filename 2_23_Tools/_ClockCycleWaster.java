import java.util.Date;

public class _ClockCycleWaster {

  StringBuffer result = new StringBuffer();

  _ClockCycleWaster() {
    wasteWithDates();
    wasteWithThreads();
    try {
      Thread.sleep( 10 );
    }
    catch ( InterruptedException e ) {
    }
  }

  void wasteWithThreads() {
    new Thread( new Runnable() {
      @Override
      public void run() {
        result.append( Thread.currentThread() );
      }
    } ).start();
  }

  void wasteWithDates() {
    result.append( new Date() );
    result.setLength( 10000 );
  }

  public static void main( String[] args ) {
    while ( true )
      new _ClockCycleWaster();
  }
}