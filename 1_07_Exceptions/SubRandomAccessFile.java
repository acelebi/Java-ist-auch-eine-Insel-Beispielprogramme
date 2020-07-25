import java.io.*;
import java.net.ProtocolException;

public class SubRandomAccessFile extends RandomAccessFile {

  public SubRandomAccessFile( File file, String mode ) throws FileNotFoundException {
    super( file, mode );
  }

  @Override
  public long length() {
    try {
      return super.length();
    }
    catch ( IOException e ) {
      return 0;
    }
  }

  @Override
  public void write( int b ) throws ProtocolException {
    try {
      super.write( b );
    }
    catch ( IOException e ) {
      throw new ProtocolException();
    }    
  }
  
  @Override
  public void close() {
  }
  
  public static void main( String[] args ) {
    try ( RandomAccessFile raf = new SubRandomAccessFile( null, "r" ) ) {
      raf.length();
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }

    try ( SubRandomAccessFile raf = new SubRandomAccessFile( null, "r" ) ) {
      raf.length();
    }
    catch ( FileNotFoundException e ) {
      e.printStackTrace();
    }
  }
}