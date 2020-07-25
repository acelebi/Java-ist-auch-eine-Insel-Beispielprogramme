package com.tutego.insel.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

interface Portable {
  double getWeight();
  void   setWeight( double weight );
}

abstract class AbstractPortable implements Portable {
  
  private double weight;

  @Override public double getWeight() {
    return weight;
  }

  @Override public void setWeight( double weight ) {
    this.weight = weight;
  }
  
  @Override public String toString() {
    return getClass().getName() + "[weight=" + weight + "]";
  };
}

class Pen extends AbstractPortable { }

class Cup extends AbstractPortable { }

class PortableUtils
{
//  public static <T extends Portable> boolean areLighterThan( List<T> list, double maxWeight )
  public static boolean areLighterThan( List<? extends Portable> list, double maxWeight ) {
    double accumulatedWeight = 0.0;

    for ( Portable portable : list )
      accumulatedWeight += portable.getWeight();

    return accumulatedWeight < maxWeight; 
  }

  public static <T extends Portable> T lightest( Collection<T> collection ) {
    Iterator<T> iterator = collection.iterator();
    T lightest = iterator.next();
  
    while ( iterator.hasNext() ) {
      T next = iterator.next();
  
      if ( next.getWeight() < lightest.getWeight() )
        lightest = next;
    }
  
    return lightest;
  }

  public static <T extends Portable> List<T> leftSublist( List<T> list ) {
    return list.subList( 0, list.size() / 2 );
  }

  public static void copyLighterThen( List<? extends Portable> src,
                                      List<? super Portable> dest,
                                      double maxWeight ) {
    for ( Portable portable : src )
      if ( portable.getWeight() < maxWeight )
        dest.add( portable );
  }
}

public class PortableDemo {
  
  public static void main( String[] args ) {
    Pen pen = new Pen();
    pen.setWeight( 10 );
    Cup cup = new Cup();
    cup.setWeight( 100 );
    System.out.println( PortableUtils.areLighterThan( Arrays.asList( pen, cup ), 10 ) );
    System.out.println( PortableUtils.areLighterThan( Arrays.asList( pen, cup ), 120 ) );

    List<? extends Portable> src = Arrays.asList( pen, cup );
    List<? super Portable> dest = new ArrayList<>();
    PortableUtils.copyLighterThen( src, dest, 20 );

    System.out.println( dest.size() ); // 1
    Object result = dest.get( 0 );
    System.out.println( result );      // com.tutego.insel.generics.Pen[weight=10.0]
  }
}