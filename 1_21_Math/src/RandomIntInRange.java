public class RandomIntInRange {
  public static long random( long min, long max ) {
    return min + Math.round( Math.random() * (max - min) );
  }
}
