import java.text.Normalizer;

import javax.swing.JOptionPane;

public class _NormalizerDemo {
  
  public static void main( String[] args )
  {
    String s = Normalizer.normalize( "a+b�=c�", Normalizer.Form.NFKD );
    System.out.println( s );
    JOptionPane.showMessageDialog( null, s );
  }
}