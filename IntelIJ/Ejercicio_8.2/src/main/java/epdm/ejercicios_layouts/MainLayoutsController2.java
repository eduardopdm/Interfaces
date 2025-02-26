package epdm.ejercicios_layouts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MainLayoutsController2 {
    @FXML
    ComboBox<Object> cbLanguages;
    @FXML
    ComboBox<Object> cbLocations;
    @FXML
    ListView<String> lvQualifications;
    @FXML
    TreeView<String> tvData;

    @FXML
    private ObservableList<String> names = FXCollections.observableArrayList();
    @FXML
    private ObservableList<String> data = FXCollections.observableArrayList();


    @FXML
    public void initialize() {
//        cbLanguages.getItems().add("English");
//        cbLanguages.getItems().add("Japanese");
//        cbLanguages.getItems().add("Spanish");

        cbLanguages.getItems().addAll("English", "Japanese", "Spanish", "Portuguese");

//        cbLocations.getItems().add("New York");
//        cbLocations.getItems().add("Orlando");
//        cbLocations.getItems().add(new Separator());
//        cbLocations.getItems().add("London");
//        cbLocations.getItems().add("Manchester");

        cbLocations.setItems(FXCollections.observableArrayList("New York", "Orlando", new Separator(), "London", "Manchester"));

        names.addAll(
                "Objects",
                "Classes",
                "Functions",
                "Variables",
                "Compiler",
                "Debugger",
                "Projects",
                "Beans",
                "Libraries",
                "Modules",
                "JARs");

        for (int i = 0; i < 10; i++) {
            data.addAll("Indeterminate (pick a choice)");
        }
        lvQualifications.setItems(data);
        lvQualifications.setCellFactory(ComboBoxListCell.forListView(names));


        ImageView imageView = new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/img/Folder.png"))));
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(20);

        TreeItem<String> root = new TreeItem<>("Inbox", imageView);
        root.setExpanded(true);

        List<String> treeListItems = new ArrayList<>(List.of("Sales", "Marketing", "Distribution", "Costs"));

        for (String item : treeListItems) {
            TreeItem<String> treeItem = new TreeItem<>(item);
            root.getChildren().add(treeItem);
        }

        tvData.setRoot(root);
    }
}