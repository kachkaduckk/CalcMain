package com.example.calcmain;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcController {
    @FXML
    private TextField result;

    @FXML
    private void onButton1 (ActionEvent e){
        System.out.println("Hello world!");
    }
}
