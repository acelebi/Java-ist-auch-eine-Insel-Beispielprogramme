package com.tutego.insel.junit.hamcrest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;
import java.util.*;
import org.junit.Test;

public class HamcrestCollectionDemo
{
  @Test
  public void testHamcrestMatcher()
  {
    List<String> list = new ArrayList<>();
    Collections.addAll( list, "a", "b", "c", "d", "e" );
    list.removeAll( Arrays.asList( "b", "d" ) );

    assertThat( list, hasSize(3) );
    assertThat( list, both( hasItems( "a", "c", "e" ) ).and( not( hasItems( "b", "d" ) ) ) );
  }
}