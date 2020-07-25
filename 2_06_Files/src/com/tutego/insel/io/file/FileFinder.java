package com.tutego.insel.io.file;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class FileFinder {
  public static List<File> find( String start, String extensionPattern ) {
    List<File> files = new ArrayList<>( 1024 );
    Queue<File> dirs = Collections.asLifoQueue( new LinkedList<File>() );
    File startdir = new File( start );
    Pattern p = Pattern.compile( extensionPattern, Pattern.CASE_INSENSITIVE );

    if ( startdir.isDirectory() )
      dirs.add( startdir );

    while ( dirs.size() > 0 )
      for ( File file : dirs.remove().listFiles() )
        if ( file.isDirectory() )
          dirs.add( file );
        else if ( p.matcher( file.getName() ).matches() )
          files.add( file );

    return files;
  }
}
