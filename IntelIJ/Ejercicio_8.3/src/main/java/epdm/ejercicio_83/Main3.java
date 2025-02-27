package epdm.ejercicio_83;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main3 extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private AnchorPane personLayout;

    private ObservableList<Person> persons = FXCollections.observableArrayList();

//    private ObservableList<Map<String, Object>> mapData = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    public Main3() {
        persons.add(new Person("Hans", "Muster"));
        persons.add(new Person("Anna", "Lieber"));
        persons.add(new Person("Kenzo", "Tenma"));
        persons.add(new Person("Martin", "Martinete"));
        persons.add(new Person("AAAAAA", "AAAAAA"));
        persons.add(new Person("BBBBBB", "BBBBBBB"));

//        Map<String, Object> map = new HashMap<>();
//        map.put("name", "Hans");
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");
        initRootLayout();
        showPersonOverview();
    }

    /**
     * Inicializa el diseño de la pantalla principal.
     */
    public void initRootLayout() {
        try {
            // Carga el XML con el diseño principal
            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(Main3.class.getResource("RootLayout.fxml"));
            rootLayout = loader.load();

            // Se añade el diseño principal a la escena
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Muestra el diseño de PersonOverview dentro de la pantalla
     * principal
     */
    public void showPersonOverview() {
        try {
            // Cargamos el archivo PersonOverview
            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(Main3.class.getResource("PersonOverview.fxml"));
            AnchorPane personOverview = loader.load();

            // Se sitúa en el centro del diseño principal
            rootLayout.setCenter(personOverview);

            Controller3 controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Returns the main stage.
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public ObservableList<Person> getPersons() {
        return persons;
    }

//    public ObservableList<Map<String, Object>> getMapData() {
//        return mapData;
//    }
}

