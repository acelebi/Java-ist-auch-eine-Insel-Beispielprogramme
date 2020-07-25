package com.tutego.insel.meta;

interface DynamBase {
  void meth();
}

class DynamBaseMethod implements DynamBase {
  @Override
  public void meth() {
    System.out.println( "Bewusste Raucher trinken Filterkaffee" );
  }
}

public class DynamAbstract {
  public static void main( String[] args ) throws Exception {
    // Class<?> clazz = Class.forName( "com.tutego.insel.meta.DynamBaseMethod" );
    // DynamBase o = (DynamBase) clazz.newInstance();

    Class<? extends DynamBase> clazz = Class.forName( "DynamBaseMethod" ).asSubclass( DynamBase.class );
    DynamBase o = clazz.newInstance();

    o.meth();
  }
}