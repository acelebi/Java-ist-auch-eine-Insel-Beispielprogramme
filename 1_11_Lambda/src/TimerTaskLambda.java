import java.util.*;

class TimerTaskLambda {
  public static TimerTask createTimerTask( Runnable runnable ) {
    return new TimerTask() {
      @Override public void run() {
        runnable.run();
      }
    };
  }

  public static void main( String[] args ) {
    new Timer().schedule( createTimerTask( ( ) -> System.out.println( "Hi" ) ), 500 );
  }
}