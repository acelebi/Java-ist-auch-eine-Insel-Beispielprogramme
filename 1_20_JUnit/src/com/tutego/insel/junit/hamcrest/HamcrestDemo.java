package com.tutego.insel.junit.hamcrest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class HamcrestDemo
{
  @Test
  public void testHamcrestMatcher()
  {
    assertThat( null + "", is( notNullValue() ) );
    assertThat( "", is( equalTo( "" ) ) );
    assertThat( 1L, is( sameInstance( Long.valueOf( 1 ) ) ) );
    assertThat( 1000L, is( not( sameInstance( Long.valueOf( 1000 ) ) ) ) );
  }
}