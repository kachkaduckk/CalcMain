package com.example.calcmain;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Calc extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Calc.class.getResource("calc.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 600, Color.LIGHTCORAL);
        stage.resizableProperty().setValue(false);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
