package com.andersen.tasks.phan_java;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Arrays;

public class MainViewController {
    @FXML
    private TextField enterNumberTextField;
    @FXML
    private TextField enterNameTextField;
    @FXML
    private TextField enterArrayTextField;
    @FXML
    private Label helloLabel;
    @FXML
    private Label helloJohnLabel;
    @FXML
    private Label arrayNumsLabel;
    @FXML
    private Button submitButton;

    @FXML
    protected void onHelloButtonClick() {
        String number = enterNumberTextField.getText().trim();
        String name = enterNameTextField.getText().trim();
        String[] array = enterArrayTextField.getText().trim().split(" ");
        helloLabel.setText(InputDataValidation.checkNumber(number));
        helloJohnLabel.setText(InputDataValidation.checkName(name));
        arrayNumsLabel.setText(InputDataValidation.parseArray(array));
    }

    @FXML
    protected void onEnterKeyClicked(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER) {
            onHelloButtonClick();
        }
    }
}