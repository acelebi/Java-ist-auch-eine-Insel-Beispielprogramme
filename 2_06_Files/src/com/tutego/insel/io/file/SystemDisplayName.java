package com.tutego.insel.io.file;

import java.io.File;
import javax.swing.filechooser.FileSystemView;

public class SystemDisplayName {
  public static void main( String[] args ) {
    FileSystemView view = FileSystemView.getFileSystemView();

    for ( File f : File.listRoots() )
      System.out.println( view.getSystemDisplayName( f ) );
  }
}
