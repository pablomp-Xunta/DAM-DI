package proba;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        
        VBox vbox = new VBox();
        Button button1 = new Button("Botón 1");
        Button button2 = new Button("Botón 2");
        vbox.getChildren().addAll(button1, button2);
        vbox.setAlignment(Pos.CENTER);

        scene.setRoot(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

