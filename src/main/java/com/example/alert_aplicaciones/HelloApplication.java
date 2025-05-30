package com.example.alert_aplicaciones;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class HelloApplication extends Application {
    @Override

    public void start(Stage s){
        s.setTitle("Creación de Alertas");

        Button b = new Button("Confirmation Alert");
        Button b1 = new Button("Error Alert");
        Button b2 = new Button("Information Alert");
        Button b3 = new Button("Warning Alert");
        Button b4 = new Button("None Alert");

        VBox r = new VBox();

        Alert a = new Alert(AlertType.NONE);

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                a.setAlertType(AlertType.CONFIRMATION);
                a.setContentText("ConfirmationDialog");
                a.show();
            }
        };

        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                a.setAlertType(AlertType.ERROR);
                a.setContentText("ErrorDialog");
                a.show();
            }
        };

        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                a.setAlertType(AlertType.INFORMATION);
                a.setContentText("InformationDialog");
                a.show();
            }
        };

        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                a.setAlertType(AlertType.WARNING);
                a.setContentText("WarningDialog");
                a.show();
            }
        };

        EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                Alert a1 = new Alert(AlertType.NONE, "DefaultDialog",ButtonType.APPLY);
                a1.show();
            }
        };

        b.setOnAction(event);
        b1.setOnAction(event1);
        b2.setOnAction(event2);
        b3.setOnAction(event3);
        b4.setOnAction(event4);

        r.getChildren().addAll(b, b1, b2, b3, b4);

        Scene sc = new Scene(r, 200, 200);
        s.setScene(sc);
        s.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}
