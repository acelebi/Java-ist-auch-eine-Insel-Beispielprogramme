package com.tutego.insel.jdbc;

import java.sql.*;

public class SecondSqlAccess {
  public static void main( String[] args ) {
    String url = "jdbc:derby://localhost:1527/sample";
    String sql = "SELECT NAME, ADDRESSLINE1, PHONE FROM Customer";
    try ( Connection con = DriverManager.getConnection( url, "app", "app" );
          Statement stmt = con.createStatement();
          ResultSet rs = stmt.executeQuery( sql ) ) {
      while ( rs.next() )
        System.out.printf( "%s, %s %s%n", rs.getString(1),
                           rs.getString(2), rs.getString(3) );
    }
    catch ( SQLException e ) {
      e.printStackTrace();
    }
  }
}