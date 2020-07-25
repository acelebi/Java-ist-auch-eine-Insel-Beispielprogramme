package net.time4tea.rsync.matcher;

import java.io.File;
import java.io.IOException;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class FileMatchers
{
  public static Matcher<File> isDirectory()
  {
    return new TypeSafeMatcher<File>()
    {
      File fileTested;

      @Override
      public boolean matchesSafely( File item )
      {
        fileTested = item;
        return item.isDirectory();
      }

      @Override
      public void describeTo( Description description )
      {
        description.appendText( " that " );
        description.appendValue( fileTested );
        description.appendText( "is a directory" );
      }
    };
  }

  public static Matcher<File> exists()
  {
    return new TypeSafeMatcher<File>()
    {
      File fileTested;

      @Override
      public boolean matchesSafely( File item )
      {
        fileTested = item;
        return item.exists();
      }

      @Override
      public void describeTo( Description description )
      {
        description.appendText( " that file " );
        description.appendValue( fileTested );
        description.appendText( " exists" );
      }
    };
  }

  public static Matcher<File> isFile()
  {
    return new TypeSafeMatcher<File>()
    {
      File fileTested;

      @Override
      public boolean matchesSafely( File item )
      {
        fileTested = item;
        return item.isFile();
      }

      @Override
      public void describeTo( Description description )
      {
        description.appendText( " that " );
        description.appendValue( fileTested );
        description.appendText( "is a file" );
      }
    };
  }

  public static Matcher<File> readable()
  {
    return new TypeSafeMatcher<File>()
    {
      File fileTested;

      @Override
      public boolean matchesSafely( File item )
      {
        fileTested = item;
        return item.canRead();
      }

      @Override
      public void describeTo( Description description )
      {
        description.appendText( " that file " );
        description.appendValue( fileTested );
        description.appendText( "is readable" );
      }
    };
  }

  public static Matcher<File> writable()
  {
    return new TypeSafeMatcher<File>()
    {
      File fileTested;

      @Override
      public boolean matchesSafely( File item )
      {
        fileTested = item;
        return item.canWrite();
      }

      @Override
      public void describeTo( Description description )
      {
        description.appendText( " that file " );
        description.appendValue( fileTested );
        description.appendText( "is writable" );
      }
    };
  }

  public static Matcher<File> sized( final Matcher<Long> size )
  {
    return new TypeSafeMatcher<File>()
    {
      File fileTested;
      long length;

      @Override
      public boolean matchesSafely( File item )
      {
        fileTested = item;
        length = item.length();
        return size.matches( length );
      }

      @Override
      public void describeTo( Description description )
      {
        description.appendText( " that file " );
        description.appendValue( fileTested );
        description.appendText( " is sized " );
        description.appendDescriptionOf( size );
        description.appendText( ", not " + length );
      }
    };
  }

  public static Matcher<File> named( final Matcher<String> name )
  {
    return new TypeSafeMatcher<File>()
    {
      File fileTested;

      @Override
      public boolean matchesSafely( File item )
      {
        fileTested = item;
        return name.matches( item.getName() );
      }

      @Override
      public void describeTo( Description description )
      {
        description.appendText( " that file " );
        description.appendValue( fileTested );
        description.appendText( " is named" );
        description.appendDescriptionOf( name );
        description.appendText( " not " );
        description.appendValue( fileTested.getName() );
      }
    };
  }

  public static Matcher<File> withCanonicalPath( final Matcher<String> path )
  {
    return new TypeSafeMatcher<File>()
    {
      @Override
      public boolean matchesSafely( File item )
      {
        try
        {
          return path.matches( item.getCanonicalPath() );
        }
        catch ( IOException e )
        {
          return false;
        }
      }

      @Override
      public void describeTo( Description description )
      {
        description.appendText( "with canonical path '" );
        description.appendDescriptionOf( path );
        description.appendText( "'" );
      }
    };
  }

  public static Matcher<File> withAbsolutePath( final Matcher<String> path )
  {
    return new TypeSafeMatcher<File>()
    {
      @Override
      public boolean matchesSafely( File item )
      {
        return path.matches( item.getAbsolutePath() );
      }

      @Override
      public void describeTo( Description description )
      {
        description.appendText( "with absolute path '" );
        description.appendDescriptionOf( path );
        description.appendText( "'" );
      }
    };
  }
}