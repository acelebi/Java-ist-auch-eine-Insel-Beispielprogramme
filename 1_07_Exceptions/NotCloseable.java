public class NotCloseable implements AutoCloseable {
  @Override public void close() {
    throw new UnsupportedOperationException( "close() mag ich nicht" );
  }
}