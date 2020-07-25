package com.tutego.insel.junit.vdf.v2;

import java.io.*;
import java.nio.file.*;

public class VCard
{
  public String formattedName;
  public String email;

  public void export( Writer out ) throws IOException
  {
    out.write( toString() );
  }

  public void export( String filename ) throws IOException
  {
    try ( Writer writer = Files.newBufferedWriter( Paths.get( filename ) ) ) { 
      export( writer );
    }
  }

  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder( "BEGIN:VCARD\n" );
    if ( formattedName != null && ! formattedName.isEmpty() )
      result.append( "FN:" ).append( formattedName ).append( "\n" );
    if ( email != null && ! email.isEmpty() )
      result.append( "EMAIL:" ).append( email ).append( "\n" );
    return result.append( "END:VCARD" ).toString();
  }

//  public static void main( String[] args ) throws IOException
//  {
//    VCardWriter w = new VCardWriter();
//    w.formattedName = "Powerpuff Girls";
//    w.email = "powerpuff@townsville.com";
//    System.out.println( w );
//  }
}
