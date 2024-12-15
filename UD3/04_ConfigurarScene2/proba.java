package proba;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class proba extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        VBox root = new VBox();
        // identifica al componente VBox como raíz
        Scene scene = new Scene(root, 800, 600);
        VBox nuevoContenido = new VBox();
        scene.setRoot(nuevoContenido);

        Button btn = new Button("Abrir Nueva Ventana");
        nuevoContenido.getChildren().add(btn);

        Timeline timeline = new Timeline( new KeyFrame(Duration.seconds(2),
         new KeyValue(btn.translateXProperty(), 400)) );
          timeline.play();

        WritableImage imagenCapturada = scene.snapshot(null);

        HBox contenido1 = new HBox();
        Pane contenido2= new Pane();

        Scene escena1 = new Scene(contenido1, 800, 600);
        Scene escena2 = new Scene(contenido2, 950,300);


        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
