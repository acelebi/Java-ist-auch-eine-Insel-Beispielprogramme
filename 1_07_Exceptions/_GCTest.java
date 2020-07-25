class _GCTest
{
  public static void main( String[] args )
  {
    long totalMem = 0, freeMem = 0;

    int pFree = 0;

    double pctFree;

    int count = 0;

    Object objArray[];

    int max;

    // max = Integer.valueOf(args[0]);
    max = 5000000;

    try
    {
      objArray = new Object[max];

      count = 0;

      for ( int i = 0; i < max; i++ )
      {
        freeMem = Runtime.getRuntime().freeMemory();

        totalMem = Runtime.getRuntime().totalMemory();

        pctFree = (double) freeMem / (double) totalMem;

        pFree = (int) (100.0 * pctFree);

        if ( i % 1000 == 0 )
          System.err.println( "DATA: " + pFree + "% free " + " total = "
                              + totalMem + " free = " + freeMem + " count = "
                              + count );

        objArray[i] = new byte[1];
        count++;
      }
    }
    catch ( Throwable thr )
    {
      System.err.println( "Caught " + thr.getClass().getName() );
      System.err.println( thr.getMessage() );
      thr.printStackTrace();
      System.err.println( "FAILED: " + pFree + "% free " + " total = "
                          + totalMem + " free = " + freeMem + " count = "
                          + count );
    }
  }
}