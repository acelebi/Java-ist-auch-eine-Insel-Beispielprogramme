import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TooManyExceptions {

  void openFile() throws FileNotFoundException, IOException, InterruptedException {
    try ( RandomAccessFile r = new RandomAccessFile( "", "" ) ) { }
  }

  void useFile() {
    try {
      openFile();
    }
    catch ( IOException e ) { }
    catch ( InterruptedException e ) { }
  }
}