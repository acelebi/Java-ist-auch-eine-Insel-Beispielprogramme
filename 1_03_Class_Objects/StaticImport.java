import static java.lang.System.out;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import static java.lang.Math.min;

class StaticImport {

  public static void main( String[] args ) {
    int i = parseInt( showInputDialog( "Erste Zahl" ) );
    int j = parseInt( showInputDialog( "Zweite Zahl" ) );

    out.printf( "%d ist größer oder gleich %d.%n",
                max( i, j ), min( i, j ) );
  }
}
