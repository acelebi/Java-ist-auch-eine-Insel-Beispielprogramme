package com.tutego.insel.io.file;

import java.io.File;
import java.io.FileNotFoundException;

import sun.awt.shell.ShellFolder;

public class ShellFolderDemo
{
  public static void main( String[] args ) throws FileNotFoundException
  {
    String s = "C:\\Dokumente und Einstellungen\\All Users\\Startmenü\\Programmzugriff und -standards.lnk";
    ShellFolder folder = ShellFolder.getShellFolder( new File( s ) );
    System.out.println( folder.getFolderType() );     // Verknüpfung
    if ( folder.isLink() )
      System.out.println( folder.getLinkLocation() ); // C:\WINDOWS\system32\control.exe
  }
}
