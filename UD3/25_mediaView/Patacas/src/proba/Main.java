//https://docs.oracle.com/javase/8/javafx/api/javafx/scene/media/MediaView.html

package proba;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Main extends Application{
    public void start(Stage stage){
        Scene scene = new Scene(new Group(), 600, 400);
        stage.setScene(scene);

        stage.setTitle("Hello Media");
        stage.show();
        String source ="file:///E:/Users/pablo/Downloads/TPIT/UNIDAD%200-.%20PRESENTACIÓN/AppMoodle.mp4";
        //String source =getParameters().getRaw().get(0);
        Media media = new Media(source);

        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);

        MediaView mediaView = new MediaView(mediaPlayer);
        ((Group) scene.getRoot()).getChildren().add(mediaView);
    }

    public static void main(String[] args) {
        launch(args);
    }


}
