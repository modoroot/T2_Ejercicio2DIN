package com.example.t2_ejercicio2;

import javafx.application.Application;
import javafx.stage.Stage;

public class ApartadoA extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Establece la anchura y altura de la ventana en 400 píxeles
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);

        // Establece la anchura y altura mínimas de la ventana en 200 píxeles
        primaryStage.setMinWidth(200);
        primaryStage.setMinHeight(200);

        // Establece la anchura y altura máximas de la ventana en 600 píxeles
        primaryStage.setMaxWidth(600);
        primaryStage.setMaxHeight(600);

        // Muestra la ventana
        primaryStage.show();
    }
}