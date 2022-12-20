package com.example.t2_ejercicio2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ApartadoE extends Application {

    // Atributos para la interfaz gráfica
    private Label lblNombreJugador = new Label("Nombre del jugador:");
    private TextField txtNombreJugador = new TextField();
    private Label lblEquipoJugador = new Label("Equipo en el que juega:");
    private TextField txtEquipoJugador = new TextField();
    private Label lblPromedioPuntos = new Label("Promedio de puntos:");
    private TextField txtPromedioPuntos = new TextField();
    private Button btnMostrar = new Button("Mostrar");

    @Override
    public void start(Stage primaryStage) {
        // Crear contenedores para los elementos de la interfaz gráfica
        HBox hboxNombreJugador = new HBox(lblNombreJugador, txtNombreJugador);
        HBox hboxEquipoJugador = new HBox(lblEquipoJugador, txtEquipoJugador);
        HBox hboxPromedioPuntos = new HBox(lblPromedioPuntos, txtPromedioPuntos);
        HBox hboxMostrar = new HBox(btnMostrar);
        hboxMostrar.setAlignment(Pos.BASELINE_RIGHT);
        VBox root = new VBox(hboxNombreJugador, hboxEquipoJugador, hboxPromedioPuntos, btnMostrar);
        // Establecer el manejador de eventos para el botón
        btnMostrar.setOnAction(event -> {
            String nombre = txtNombreJugador.getText();
            String equipo = txtEquipoJugador.getText();
            String promedioPuntos = txtPromedioPuntos.getText();

            // Mostrar los datos en una ventana emergente
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos del jugador");
            alert.setHeaderText("Información del jugador");
            alert.setContentText("Nombre del jugador: " + nombre + "\nEquipo del jugador: "
                    + equipo + "\nPromedio de puntos: " + promedioPuntos);
            alert.show();
        });

// Crear la escena y agregarla al escenario principal
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplicación TextField");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


