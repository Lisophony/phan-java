package com.andersen.tasks.phan_java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    protected void onHelloButtonClick() {
        String number = enterNumberTextField.getText().trim();
        String name = enterNameTextField.getText();
        String[] array = enterArrayTextField.getText().trim().split(" ");
        helloLabel.setText(InputDataValidation.checkNumber(number));
        helloJohnLabel.setText(InputDataValidation.checkName(name));
        arrayNumsLabel.setText(InputDataValidation.parseArray(array));
    }
}