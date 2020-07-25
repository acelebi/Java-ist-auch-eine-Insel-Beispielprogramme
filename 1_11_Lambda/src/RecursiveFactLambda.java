import java.util.function.IntFunction;

public class RecursiveFactLambda {

  public static IntFunction<Integer> fact =
      n -> (n == 0) ? 1 : n * RecursiveFactLambda.fact.apply( n - 1);

  public static void main( String[] args ) {
    System.out.println( fact.apply( 5 ) );   // 120
  }
}