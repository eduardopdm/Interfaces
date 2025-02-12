package epdm.eduardo_perezdemadrid_rodriguez_practica1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class Practica1Controller {

    @FXML
    private void abrirFormulario(ActionEvent event) {
        try {
            // Cargamos el archivo Controles Dinámicos
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Practica1Controller.class.getResource("/basicoDinamico/ControlesDinamicos.fxml"));
                    GridPane listadoControles = (GridPane) loader.load();
// Se sitúa en el centro del diseño principal
                rootLayout.setCenter(listadoControles);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}