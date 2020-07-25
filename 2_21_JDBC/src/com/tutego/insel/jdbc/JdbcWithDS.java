package com.tutego.insel.jdbc;

import java.sql.*;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcWithDS {
  public static void main( String[] args ) throws Exception {
    DataSource dataSource = (DataSource) new InitialContext().lookup( "TutegoDS" );
    String sql = "SELECT * FROM Customer";
    try ( Connection con = dataSource.getConnection();
          ResultSet rs = con.createStatement().executeQuery( sql )  ) {
      while ( rs.next() )
        System.out.printf( "%s, %s %s%n", rs.getString( 1 ), rs.getString( 2 ),
                           rs.getString( 3 ) );
    }
  }
}