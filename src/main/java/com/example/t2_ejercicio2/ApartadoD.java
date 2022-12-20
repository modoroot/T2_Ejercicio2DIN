package com.example.t2_ejercicio2;

import javafx.application.Application;
import javafx.scene.control.*;

import javafx.stage.Stage;

import java.util.Optional;

public class ApartadoD extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        show("Título de prueba", "Esto es un mensaje");
    }
    public static void show(String title, String message) {
        // Creamos una nueva alerta de tipo CONFIRMATION
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        // Establecemos el título y el mensaje de la alerta
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        // Añadimos los botones Aceptar y Cancelar a la alerta
        ButtonType buttonTypeOk = new ButtonType("Aceptar");
        ButtonType buttonTypeCancel = new ButtonType("Cancelar");
        alert.getButtonTypes().setAll(buttonTypeOk, buttonTypeCancel);
        // Mostramos la alerta y esperamos a que el usuario seleccione una opción
        Optional<ButtonType> result = alert.showAndWait();
    }

}
