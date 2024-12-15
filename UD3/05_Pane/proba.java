package proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
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
        
        Pane pane = new Pane();
        Button button = new Button("Haz clic");
        Button button2 = new Button("Haz clic 2");
        button2.setTranslateX(100.0);

        pane.getChildren().add(button);
        pane.getChildren().add(button2);

        scene.setRoot(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
