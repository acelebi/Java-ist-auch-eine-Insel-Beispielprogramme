package com.tutego.insel.beans;

import java.awt.Color;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class PropertyDescriptors {
  public static void main( String[] args ) throws IntrospectionException {
    BeanInfo beanInfo = Introspector.getBeanInfo( Color.class );
    for ( PropertyDescriptor pd : beanInfo.getPropertyDescriptors() )
      System.out.println( pd.getDisplayName() + " : " + pd.getPropertyType().getName() );
  }
}
