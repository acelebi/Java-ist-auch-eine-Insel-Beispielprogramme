package com.tutego.insel.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ButtonController
{
  @FXML
  private TextField input;

  @FXML
  protected void convertAction( ActionEvent event )
  {
    input.setText( input.getText().trim().toUpperCase() );
  }
}