package epdm.eduardo_perezdemadrid_rodriguez_practica1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Practica1Controller {

    @FXML
    private Pane root;

    @FXML
    protected void onHelloButtonClick() {
    }

    @FXML
    private void abrirFormulario(ActionEvent event) {
        try {
            // Cargamos el archivo Controles Dinámicos
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Practica1Controller.class.getResource("dynamic-controls.fxml"));
            Pane listadoControles = loader.load();

            // Se sitúa en el centro del diseño principal
            root.getChildren().addAll(listadoControles);

        } catch (IOException e) {
            System.out.println(e.getMessage());
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