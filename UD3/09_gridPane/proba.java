package proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
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

        GridPane gridPane = new GridPane();
        Button button1 = new Button("Botón 1");
        Button button2 = new Button("Botón 2");
        gridPane.add(button1, 0, 0);
        gridPane.add(button2, 1, 1);

        scene.setRoot(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
