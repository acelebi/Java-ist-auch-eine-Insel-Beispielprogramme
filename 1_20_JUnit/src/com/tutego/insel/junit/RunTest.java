package com.tutego.insel.junit;

import org.junit.runner.JUnitCore;

import com.tutego.insel.junit.util.StringUtilsTest;

public class RunTest
{
  public static void main( String[] args )
  {
    JUnitCore.main( StringUtilsTest.class.getName() );
  }
}
