package com.tutego.insel.jdbc;

import java.sql.*;

public class FirstSqlAccess {
  public static void main( String[] args ) {
    try {
      Class.forName( "org.hsqldb.jdbcDriver" );
    }
    catch ( ClassNotFoundException e ) {
      System.err.println( "Keine Treiber-Klasse!" );
      return;
    }

    String url = "jdbc:hsqldb:file:TutegoDB;shutdown=true";
    try ( Connection con = DriverManager.getConnection( url, "sa", "" );
          Statement stmt = con.createStatement() ) {

//      stmt.executeUpdate( "INSERT INTO CUSTOMER VALUES(" +
//      		                "50,'Christian','Ullenboom','Immengarten 6','Hannover')" );

      try ( ResultSet rs = stmt.executeQuery( "SELECT * FROM Customer" ) ) {
        while ( rs.next() )
          System.out.printf( "%s, %s %s%n", rs.getString(1),
                             rs.getString(2), rs.getString(3) );
      }
    }
    catch ( SQLException e ) {
      e.printStackTrace();
    }
  }
}