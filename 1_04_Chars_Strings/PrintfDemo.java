import java.io.PrintStream;
import java.util.Date;

public class PrintfDemo {

  public static void main( String[] args ) {
   PrintStream o = System.out;

   int i = 123;
   o.printf( "|%d|%d|%n" ,       i, -i );      // |123|-123|
   o.printf( "|%5d|%5d|%n" ,     i, -i );      // |  123| –123|
   o.printf( "|%-5d|%-5d|%n" ,   i, -i );      // |123  |-123 |
   o.printf( "|%+-5d|%+-5d|%n" , i, -i );      // |+123 |-123 |
   o.printf( "|%05d|%05d|%n%n",  i, -i );      // |00123|-0123|

   o.printf( "|%X|%x|%n", 0xabc, 0xabc );      // |ABC|abc|
   o.printf( "|%04x|%#x|%n%n", 0xabc, 0xabc ); // |0abc|0xabc|

   double d = 12345.678;
   o.printf( "|%f|%f|%n" ,         d, -d );    // |12345,678000|-12345,678000|
   o.printf( "|%+f|%+f|%n" ,       d, -d );    // |+12345,678000|-12345,678000|
   o.printf( "|% f|% f|%n" ,       d, -d );    // | 12345,678000|-12345,678000|
   o.printf( "|%.2f|%.2f|%n" ,     d, -d );    // |12345,68|-12345,68|
   o.printf( "|%,.2f|%,.2f|%n" ,   d, -d );    // |12.345,68|-12.345,68|
   o.printf( "|%.2f|%(.2f|%n",     d, -d );    // |12345,68|(12345,68)|
   o.printf( "|%10.2f|%10.2f|%n" , d, -d );    // |  12345,68| –12345,68|
   o.printf( "|%010.2f|%010.2f|%n",d, -d );    // |0012345,68|-012345,68|

   String s = "Monsterbacke";
   o.printf( "%n|%s|%n", s );                  // |Monsterbacke|
   o.printf( "|%S|%n", s );                    // |MONSTERBACKE|
   o.printf( "|%20s|%n", s );                  // |        Monsterbacke|
   o.printf( "|%-20s|%n", s );                 // |Monsterbacke        |
   o.printf( "|%7s|%n", s );                   // |Monsterbacke|
   o.printf( "|%.7s|%n", s );                  // |Monster|
   o.printf( "|%20.7s|%n", s );                // |             Monster|

   Date t = new Date();
   o.printf( "%tT%n", t );                     // 11:01:39
   o.printf( "%tD%n", t );                     // 04/18/08
   o.printf( "%1$te. %1$tb%n", t );            // 18. Apr
 }
}