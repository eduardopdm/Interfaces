module epdm.ejercicio_83 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens epdm.ejercicio_83 to javafx.fxml;
    exports epdm.ejercicio_83;
}