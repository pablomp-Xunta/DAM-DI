package proba;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class proba extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        VBox root = new VBox();
        // identifica al componente VBox como raíz
        Scene scene = new Scene(root, 800, 600);

        scene.getStylesheets().add("estilos.css");
        // Asociar hoja de estilo a la escena

        Node nodoConFoco = scene.getFocusOwner();

        scene.setOnKeyPressed(event -> { 
        // Manejar evento de tecla presionada
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}


