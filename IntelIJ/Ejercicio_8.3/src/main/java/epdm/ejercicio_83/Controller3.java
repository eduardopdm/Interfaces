package epdm.ejercicio_83;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller3 {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}