package com.tutego.insel.junit.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StringUtilsTest
{
  @Test
  public void testReverse()
  {
    assertEquals( "", StringUtils.reverse( "" ) );
    assertEquals( "cba", StringUtils.reverse( "abc" ) );

    try
    {
      StringUtils.reverse( null );

      fail( "reverse(null) should throw IllegalArgumentException" );
    }
    catch ( IllegalArgumentException e )
    {
    }
  }

  @Test(expected = IllegalArgumentException.class)
  public void testReverseException()
  {
    StringUtils.reverse( null );
  }
}
