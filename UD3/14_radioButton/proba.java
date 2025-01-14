package proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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

        FlowPane flowpane = new FlowPane();

        VBox vBox = new VBox();
        // Grupo de botones de opción
        ToggleGroup toggleGroup = new ToggleGroup();
        // Botón de opción 1
        RadioButton radio1 = new RadioButton("Opción 1");
        radio1.setToggleGroup(toggleGroup);
        vBox.getChildren().add(radio1);
        // Botón de opción 2 RadioButton
        RadioButton radio2 = new RadioButton("Opción 2");
        radio2.setToggleGroup(toggleGroup);
         vBox.getChildren().add(radio2);
        flowpane.getChildren().add(vBox);


        scene.setRoot(flowpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
