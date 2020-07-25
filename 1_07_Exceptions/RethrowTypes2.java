import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.*;
import javax.imageio.ImageIO;

public class RethrowTypes2 {

  public static void saveScreenshot( String filename ) throws AWTException, IOException {
    try {
      Rectangle r = new Rectangle( Toolkit.getDefaultToolkit().getScreenSize() );
      BufferedImage screenshot = new Robot().createScreenCapture( r );
      ImageIO.write( screenshot, "png", new File(filename) );
    }
    catch ( AWTException e ) {
      throw e;
    }
    catch ( Throwable e ) {
      Files.delete( Paths.get( filename ) );
      throw e;
    }
  }

  public static void main( String[] args ) throws IOException, AWTException {
    saveScreenshot( System.getProperty( "user.home" ) + "/screenshot.png" );
  }
}