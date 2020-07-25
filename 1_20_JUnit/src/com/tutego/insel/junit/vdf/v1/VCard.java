package com.tutego.insel.junit.vdf.v1;

import java.io.IOException;
import java.nio.file.*;
import java.util.Collections;

public class VCard
{
  public String formattedName;
  public String email;

  public void export( String filename ) throws IOException
  {
    StringBuilder result = new StringBuilder( "BEGIN:VCARD\n" );
    if ( formattedName != null && ! formattedName.isEmpty() )
      result.append( "FN:" ).append( formattedName ).append( "\n" );
    if ( email != null && ! email.isEmpty() )
      result.append( "EMAIL:" ).append( email ).append( "\n" );
    Files.write( Paths.get( filename ), Collections.singleton( result.append( "END:VCARD" ) ) );
  }
}
