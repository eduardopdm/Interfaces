module es.javafx.org.practica_interfaces {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.javafx.org.luis_cuadrado_guerra_practica1 to javafx.fxml;
    exports es.javafx.org.luis_cuadrado_guerra_practica1;
}