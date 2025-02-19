package epdm.eduardo_perezdemadrid_rodriguez_practica1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Practica1App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("javafx.version"));

        FXMLLoader fxmlLoader = new FXMLLoader(Practica1App.class.getResource("practica1.fxml"));
        fxmlLoader.setLocation(Practica1App.class.getResource("practica1.fxml"));
        fxmlLoader.setController(new Practica1Controller());

        BorderPane root = fxmlLoader.load();

        Practica1Controller controller = fxmlLoader.getController();
        controller.setRootLayout(root);

        Scene scene = new Scene(root);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}