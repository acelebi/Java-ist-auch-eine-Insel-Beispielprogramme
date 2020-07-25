package com.tutego.insel.jdbc;

import java.sql.SQLException;

import javax.sql.rowset.*;

public class CachedRowSetDemo {
  public static void main( String[] args ) throws SQLException {
    try ( CachedRowSet crset = RowSetProvider.newFactory().createCachedRowSet() ) {
      crset.setDataSourceName( "TutegoDS" );
      crset.setCommand( "SELECT * FROM Customer" );
      crset.execute();
    
      while ( crset.next() )
        System.out.println( crset.getString( 1 ) );
    }
  }
}