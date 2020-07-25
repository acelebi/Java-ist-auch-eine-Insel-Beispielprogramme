public class InterestRates {

  public static void main( String[] args ) {
    double capital      = 20000 /* Euro */;
    double interestRate = 3.6 /* Prozent */;
    
    double totalInterestRate = capital * interestRate / 100;  // Jahr 1
    
    System.out.print( "Zinsen: " ); 
    System.out.println( totalInterestRate );  // 720.0
  }
}