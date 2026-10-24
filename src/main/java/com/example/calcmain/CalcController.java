package com.example.calcmain;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController {
    @FXML
    public TextField result;

    static double first;
    static double second;
    static String operator = "";
    static private double memory = 0;

    @FXML
    private void numButton (ActionEvent e){
        if (result.getText().equals("0.00")){
            result.setText("");
        }
        Button clickedBt = (Button) e.getSource();
        result.appendText(clickedBt.getText());
    }

    @FXML
    private void opButton(ActionEvent e){
        eqButton(e);
        Button clickedOp = (Button) e.getSource();
        operator = clickedOp.getText();
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
            case("^n") -> result.setText(String.valueOf(Math.pow(first, second)));
            case("n√") -> result.setText(String.valueOf(Math.pow(second, 1 / first)));
            default -> result.setText(result.getText());
        }
        operator="";
    }

    @FXML
    private void quadButton (ActionEvent e){
        if (!result.getText().isEmpty()) {
            double number = Double.parseDouble(result.getText());
            result.setText(String.valueOf(Math.pow(number, 2)));
        }
    }

    @FXML
    private void sqrtButton (ActionEvent e){
        if (!result.getText().isEmpty()) {
            double number = Double.parseDouble(result.getText());
            result.setText(String.valueOf(Math.pow(number, 0.5)));
        }
    }

    @FXML
    private void memoButton (ActionEvent e){
        result.setText(String.valueOf(memory));
    }

    @FXML
    private void memoOpButton (ActionEvent  e){
        Button clickedMemoOp = (Button) e.getSource();
        String memoOp = clickedMemoOp.getText();
        switch (memoOp){
            case("M+") -> memory += Double.parseDouble(result.getText());
            case("M-") -> memory -= Double.parseDouble(result.getText());
        }
        result.setText("");
    }
}
