public class Password {

  private String password = "";

  public void assign( String oldPassword, String newPassword ) {
    if ( password.equals(oldPassword) && newPassword != null ) {
      password = newPassword;

      System.out.println( "Passwort gesetzt." );
    }
    else
      System.out.println( "Passwort konnte nicht gesetzt werden." );
  }

  public boolean check( String passwordToCheck ) {
    return password.equals( passwordToCheck );
  }
}