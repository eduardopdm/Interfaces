module es.accesodatos.ejemplos.proyecto_01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.accesodatos.ejemplos.proyecto_01 to javafx.fxml;
    exports es.accesodatos.ejemplos.proyecto_01;
}