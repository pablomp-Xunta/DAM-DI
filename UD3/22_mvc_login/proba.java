package proba;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class proba extends Application {

    @Override
    public void start(Stage ventana) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("vistaLogin.fxml"));
        Scene escena = new Scene(fxmlLoader.load(), 400, 300);
        ventana.setTitle("Login Usuario");
        ventana.setScene(escena);
        ventana.show();
    }

    public static void main(String[] args) {
        launch();
    }
    //https://stackoverflow.com/questions/73129348/fxmlloader-load-is-not-working-and-i-have-no-idea-why-what-should-i-do
    private static class HelloApplication {

        public HelloApplication() {
        }
    }
}
