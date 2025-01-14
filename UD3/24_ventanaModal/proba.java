package proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class proba extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ventana Principal");
        Button openModalButton = new Button("Abrir Ventana Modal");
        openModalButton.setOnAction(e -> openModal(primaryStage));
        VBox layout = new VBox(10);
        layout.getChildren().addAll(new Label("Ventana Principal"), openModalButton);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openModal(Stage parentStage) {
        Stage modalStage = new Stage();
        modalStage.initModality(Modality.WINDOW_MODAL);
        modalStage.initOwner(parentStage);
        modalStage.setTitle("Ventana Modal");
        modalStage.setScene(new Scene(new Label("Esta es una ventana modal."), 200, 100));
        modalStage.show();
    }
}
