public class EMailSpamChecker {

  public static void main( String[] args ) {
    String email1 = "Hallo Chris...,";
    System.out.println( containsSpam( email1 ) );  // false
    String email2 = "Kaufe Viagra! Noch billiga und macht noch härta!";
    System.out.println( containsSpam( email2 ) );  // true
  }
  
  public static boolean containsSpam( String text ) {
    return text.contains( "Viagra" ) || text.contains( "Ding-Dong-Verlängerung" );
  }
}
