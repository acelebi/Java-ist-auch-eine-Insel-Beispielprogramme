package com.tutego.insel.generic;

import java.lang.reflect.*;

public abstract class TypeRef<T> {
  
  public final Type type;

  protected TypeRef() {
    ParameterizedType superclass = (ParameterizedType) getClass().getGenericSuperclass();
    type = superclass.getActualTypeArguments()[0];
  }
}