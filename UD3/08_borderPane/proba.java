package proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
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

        BorderPane borderPane = new BorderPane();
        Button topButton = new Button("Arriba");
        Button bottomButton = new Button("Abajo");
        Button leftButton = new Button("Izquierda");
        Button rightButton = new Button("Derecha");
        Button centerButton = new Button("Centro");
        borderPane.setTop(topButton);
        borderPane.setBottom(bottomButton);
        borderPane.setLeft(leftButton);
        borderPane.setRight(rightButton);
        borderPane.setCenter(centerButton);


        scene.setRoot(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
