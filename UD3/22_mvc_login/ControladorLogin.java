package proba;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControladorLogin {

    @FXML
    private TextField cUsuario;
    @FXML
    private TextField cClave;

    public void iniciarSesion(ActionEvent actionEvent) {
        //Lógica para identificar al usuario o Conexión DB...
        System.out.println("Usuario:" + cUsuario.getText());
        System.out.println("Clave:" + cClave.getText());
    }
}
