module com.example.alert_aplicaciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alert_aplicaciones to javafx.fxml;
    exports com.example.alert_aplicaciones;
}