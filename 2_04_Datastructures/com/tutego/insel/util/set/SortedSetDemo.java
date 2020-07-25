package com.tutego.insel.util.set;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SortedSetDemo {
  public static void main( String[] args ) {
    NavigableSet<Calendar> set = new TreeSet<>();
    set.add( new GregorianCalendar(2007, Calendar.MARCH, 10) );
    set.add( new GregorianCalendar(2007, Calendar.MARCH, 12) );
    set.add( new GregorianCalendar(2007, Calendar.APRIL, 12) );
    
    Calendar cal1 = set.lower( new GregorianCalendar(2007, Calendar.MARCH, 12) );
    System.out.printf( "%tF%n", cal1 );   // 2007-03-10
    
    Calendar cal2 = set.ceiling( new GregorianCalendar(2007, Calendar.MARCH, 12) );
    System.out.printf( "%tF%n", cal2 );   // 2007-03-12
    
    Calendar cal3 = set.floor( new GregorianCalendar(2007, Calendar.MARCH, 12) );
    System.out.printf( "%tF%n", cal3 );   // 2007-03-12

    Calendar cal4 = set.higher( new GregorianCalendar(2007, Calendar.MARCH, 12) );
    System.out.printf( "%tF%n", cal4 );   // 2007-04-12
  }
}
