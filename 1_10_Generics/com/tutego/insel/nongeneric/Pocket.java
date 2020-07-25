package com.tutego.insel.nongeneric;

public class Pocket {
  
  private Object value;

  public Pocket() {}

  public Pocket( Object value ) { this.value = value; }

  public void set( Object value ) { this.value = value; }

  public Object get() { return value; }

  public boolean isEmpty() { return value == null; }
  
  public void empty() { value = null; }
}