package com.tutego.insel.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService( name = "ChrisWebServices" )
@SOAPBinding( style = SOAPBinding.Style.RPC )
public class MyWebServices {

  @WebMethod
  public String hello( String name ) {
    return "Hello " + name + "!";
  }

  @WebMethod( operationName = "body-mass-index" )
  @WebResult( name = "your-bmi" )
  public double bmi( @WebParam( name = "height" ) double height,
                     @WebParam( name = "weight" ) double weight ) {
    height /= 100;
    return weight / (height * height);
  }
}
