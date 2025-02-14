package es.javafx.org.luis_cuadrado_guerra_practica1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class HelloController {
    @FXML
    private Pane root;

    @FXML
    protected void onHelloButtonClick() {}

    @FXML
    private void openForm(ActionEvent event) {
        try {
            // Cargamos el archivo Controles Din�micos
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(HelloController.class.getResource("DynamicControls.fxml"));
            Pane listadoControles = loader.load();

            // Se sit�a en el centro del dise�o principal
            root.getChildren().addAll(listadoControles);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void printTest(ActionEvent event) {

    }

    public Pane getRootLayout() {
        return root;
    }

    public void setRootLayout(Pane root) {
        this.root = root;
    }
}