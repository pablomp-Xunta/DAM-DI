package proba;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class proba extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage ventana) {
        ventana.setTitle("Stage");
        VBox root = new VBox();
        // Crear la escena y establecerla en el Stage
        Scene escena = new Scene(root);
        ventana.setScene(escena);
        root.getStylesheets().add("styles.css");

        //CSS en linea
        Button btn = new Button("Patatas!!!");
        btn.setStyle("-fx-background-color: #000099; -fx-text-fill: white");

        Button btn2 = new Button("Caramelos!!!");
        btn2.getStyleClass().add("mibtn");

       
        root.getChildren().addAll(btn, btn2);


        // Mostrar el Stage
        ventana.show();
    }
}
