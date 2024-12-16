package proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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

        StackPane stackPane = new StackPane();
        Button button1 = new Button("Botón 1");
        button1.setScaleX(2);
        button1.setScaleY(2);
        Button button2 = new Button("Botón 2");
        stackPane.getChildren().addAll(button1, button2);

        scene.setRoot(stackPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
