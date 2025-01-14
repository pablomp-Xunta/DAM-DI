package proba;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
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

        ObservableList<String> elementosLista = FXCollections.observableArrayList("Elemento 1", "Elemento 2", "Elemento 3");
        ListView<String> listView = new ListView<>(elementosLista);
        
        root.getChildren().add(listView);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
