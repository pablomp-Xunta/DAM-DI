package proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class proba extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ejemplo de Stage Único");
        // Crear elementos de la interfaz
        TextField textField = new TextField();
        Button button = new Button("Mostrar Mensaje");
        // Configurar la acción del botón
        button.setOnAction(e -> mostrarMensaje(textField.getText()));
        // Organizar elementos en un contenedor VBox 
        VBox vbox = new VBox(10);
        // 10 es el espaciado vertical entre los elementos
        vbox.getChildren().addAll(textField, button);
        // Crear la escena y establecerla en el Stage 
        Scene scene = new Scene(vbox, 300, 150);
        primaryStage.setScene(scene);
        // Mostrar el Stage 
        primaryStage.show();
    }

    private void mostrarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
}


