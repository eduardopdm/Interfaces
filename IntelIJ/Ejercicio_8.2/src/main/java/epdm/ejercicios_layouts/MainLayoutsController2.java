package epdm.ejercicios_layouts;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;

public class MainLayoutsController2 {

    @FXML
    ComboBox<Object> cbLocations;

    @FXML
    ComboBox<Object> cbLanguages;


    public void initialize() {
        cbLocations.getItems().add("New York");
        cbLocations.getItems().add("Orlando");
        cbLocations.getItems().add(new Separator());
        cbLocations.getItems().add("London");
        cbLocations.getItems().add("Manchester");

        cbLanguages.getItems().add("English");
        cbLanguages.getItems().add("Japanese");
        cbLanguages.getItems().add("Spanish");
    }
}