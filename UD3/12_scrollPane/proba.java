package proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
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

        ScrollPane scrollPane = new ScrollPane();
        Text contenidoLargo = new Text("Contenido largo...");
        scrollPane.setContent(contenidoLargo);

        scene.setRoot(scrollPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
