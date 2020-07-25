package com.tutego.insel.junit.util;

import static net.time4tea.rsync.matcher.FileMatchers.exists;
import static net.time4tea.rsync.matcher.FileMatchers.sized;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;
import java.io.*;
import java.util.*;
import org.hamcrest.Matcher;
import org.junit.Test;

public class HamcrestTest
{
  @Test
  public void testHamcrest()
  {
    List<String> list = new ArrayList<>();
    Collections.addAll( list, "a", "b", "c", "d", "e" );

    list.removeAll( Arrays.asList( "b", "d" ) );

    assertThat( list, hasSize(3) );
    assertThat( list, both( hasItems( "a", "c", "e" ) ).and( not( hasItems( "b", "d" ) ) ) );
  }
  
  @Test
  public void testHamcrestFile()
  {
    try
    {
      File f = File.createTempFile( "aaa", "tmp" );
      assertThat( f, allOf( exists(), sized( (Matcher<Long>)equalTo( 0L ) ) ) );
    }
    catch ( IOException e )
    {
      e.printStackTrace();
    }
  }
}
