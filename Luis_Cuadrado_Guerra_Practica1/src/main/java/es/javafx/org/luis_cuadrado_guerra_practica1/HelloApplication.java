package es.javafx.org.luis_cuadrado_guerra_practica1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Pane root;

    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("javafx.version"));

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setController(new HelloController());

        root = fxmlLoader.load();

        HelloController controller = fxmlLoader.getController();
        controller.setRootLayout(root);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}