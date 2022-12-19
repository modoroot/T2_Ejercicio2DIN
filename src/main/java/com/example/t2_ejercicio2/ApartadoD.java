package com.example.t2_ejercicio2;

import javafx.application.Application;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ApartadoD extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Creamos el diálogo
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.setTitle("Mi diálogo");
        dialog.setHeaderText("Este es el mensaje del diálogo");

        // Creamos los botones Aceptar y Cancelar
        ButtonType buttonTypeOk = new ButtonType("Aceptar", ButtonBar.ButtonData.OK_DONE);
        ButtonType buttonTypeCancel = new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE);
        dialog.getDialogPane().getButtonTypes().addAll(buttonTypeOk, buttonTypeCancel);

        // Creamos el contenido del diálogo
        Label label = new Label("Este es el contenido del diálogo");
        VBox vBox = new VBox(label);
        dialog.getDialogPane().setContent(vBox);

        // Mostramos el diálogo y esperamos a que el usuario haga clic en uno de los botones
        dialog.showAndWait().ifPresent(buttonType -> {
            if (buttonType == buttonTypeOk) {
                // El usuario hizo clic en el botón Aceptar
            } else if (buttonType == buttonTypeCancel) {
                // El usuario hizo clic en el botón Cancelar
            }
        });
    }
}
