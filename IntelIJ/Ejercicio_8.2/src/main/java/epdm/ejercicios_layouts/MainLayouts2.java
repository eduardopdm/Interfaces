package epdm.ejercicios_layouts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.cell.ChoiceBoxListCell;
import javafx.stage.Stage;

import java.io.IOException;

public class MainLayouts2 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainLayouts2.class.getResource("MainLayouts2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

//        ChoiceBoxListCell<String> lista = new ChoiceBoxListCell<String>("New York", "Orlando", "London", "Manchester");

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}