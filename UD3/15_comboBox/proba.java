package proba;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
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
        // Cuadro de opciones
        ObservableList<String> opciones = FXCollections.observableArrayList("Opción A", "Opción B", "Opción C");
        ChoiceBox<String> choiceBox = new ChoiceBox<>(opciones);
        root.getChildren().add(choiceBox);
        // Cuadro combinado
        ObservableList<String> opcionesCombo = 
            FXCollections.observableArrayList("Elemento 1", "Elemento 2", "Elemento 3");
        ComboBox<String> comboBox = new ComboBox<>(opcionesCombo);
        root.getChildren().add(comboBox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
