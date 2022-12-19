package com.example.t2_ejercicio2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ApartadoC extends Application {
    //Lanza el programa
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Crea una ventana principal
        primaryStage.setTitle("Ventana principal");
        // Crea un botón para abrir la ventana emergente
        Button button = new Button("Abrir ventana emergente");
        button.setOnAction(e -> {
            // Crea la ventana emergente
            Stage popupWindow = new Stage();

            // Establece el título de la ventana emergente
            popupWindow.setTitle("Ventana emergente");

            // Establece que la ventana emergente es modal, es decir, que
            // el usuario no puede interactuar con la ventana principal
            // hasta que cierre la ventana emergente
            popupWindow.initModality(Modality.APPLICATION_MODAL);

            // Establece el mensaje a mostrar en la ventana emergente
            Label label = new Label("Este es el mensaje de la ventana emergente");

            // Crea un botón para cerrar la ventana emergente
            Button closeButton = new Button("Confirmar lectura");
            closeButton.setOnAction(event -> popupWindow.close());

            // Crea un contenedor para los elementos de la ventana emergente
            VBox layout = new VBox(10);
            layout.setPadding(new Insets(20, 20, 20, 20));
            layout.getChildren().addAll(label, closeButton);

            // Establece el contenido de la ventana emergente
            Scene scene = new Scene(layout, 300, 250);
            popupWindow.setScene(scene);

            // Muestra la ventana emergente
            popupWindow.showAndWait();
        });

        // Crea un contenedor para los elementos de la ventana principal
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(button);

        // Establece el contenido de la ventana principal
        Scene scene = new Scene(layout, 200, 150);
        primaryStage.setScene(scene);

        // Muestra la ventana principal
        primaryStage.show();
    }
}