class InnerVsLambdaThis {

  InnerVsLambdaThis() {
    Runnable lambdaRun = () -> System.out.println( this.getClass().getName() );
    Runnable innerRun  = new Runnable() {
      @Override public void run() { System.out.println( this.getClass().getName()); }
    };
  
    lambdaRun.run();      // InnerVsLambdaThis
    innerRun.run();       // InnerVsLambdaThis$1
  }

  public static void main( String[] args ) {
    new InnerVsLambdaThis();
  }
}
