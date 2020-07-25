package com.tutego.insel.junit.util;

import org.junit.*;

public class FixtureDemoTest
{
  @BeforeClass
  public static void beforeClass()
  {
    System.out.println( "@BeforeClass" );
  }

  @AfterClass
  public static void afterClass()
  {
    System.out.println( "@AfterClass" );
  }

  @Before
  public void setUp()
  {
    System.out.println( "@Before" );
  }

  @After
  public void tearDown()
  {
    System.out.println( "@After" );
  }

  @Test
  public void test1()
  {
    System.out.println( "test 1" );
  }

  @Test
  public void test2()
  {
    System.out.println( "test 2" );
  }
}
