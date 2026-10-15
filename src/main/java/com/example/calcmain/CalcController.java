package com.example.calcmain;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcController {
    @FXML
    public TextField result;
    static double first;
    static double second;
    static String operator;

    @FXML
    private void numButton (ActionEvent e){
        if (result.getText().equals("0.00")){
            result.setText("");
        }
        Button clickedBt = (Button) e.getSource();
        result.appendText(clickedBt.getText());
    }

    @FXML
    private void oppButton (ActionEvent e){
        Button clickedOpp = (Button) e.getSource();
        operator = clickedOpp.getText();
        first = Double.parseDouble(result.getText());
        result.setText("");
    }

    @FXML
    private void delButton (ActionEvent e){
        String currentText = result.getText();
        if (currentText != null && !currentText.isEmpty()) {
            String newText = currentText.substring(0, currentText.length() - 1);
            result.setText(newText);
        }
    }

    @FXML
    private void eqButton (ActionEvent e){
        second = Double.parseDouble(result.getText());
        switch(operator){
            case("+") -> result.setText(String.valueOf(first + second));
            case("-") -> result.setText(String.valueOf(first - second));
            case("*") -> result.setText(String.valueOf(first * second));
            case("/") -> result.setText(String.valueOf(first / second));
        }
    }
}
