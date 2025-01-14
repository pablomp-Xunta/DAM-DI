package proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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

        Label etiqueta = new Label("Nombre:");

        TextField textField = new TextField();

        TextArea textArea = new TextArea();

        Button boton = new Button("Enviar");

        CheckBox checkBox = new CheckBox("Acepto los términos y condiciones");

        flowpane.getChildren().addAll(etiqueta, textField, textArea, boton, checkBox);


        scene.setRoot(flowpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
