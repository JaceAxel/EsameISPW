package com.ispw.esame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    @FXML
    private TextField passwordLenght;

    @FXML
    private Label passwordText;

    @FXML
    protected void onHelloButtonClick() {

        if (passwordLenght.getText().equals(null) || passwordLenght.getText().equals("")) {
            passwordText.setText("Inserisci una lunghezza valida!");
        }else {
            String password = new Random().ints(Integer.parseInt(passwordLenght.getText()), 33, 122).collect(StringBuilder::new,
                            StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            passwordText.setText(password);
        }
    }
}