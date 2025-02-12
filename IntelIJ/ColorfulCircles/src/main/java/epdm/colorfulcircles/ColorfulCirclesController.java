package epdm.colorfulcircles;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ColorfulCirclesController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}