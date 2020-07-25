package com.tutego.insel.bean.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

public class DialogPlayerValidatorDemo {
  
  public static void main( String[] args ) {
    Validator v = Validation.buildDefaultValidatorFactory().getValidator();
    Set<ConstraintViolation<DialogPlayer>> constraintViolations;
    
    DialogPlayer p = new DialogPlayer();

    System.out.println( v.validate( p, DialogPlayer.NameValidation.class ).size() ); // 0

    constraintViolations = v.validate( p, DialogPlayer.NameValidation.class );
    for ( ConstraintViolation<DialogPlayer> violation : constraintViolations )
      System.out.println( violation.getPropertyPath() + " " + violation.getMessage() );
    
    // name kann nicht null sein
    
    p.name = "chris";
    
    System.out.println( v.validate( p, DialogPlayer.NameValidation.class ).size() ); // 0
    
    constraintViolations = v.validate( p, DialogPlayer.AgeValidation.class );
    for ( ConstraintViolation<DialogPlayer> violation : constraintViolations )
      System.out.println( violation.getPropertyPath() + " " + violation.getMessage() );
    
    // age muss grössergleich 10 sein
    
    p.name = null;
    p.age = 60;
    
    constraintViolations = v.validate( p, DialogPlayer.AgeValidation.class );
    for ( ConstraintViolation<DialogPlayer> violation : constraintViolations )
      System.out.println( violation.getPropertyPath() + " " + violation.getMessage() );
    
    // name kann nicht null sein
    
    p.name = "chris";
    
    System.out.println( v.validate( p, DialogPlayer.NameValidation.class ).size() ); // 0
  }
}