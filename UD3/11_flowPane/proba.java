package proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
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

        FlowPane flowPane = new FlowPane();
        Button button1 = new Button("Botón 1");
        Button button2 = new Button("Botón 2");
        Button button3 = new Button("Botón 3");
        button3.setPrefWidth(250);
        button3.setPrefHeight(150);
        flowPane.getChildren().addAll(button1, button2, button3);

        scene.setRoot(flowPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
