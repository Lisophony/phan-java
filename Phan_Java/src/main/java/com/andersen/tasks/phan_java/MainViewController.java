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
        helloLabel.setText(checkNumber(number));
        helloJohnLabel.setText(checkName(name));
        arrayNumsLabel.setText(parseArray(array));
    }

    private String checkNumber(String number) {
        try {
            double intNum = Double.parseDouble(number);
            if(intNum > 7) {
                return "Hello";
            }
        }
        catch (NumberFormatException e) {
            return "Number format is incorrect";
        }
        return "";
    }

    private String checkName(String name) {
        if(name.equals("John")) {
            return "Hello, John";
        }
        else {
            return "There is no such name";
        }
    }

    private String parseArray(String[] array) {
        try {
            int[] intArray = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
            StringBuilder sb = new StringBuilder();
            Arrays.stream(intArray).forEach(x -> {
                if(x % 3 == 0) {
                    sb.append(x);
                    sb.append(" ");
                }
            });
            return sb.toString().trim();
        }
        catch (NumberFormatException e) {
            return "Array is incorrect";
        }
    }
}