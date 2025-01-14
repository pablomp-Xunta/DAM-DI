package proba;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class proba extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage ventana) {
        ventana.setTitle("Stage");
        // Crear elementos de la interfaz
        Button boton = new Button("Púlsame!!!");
        // Asociar un evento y acción al botón
        boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("¡Botón pulsado!");
            }
        });
        // Lo mismo, en lambda
        boton.setOnAction(event -> System.out.println("¡Botón pulsado!"));

        boton.setOnMouseClicked(event -> {
            System.out.println("Botón clicado");
        });

        boton.setOnMouseEntered(event -> { System.out.println("Ratón entró al nodo"); });
        boton.setOnMouseExited(event -> { System.out.println("Ratón salió del nodo"); });

        boton.setOnKeyPressed(event -> { System.out.println("Tecla presionada: " + event.getCode()); });
        boton.setOnKeyReleased(event -> { System.out.println("Tecla liberada: " + event.getCode()); });

        // Crear la escena y establecerla en el Stage
        Scene escena = new Scene(boton, 300, 150);
        ventana.setScene(escena);
        // Mostrar el Stage
        ventana.show();
    }
}
