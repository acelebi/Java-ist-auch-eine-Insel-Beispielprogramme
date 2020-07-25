package com.tutego.insel.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.nio.file.*;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

public class UserDefinedFileAttributeViewDemo {
  public static void main( String[] args ) throws IOException {
    Path p = Paths.get( "src/lyrics.txt" );
    UserDefinedFileAttributeView attrs = Files.getFileAttributeView( p, UserDefinedFileAttributeView.class ); 
    List<String> attrsList = attrs.list();
    System.out.println( attrsList );    // []
    attrs.write( "last-user", ByteBuffer.wrap( "chris".getBytes( StandardCharsets.UTF_8 ) ) );
    System.out.println( attrs.list() ); // [last-user]
    ByteBuffer attrValue = ByteBuffer.allocate( attrs.size( "last-user" ) );
    attrs.read( "last-user", attrValue );
    attrValue.rewind();
    String value = StandardCharsets.UTF_8.decode( attrValue ).toString();
    System.out.println( value );       // chris
  }
}