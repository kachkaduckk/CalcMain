module com.example.calcmain {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calcmain to javafx.fxml;
    exports com.example.calcmain;
}