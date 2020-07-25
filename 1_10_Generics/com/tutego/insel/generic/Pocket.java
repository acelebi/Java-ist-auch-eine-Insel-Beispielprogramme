package com.tutego.insel.generic;

public class Pocket<T> {
  
  private T value;

  public static <T> Pocket<T> newInstance() { return new Pocket<>(); }

  public Pocket() {}

  public Pocket( T value ) { this.value = value; }

  public void set( T value ) { this.value = value; }

  public T get() { return value; }

  public boolean isEmpty() { return value == null; }

  public void empty() { value = null; }
}