package proba;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
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

        HBox hbox = new HBox();
        Button button1 = new Button("Botón 1");
        Button button2 = new Button("Botón 2");
        hbox.getChildren().addAll(button1, button2);
        
        hbox.setAlignment(Pos.BOTTOM_LEFT);

        scene.setRoot(hbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
